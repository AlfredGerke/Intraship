unit frmCustServDefMain;

{$mode Delphi}{$H+}

interface

uses
  Classes, SysUtils, FileUtil, Forms, Controls, Graphics, Dialogs, StdCtrls,
  Buttons, ExtCtrls, ActnList, ComCtrls, CheckLst;

type

  { TCustServDefMain }

  TCustServDefMain = class(TForm)
    acList: TActionList;
    acGetPackageDir1: TAction;
    acGetPackageDir2: TAction;
    acGetServiceDev: TAction;
    acSetSelection: TAction;
    acCustomize: TAction;
    btnClose: TBitBtn;
    btnFind: TSpeedButton;
    btnPackageDir1: TSpeedButton;
    btnPackageDir2: TSpeedButton;
    btnCustomize: TButton;
    cbxlstSelect: TCheckListBox;
    edtServiceDef: TEdit;
    edtPackageDir1: TEdit;
    edtPackageDir2: TEdit;
    Label1: TLabel;
    lblSelect: TLabel;
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
    procedure acCustomizeExecute(Sender: TObject);
    procedure acGetPackageDir1Execute(Sender: TObject);
    procedure acGetPackageDir2Execute(Sender: TObject);
    procedure acGetServiceDevExecute(Sender: TObject);
    procedure acSetSelectionExecute(Sender: TObject);
    procedure btnCustomizeClick(Sender: TObject);
    procedure FormClose(Sender: TObject; var CloseAction: TCloseAction);
    procedure FormCreate(Sender: TObject);
  private
    FIniFilename: string;
    FFileListByPackageDir1: TStrings;
    FFileListByPackageDir2: TStrings;
    FServiceDefStrings: TStrings;

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
procedure TCustServDefMain.InitProgress(aMax: integer);
begin
  pbProgress.Step:=1;
  pbProgress.Min:=0;
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

  // 1. Dateien aus PackageDir1 für Package: intrashipservice.ws.de.isservice_1_0_de
  GetFilesByDir(dir1, FFileListByPackageDir1, '*.java');
  pbProgress.StepIt;

  // 2. Dateien aus PackageDir2 für Package: intraship.ws.de
  GetFilesByDir(dir2, FFileListByPackageDir2, '*.java');
  pbProgress.StepIt;

  // 3. servicedef.xml laden
  FServiceDefStrings.LoadFromFile(service_def);
  pbProgress.StepIt;

  // 4. Dateien des Package: intraship.ws.de prüfen
  GetSelectByServiceDef(FFileListByPackageDir1, FServiceDefStrings,
    INTRASHIP_WS_DE, INTRASHIPSERVICE_WS_DE_ISSERVICE_1_0_DE, cbxlstSelect);
  pbProgress.StepIt;

  // 5. Dateien des Package: intrashipservice.ws.de.isservice_1_0_de
  GetSelectByServiceDef(FFileListByPackageDir2, FServiceDefStrings,
    INTRASHIPSERVICE_WS_DE_ISSERVICE_1_0_DE, INTRASHIP_WS_DE, cbxlstSelect);
  pbProgress.StepIt;

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
  InitProgress(1);
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

procedure TCustServDefMain.btnCustomizeClick(Sender: TObject);
begin

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

