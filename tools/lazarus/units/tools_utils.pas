unit tools_utils;

{$mode Delphi}{$H+}

interface

uses
  Classes,
  SysUtils,
  StdCtrls;

procedure GetFilesByDir(aDirectory: string;
                        aFilelist: TStrings;
                        aMask: string = '*.java');
function GetInifileName: string;
function GetInitDirByEditControl(aEditControl: TEdit): string;

implementation

uses
  Forms;

{------------------------------------------------------------------------------}
procedure GetFilesByDir(aDirectory: string;
  aFilelist: TStrings;
  aMask: string = '*.java');
var
  search_rec:TSearchRec;
  dir: string;
  found: boolean;
begin
  aFilelist.Clear;
  dir := IncludeTrailingPathDelimiter(aDirectory) + aMask;
  found := (FindFirst(dir, faAnyFile-faDirectory, search_rec) = 0);
  try
    while found do
    begin
      aFilelist.add(search_rec.Name);
      found := (FindNext(search_rec) = 0);
    end;
  finally
    FindClose(search_rec);
  end
end;

{------------------------------------------------------------------------------}
function GetInifileName: string;
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
function GetInitDirByEditControl(aEditControl: TEdit): string;
begin
  if (Trim(aEditControl.Text) = EmptyStr) then
    Result := ExtractFileDir(Application.ExeName)
  else
    Result := aEditControl.Text;
end;

end.

