package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

/**
 * Created by bulut on 20.07.2017.
 */

public class MainActivity extends AppCompatActivity {
    //*** SONUÇ ***
    // Aşağıdaki metotlar içinde 2 metot çalışmadı: onActivityResult ve onAttachFragment
    //*************
    private final String TAG = "BulutColak_Kodluyoruz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        Log.e(TAG, "onCreate");
    }


    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(TAG, "onContentChanged ");
    }


    @Override
    protected void onStart() {
             super.onStart();
        Log.e(TAG, "onStart");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        //***NOT***
        //Bu metot sistem tarafından kapatılan aktivitlerde çalışıyor.
        //Kapanma anındaki verileri kaydedip geri dönüldüğünde gösteriyor.
        //Bizim testlerimizde telefon yan çevrildiğinde uygulama sistem tarafından kapatılıp
        // yeniden açıldığı için çalıştı.
        super.onRestoreInstanceState(savedInstanceState);

        Log.e(TAG, "onRestoreInstanceState");
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(TAG, "onPostCreate");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG, "onAttachedToWindow");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(TAG, "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(TAG, "onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }


    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(TAG, "onUserInteraction");
    }


    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(TAG, "onUserLeaveHint");
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        //Farklı bir uygulamadan parametre alarak çalışan bir metottur.
        //Başka bir uygulama ile bağlantı yapılmadığından çalışmadı.

        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "onActivityResult");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }


    @Override
    public void onAttachFragment(Fragment fragment) {

        //Fragment'ı başlatan metottur.
        //Uygulamamızda fragment olmadığı için çalışmadı.

        super.onAttachFragment(fragment);
        Log.e(TAG, "onAttachFragment");
     }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "onConfigurationChanged");
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(TAG, "onBackPressed");
    }

}
