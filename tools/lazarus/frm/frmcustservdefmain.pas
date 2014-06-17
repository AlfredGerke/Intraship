unit frmCustServDefMain;

{$mode Delphi}{$H+}

interface

uses
  Classes, SysUtils, FileUtil, Forms, Controls, Graphics, Dialogs, StdCtrls,
  Buttons, ExtCtrls;

const
  READ = False;
  WRITE = True;

  INTRASHIP_WS_DE = 'intraship.ws.de';
  INTRASHIPSERVICE_WS_DE_ISSERVICE_1_0_DE = 'intrashipservice.ws.de.isservice_1_0_de';

type

  { TCustServDefMain }

  TCustServDefMain = class(TForm)
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
    pnlBottom: TPanel;
    pnlClient: TPanel;
    btnServiceDef: TSpeedButton;
    procedure FormClose(Sender: TObject; var CloseAction: TCloseAction);
    procedure FormCreate(Sender: TObject);
  private

    function GetInifileName: string;
    procedure ReadWriteInfo(aRead: boolean);
  public

  end;

var
  CustServDefMain: TCustServDefMain;

implementation

{$R *.lfm}

uses
  Inifiles;

{ TCustServDefMain }


{------------------------------------------------------------------------------}
procedure TCustServDefMain.FormCreate(Sender: TObject);
begin
  ReadWriteInfo(READ);
end;

procedure TCustServDefMain.FormClose(Sender: TObject;
  var CloseAction: TCloseAction);
begin
  ReadWriteInfo(WRITE);
end;

{------------------------------------------------------------------------------}
function TCustServDefMain.GetInifileName: string;
var
  dir: string;
  file_name: String;
begin
  dir := ExtractFileDir(Application.ExeName);
  file_name:= ExtractFileName(Application.ExeName);
  dir := IncludeTrailingPathDelimiter(dir);
  file_name := ChangeFileExt(file_name, '.ini');
  Result := dir + file_name;
end;

{------------------------------------------------------------------------------}
procedure TCustServDefMain.ReadWriteInfo(aRead: boolean);
var
  ini: TIniFile;
  ini_filename: string;
begin
  ini_filename := GetInifileName;
  ini := TIniFile.Create(ini_filename);
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

end.

