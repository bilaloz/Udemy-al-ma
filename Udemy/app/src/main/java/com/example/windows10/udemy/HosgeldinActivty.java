package com.example.windows10.udemy;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class HosgeldinActivty extends Activity {

    MediaPlayer calgici;

    @Override
    protected void onPause() {
        super.onPause();
        calgici.release();
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);
        calgici = MediaPlayer.create(getApplicationContext(),R.raw.sago);
        calgici.start();


        Thread zamanlayici = new Thread(){

            public void run () {

                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(HosgeldinActivty.this,Menu.class);
                    startActivity(intent);
                }

            }

        };zamanlayici.start();





    }
}
