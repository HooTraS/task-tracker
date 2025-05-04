@echo off
:: Проверка наличия Git Bash
where bash >nul 2>nul
if errorlevel 1 (
    echo Git Bash не найден. Пожалуйста, установите Git for Windows: https://git-scm.com/downloads
    pause
    exit /b
)

:: Запуск скрипта через Git Bash
bash setup_git_branches.sh
