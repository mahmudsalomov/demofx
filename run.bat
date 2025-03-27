@echo off
setlocal

REM Define JavaFX module path
set MODULE_PATH="C:\Users\d.tursunkhodjaev\.jdks\openjfx-17.0.8_windows-x64_bin-sdk\javafx-sdk-17.0.8\lib"

REM Define JavaFX modules
set MODULES=javafx.controls,javafx.fxml

REM Run the Java application
java --module-path %MODULE_PATH% --add-modules %MODULES% -jar out\artifacts\demofx_jar\demofx.jar

endlocal
