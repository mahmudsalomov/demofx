@echo off
setlocal

REM Define JavaFX module path
set MODULE_PATH="openjfx-17.0.8_windows-x64_bin-sdk\javafx-sdk-17.0.8\lib"
set LIB_PATH="libs\*"

REM Define JavaFX modules
set MODULES=javafx.controls,javafx.fxml

REM Run the Java application
corretto-17.0.8.1\bin\java --module-path %MODULE_PATH% --add-modules %MODULES% -jar target\demofx-1.0-SNAPSHOT.jar

endlocal
