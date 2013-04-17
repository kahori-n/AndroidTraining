Practice Report for 1.4
------

実習のレポートを下記に記述してください

1. (実習)Android SDK 内の、下記の 2 つのディレクトリにあるコマンドを列挙してください。
### sdk/tools/
- android
- apkbuilder
- ddms
- dmtracedump
- draw9patch
- emulator
- emulator-arm
- emulator-mips
- emulator-x86
- emulator64-arm
- emulator64-mips
- emulator64-x86
- etc1tool
- hierarchyviewer
- hprof-conv
- jobb
- lint
- mksdcard
- monitor
- monkeyrunner
- sqlite3
- traceview
- uiautomatorviewer
- zipalign

### sdk/platform-tools/
- aapt
- adb
- aidl
- dexdump
- dx
- fastboot
- llvm-rs-cc

2. (実習)上記のディレクトリにパスを通し、下記のコマンドを実行してください。
### adb devices
90201681n:~ kahori.nagasawa$ adb devices
List of devices attached 
343079938F9E00EC	device

### adb shell
90201681n:~ kahori.nagasawa$ adb shell
shell@android:/ $ 

3. (実習)adb shellコマンドを使って、Android 内のファイルシステムにアクセスし、下記の項目を確認してください。
### /data/data以下のディレクトリでlsコマンドを打っても、拒否されること
shell@android:/ $ cd /data/data
shell@android:/data/data $ ls
opendir failed, Permission denied

### /sdcard/Android/data以下のディレクトリの中身を自由に読むことができること
shell@android:/data/data $ cd /sdcard/Android/data
shell@android:/sdcard/Android/data $ ls
com.android.browser
com.android.providers.media
com.belugapods.beluga
com.cooliris.media
com.google.android.apps.books
com.google.android.apps.currents
com.google.android.apps.genie.geniewidget.news-content-cache
com.google.android.apps.magazines
com.google.android.apps.maps
com.google.android.apps.plus
com.google.android.gallery3d
com.google.android.music
com.google.android.videos
com.google.android.youtube
com.google.earth
jp.colopl
jp.softbank.mb.mediaplayer
org.mozilla.firefox



