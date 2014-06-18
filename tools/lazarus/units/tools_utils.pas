unit tools_utils;

{$mode Delphi}{$H+}

interface

uses
  Classes,
  SysUtils,
  StdCtrls,
  CheckLst;

procedure GetSelectByServiceDef(aFileList: TStrings;
                                aServiceDef: TStrings;
                                aSourcePackage: string;
                                aTargetPackage: string;
                                aSelectCtrl: TCheckListBox);
procedure GetFilesByDir(aDirectory: string;
                        aFilelist: TStrings;
                        aMask: string = '*.java');
function GetInifileName: string;
function GetInitDirByEditControl(aEditControl: TEdit): string;

implementation

uses
  Forms,
  FileUtil;

{------------------------------------------------------------------------------}
procedure GetSelectByServiceDef(aFileList: TStrings;
  aServiceDef: TStrings;
  aSourcePackage: string;
  aTargetPackage: string;
  aSelectCtrl: TCheckListBox);
var
  item_value_to_check: string;
  anz_files: integer;
  anz_lines: integer;
  service_def_line: string;
  filename_without_ext: string;
begin
  // 4. Dateien des Package: intraship.ws.de prüfen
  for anz_files := 0 to aFileList.Count-1 do
  begin
    filename_without_ext := aFileList.Strings[anz_files];
    filename_without_ext := ExtractFileNameWithoutExt(filename_without_ext);
    item_value_to_check := aSourcePackage + '.' + filename_without_ext;

    for anz_lines:=1 to aServiceDef.Count-1 do
    begin
      service_def_line := aServiceDef.Strings[anz_lines];
      if (Pos(item_value_to_check, service_def_line) > 0) then
      begin
        aSelectCtrl.Items.Add(Format('%s: %s -> %s', [filename_without_ext, aSourcePackage, aTargetPackage]));
        Break;
      end;
    end;
  end;
end;

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

