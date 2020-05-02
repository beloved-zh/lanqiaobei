@echo off
set "path1.8=D:\tool\jdk1.8.0_191"
set "path1.6=D:\tool\jdk1.6.0_45"
echo 当前JAVA环境是： %JAVA_HOME%
if %JAVA_HOME% == %path1.8% (echo 是否修改为%path1.6%) else (echo 是否修改为%path1.8%)

pause

if %JAVA_HOME% == %path1.8% (setx /m JAVA_HOME  %path1.6%) else (setx /m JAVA_HOME  %path1.8%)

pause