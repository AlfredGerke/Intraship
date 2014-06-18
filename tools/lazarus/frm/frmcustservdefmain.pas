unit frmCustServDefMain;

{$mode Delphi}{$H+}

interface

uses
  Classes,
  SysUtils,
  FileUtil,
  Forms,
  Controls,
  Graphics,
  Dialogs,
  StdCtrls,
  Buttons,
  ExtCtrls,
  ActnList,
  ComCtrls,
  CheckLst;

type

  { TCustServDefMain }

  TCustServDefMain = class(TForm)
    acList: TActionList;
    acGetPackageDir1: TAction;
    acGetPackageDir2: TAction;
    acGetServiceDev: TAction;
    acSetSelection: TAction;
    acCustomize: TAction;
    acCheckSelection: TAction;
    btnClose: TBitBtn;
    btnFind: TSpeedButton;
    btnPackageDir1: TSpeedButton;
    btnPackageDir2: TSpeedButton;
    btnCustomize: TButton;
    cbxlstSelect: TCheckListBox;
    cbxSelect: TCheckBox;
    edtServiceDef: TEdit;
    edtPackageDir1: TEdit;
    edtPackageDir2: TEdit;
    Label1: TLabel;
    lblNewServeDef: TLabel;
    lblServiceDef: TLabel;
    lblPackage1: TLabel;
    lblPackage2: TLabel;
    dlgOpen: TOpenDialog;
    pnlBottom: TPanel;
    pnlClient: TPanel;
    btnServiceDef: TSpeedButton;
    dlgSelectDir: TSelectDirectoryDialog;
    pbProgress: TProgressBar;
    procedure acCheckSelectionExecute(Sender: TObject);
    procedure acCustomizeExecute(Sender: TObject);
    procedure acGetPackageDir1Execute(Sender: TObject);
    procedure acGetPackageDir2Execute(Sender: TObject);
    procedure acGetServiceDevExecute(Sender: TObject);
    procedure acSetSelectionExecute(Sender: TObject);
    procedure FormClose(Sender: TObject; var CloseAction: TCloseAction);
    procedure FormCreate(Sender: TObject);
  private
    FIniFilename: string;
    FFileListByPackageDir1: TStrings;
    FFileListByPackageDir2: TStrings;
    FServiceDefStrings: TStrings;

    procedure CustomizeServiceDef;
    procedure StepItWihtText(aText: string;
                             aStepIt: boolean = True);
    procedure SaveNewSettingsForServiceDef;
    procedure InitProgress(aMax: integer);
    procedure SetSelection;
    function GetInitDirForPackage1: string;
    function GetInitDirForPackage2: string;
    function GetInitDirForServiceDef: string;
    procedure ReadWriteInfo(aRead: boolean);
    procedure Init;
    procedure Done;
  public

  end;

var
  CustServDefMain: TCustServDefMain;

implementation

{$R *.lfm}

uses
  Inifiles,
  tools_utils,
  tools_const;

{ TCustServDefMain }

{------------------------------------------------------------------------------}
procedure TCustServDefMain.FormCreate(Sender: TObject);
begin
  Init;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.CustomizeServiceDef;
var
  anz_files: integer;
  anz_lines: integer;
  item: string;
  orig_filename: string;
  from_package: string;
  to_package: string;
  list: TStrings;
  do_save_service_dev: boolean;
begin
  do_save_service_dev := False;

  Screen.Cursor:=crHourGlass;

  InitProgress(cbxlstSelect.Items.Count+1);
  try
    for anz_files:=0 to cbxlstSelect.Items.Count-1 do
    begin
      if cbxlstSelect.Checked[anz_files] then
      begin
        item := Trim(cbxlstSelect.Items.Strings[anz_files]);
        item := StringReplace(item, ':', #13, [rfReplaceAll]);
        item := StringReplace(item, '->', #13, [rfReplaceAll]);

        list := TStringList.Create;
        try
          list.Text := item;
          if (list.count = 3) then
          begin
            orig_filename := Trim(list.Strings[0]);
            from_package := Trim(list.Strings[1]) + '.' + orig_filename;
            to_package := Trim(list.Strings[2]) + '.' + orig_filename;

            StepItWihtText(orig_filename, False);
            for anz_lines := 0 to FServiceDefStrings.Count-1 do
            begin
              item := FServiceDefStrings.Text;
              item := StringReplace(item, from_package, to_package, [rfReplaceAll]);
              FServiceDefStrings.Text := item;

              if not do_save_service_dev then
                do_save_service_dev := True;
            end;
          end;
        finally
          if Assigned(list) then
            FreeAndNil(list);
        end;
      end;

      pbProgress.StepIt;
    end;

    if do_save_service_dev then
      SaveNewSettingsForServiceDef
    else
      MessageDlg('Es wurden keine Änderungen vorgenommen!', mtInformation, [mbOK], 0);

    pbProgress.StepIt;
  finally
    Screen.Cursor := crDefault;
  end;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.StepItWihtText(aText: string;
  aStepIt: boolean = True);
begin
  pbProgress.Caption := aText;
  if aStepIt then
    pbProgress.StepIt;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.SaveNewSettingsForServiceDef;
var
  orig_filename: string;
  new_filename: string;
  counter: integer;
begin
  orig_filename := edtServiceDef.Text;
  counter := 0;

  repeat
    Inc(counter);
    new_filename := Format('%s_new_%.8d', [orig_filename, counter]);
  until not FileExists(new_filename);

  FServiceDefStrings.SaveToFile(new_filename);

  lblNewServeDef.Caption := ExtractFileName(new_filename);

  MessageDlg(Format('Folgende Datei angelegt: %s', [new_filename]), mtInformation, [mbOK], 0);
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.InitProgress(aMax: integer);
begin
  pbProgress.Step:=1;
  pbProgress.Min:=0;
  pbProgress.Max:=0;
  Application.ProcessMessages;
  pbProgress.Max:=aMax;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.SetSelection;
var
  dir1: string;
  dir2: string;
  service_def: string;
begin
  dir1 := edtPackageDir1.Text;
  dir2 := edtPackageDir2.Text;
  service_def := edtServiceDef.Text;
  cbxlstSelect.Items.Clear;
  cbxSelect.Checked := False;
  lblNewServeDef.Caption := '<keine Datei>';

  InitProgress(7);

  if not DirectoryExists(dir1) or not DirectoryExists(dir2) then
  begin
    MessageDlg('Verzeichnisse für die Packages überprüfen!', mtWarning, [mbOK], 0);
    Exit;
  end;
  pbProgress.StepIt;

  if not Assigned(FServiceDefStrings) or not FileExists(service_def) then
  begin
    MessageDlg('servicedef.xml kann nicht geladen werden!', mtWarning, [mbOK], 0);
    Exit;
  end;
  pbProgress.StepIt;

  Screen.Cursor := crHourGlass;
  try
    // 1. Dateien aus PackageDir1 für Package: intrashipservice.ws.de.isservice_1_0_de
    GetFilesByDir(dir1, FFileListByPackageDir1, '*.java');
    StepItWihtText('intrashipservice.ws.de.isservice_1_0_de');

    // 2. Dateien aus PackageDir2 für Package: intraship.ws.de
    GetFilesByDir(dir2, FFileListByPackageDir2, '*.java');
    StepItWihtText('intraship.ws.de');

    // 3. servicedef.xml laden
    FServiceDefStrings.LoadFromFile(service_def);
    StepItWihtText('servicedef.xml laden');

    // 4. Dateien des Package: intraship.ws.de prüfen
    GetSelectByServiceDef(FFileListByPackageDir1, FServiceDefStrings,
      INTRASHIP_WS_DE, INTRASHIPSERVICE_WS_DE_ISSERVICE_1_0_DE, cbxlstSelect);
    StepItWihtText('Dateien des Package: intraship.ws.de prüfen');

    // 5. Dateien des Package: intrashipservice.ws.de.isservice_1_0_de
    GetSelectByServiceDef(FFileListByPackageDir2, FServiceDefStrings,
      INTRASHIPSERVICE_WS_DE_ISSERVICE_1_0_DE, INTRASHIP_WS_DE, cbxlstSelect);
    StepItWihtText('Dateien des Package: intrashipservice.ws.de.isservice_1_0_de');
  finally
    Screen.Cursor := crDefault;
  end;

end;

{------------------------------------------------------------------------------}
function TCustServDefMain.GetInitDirForPackage1: string;
begin
  Result := GetInitDirByEditControl(edtPackageDir1);
end;

{------------------------------------------------------------------------------}
function TCustServDefMain.GetInitDirForPackage2: string;
begin
  Result := GetInitDirByEditControl(edtPackageDir2);
end;

{------------------------------------------------------------------------------}
function TCustServDefMain.GetInitDirForServiceDef: string;
begin
  Result := GetInitDirByEditControl(edtServiceDef);
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.FormClose(Sender: TObject;
  var CloseAction: TCloseAction);
begin
  Done;
  CloseAction := caFree;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.acGetPackageDir1Execute(Sender: TObject);
begin
  dlgSelectDir.InitialDir := GetInitDirForPackage1;
  if dlgSelectDir.Execute then
    edtPackageDir1.Text := dlgSelectDir.FileName;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.acCustomizeExecute(Sender: TObject);
begin
  CustomizeServiceDef;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.acCheckSelectionExecute(Sender: TObject);
begin
  cbxlstSelect.CheckAll(cbxSelect.State, False, False);
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.acGetPackageDir2Execute(Sender: TObject);
begin
  dlgSelectDir.InitialDir := GetInitDirForPackage2;
  if dlgSelectDir.Execute then
    edtPackageDir2.Text := dlgSelectDir.FileName;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.acGetServiceDevExecute(Sender: TObject);
begin
  dlgOpen.InitialDir := GetInitDirForServiceDef;
  if dlgOpen.Execute then
    edtServiceDef.Text := dlgOpen.Filename;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.acSetSelectionExecute(Sender: TObject);
begin
  SetSelection;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.ReadWriteInfo(aRead: boolean);
var
  ini: TIniFile;
begin
  ini := TIniFile.Create(FIniFilename);
  try
    with ini do
    begin
      case aRead of
        READ:
        begin
          edtPackageDir1.text := ReadString('settings', 'dir1', '');
          edtPackageDir2.text := ReadString('settings', 'dir2', '');
          edtServiceDef.text := ReadString('settings', 'servicedef', '');
        end;
        WRITE:
        begin
          WriteString('settings', 'dir1', edtPackageDir1.text);
          WriteString('settings', 'dir2', edtPackageDir2.text);
          WriteString('settings', 'servicedef', edtServiceDef.text);
        end;
      end;
    end;
  finally
    if Assigned(ini) then
      FreeAndNil(ini);
  end;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.Init;
begin
  FIniFilename := GetInifileName;
  FFileListByPackageDir1 := TStringList.Create;
  FFileListByPackageDir2 := TStringList.Create;
  FServiceDefStrings := TStringList.Create;

  ReadWriteInfo(READ);
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.Done;
begin
  ReadWriteInfo(WRITE);

  if Assigned(FServiceDefStrings) then
    FreeAndNil(FServiceDefStrings);

  if Assigned(FFileListByPackageDir1) then
    FreeAndNil(FFileListByPackageDir1);

  if Assigned(FFileListByPackageDir2) then
    FreeAndNil(FFileListByPackageDir2);
end;

end.
