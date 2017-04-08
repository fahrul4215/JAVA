@echo OFF
title file Batch IMK
echo.

:menu
echo.
echo ===================================================
echo =               Program Kalkulator                =
echo ===================================================
echo =                                                 =
echo =                 [1] Perkalian                   =
echo =                 [2] Penambahan                  =
echo =                 [3] Pembagian                   =
echo =                 [4] Pengurangan                 =
echo =                 [5] keluar                      =
echo =                                                 =
echo ===================================================
echo.
set/p "pil=Pilihan anda: "
if %pil%==5 goto selesai
rem if %pil% LEQ 0 goto errorMenu
rem if %pil% GEQ 6 goto errorMenu
echo.
set/p "b1=Masukan Bilangan Ke-1: "
set/p "b2=Masukan Bilangan Ke-2: "
if %pil%==1 goto kali
if %pil%==2 goto tambah
If %pil%==3 goto bagi
if %pil%==4 goto kurang 

:kali
echo.
set/a b=b1*b2
echo Hasil Kalinya Adalah = %b%
pause
goto menu

:tambah
echo.
set/a b=b1+b2
echo Hasil Pertambahan Adalah= %b%
pause
goto menu

:bagi
echo.
set/a b=b1/b2
echo Hasil Pembagian Adalah= %b%
pause
goto menu

:kurang
echo.
set/a b=b1-b2
echo Hasil Pengurangan Adalah= %b%
pause
goto menu

:selesai
echo.
set/p "pil=Yakin ingin keluar?[0/1] : "
rem if %pil% LEQ -1 goto errorSelesai
rem if %pil% GEQ 2 goto errorSelesai
if %pil%==1 goto exit
if %pil%==0 pause
cls 
goto menu

rem :errorMenu
rem echo Pilihan tidak ada!!! 
rem pause
rem goto menu

rem :errorSelesai
rem echo.
rem echo Pilihan tidak ada!!!
rem pause
rem goto selesai