set projectLocation=D:\eclipse-workspace\Java_Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNg %projectLocation%\testng.xml
