<manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.samsung.android.app.stepdiary"
        android:versionCode="1"
        android:versionName="1.0" >

<uses-permission android:name="android.permission.INTERNET" />

<queries>
<package android:name="com.sec.android.app.shealth" />
</queries>

<application
        android:allowBackup="true"
                android:icon="@drawable/ic_launcher"
                android:label="@string/app_name"
                android:theme="@style/AppTheme" >
<meta-data
        android:name="com.samsung.android.health.permission.read"
        android:value="com.samsung.health.step_count;com.samsung.shealth.step_daily_trend" />

<activity
            android:name=".StepDiaryActivity"
                    android:label="@string/app_name"
                    android:screenOrientation="portrait" >
<intent-filter>
<action android:name="android.intent.action.MAIN" />

<category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
</activity>
</application>

</manifest>