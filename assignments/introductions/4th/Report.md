Assignment Report for 1.4
------

以下に、課題の回答を記入してください。

Android の基礎知識
======

4. `adb`コマンドを使って、下記の項目を実行してください（課題のファイルに、実行したコマンドを記録しておいてください）。

### 端末のSD カード領域に、ローカルにあるファイルを転送する
```
90201681n:~ kahori.nagasawa$ adb push ~/Pictures/hashibiro1.png /sdcard/  
2011 KB/s (106687 bytes in 0.051s)
```

### 端末のSD カード領域から、ローカルにファイルを転送する
```
90201681n:~ kahori.nagasawa$ adb pull /sdcard/DCIM/Camera/1305935957542.jpg ~/
2009 KB/s (210219 bytes in 0.102s)
90201681n:~ kahori.nagasawa$ ls
1305935957542.jpg   Desktop         Library         Public          sdk
AndroidTraining     Documents       Movies          User Data
Bookmarks       Downloads       Music           eclipse
Bookmarks.bak       FirstProject.apk    Pictures        hoge.keystore
```

### 課題用サンプルプロジェクトの apk ファイルをコマンド経由で端末にインストールする
```
90201681n:~ kahori.nagasawa$ adb install FirstProject.apk 
2368 KB/s (196016 bytes in 0.080s)
    pkg: /data/local/tmp/FirstProject.apk
Success 
```

### インストールしたアプリを、コマンド経由でアンインストールする
```
90201681n:~ kahori.nagasawa$ adb uninstall com.example.firstproject
Success
```
