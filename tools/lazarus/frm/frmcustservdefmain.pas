unit frmCustServDefMain;

{$mode Delphi}{$H+}

interface

uses
  Classes, SysUtils, FileUtil, Forms, Controls, Graphics, Dialogs, StdCtrls,
  Buttons, ExtCtrls, ActnList, ComCtrls;

type

  { TCustServDefMain }

  TCustServDefMain = class(TForm)
    acList: TActionList;
    acGetPackageDir1: TAction;
    acGetPackageDir2: TAction;
    acGetServiceDev: TAction;
    acSetSelection: TAction;
    btnClose: TBitBtn;
    btnFind: TSpeedButton;
    btnPackageDir1: TSpeedButton;
    btnPackageDir2: TSpeedButton;
    btnCustomize: TButton;
    cbxgrpSelect: TCheckGroup;
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
procedure TCustServDefMain.SetSelection;
var
  dir1: string;
  dir2: string;
begin
  dir1 := edtPackageDir1.Text;
  dir2 := edtPackageDir2.Text;

  if not DirectoryExists(dir1) or not DirectoryExists(dir2) then
  begin
    MessageDlg('Verzeichnisse für die Packages überprüfen!', mtWarning, [mbOK], 0);
    Exit;
  end;

  GetFilesByDir(dir1, FFileListByPackageDir1, '*.java');
  GetFilesByDir(dir2, FFileListByPackageDir2, '*.java');
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

  ReadWriteInfo(READ);
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.Done;
begin
  ReadWriteInfo(WRITE);

  if Assigned(FFileListByPackageDir1) then
    FreeAndNil(FFileListByPackageDir1);

  if Assigned(FFileListByPackageDir2) then
    FreeAndNil(FFileListByPackageDir2);
end;

end.

