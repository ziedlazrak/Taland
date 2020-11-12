package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {


    VideoView videoView;
    private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        videoView =(VideoView)findViewById(R.id.videoView2);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.aa);
        videoView.setVideoURI(video);
        videoView.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent mySuperIntent = new Intent(MainActivity.this, Signin.class);
                startActivity(mySuperIntent);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
                finish();


            }
        }, SPLASH_TIME_OUT);


    }
}