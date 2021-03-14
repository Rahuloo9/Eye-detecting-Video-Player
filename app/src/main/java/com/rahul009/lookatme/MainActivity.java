package com.rahul009.lookatme;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



         LookAtMe lookAtMe;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mahak));
        // lookAtMe.setVideoPath("http://website.com/video/mp4/62000/62792m.mp4"); to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}