package com.hannestly.soundtest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void playSound(View view){
      int id = view.getId();
      String myId = "";

      myId = view.getResources().getResourceEntryName(id);

      int resourceId = getResources().getIdentifier(myId,"raw","com.hannestly.soundtest");
      MediaPlayer mediaPlayer = MediaPlayer.create(this,resourceId);
      mediaPlayer.start();
      Log.i("tag", myId);
    }
}
