@echo off
set "path1.8=D:\tool\jdk1.8.0_191"
set "path1.6=D:\tool\jdk1.6.0_45"
echo ��ǰJAVA�����ǣ� %JAVA_HOME%
if %JAVA_HOME% == %path1.8% (echo �Ƿ��޸�Ϊ%path1.6%) else (echo �Ƿ��޸�Ϊ%path1.8%)

pause

if %JAVA_HOME% == %path1.8% (setx /m JAVA_HOME  %path1.6%) else (setx /m JAVA_HOME  %path1.8%)

pause