package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    MediaPlayer player;
    public void play(View v){

        if(player==null) {
            player = MediaPlayer.create(this, R.raw.justified);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause(View v){
        if(player!=null){
            //player.pause();
            int currentpos = player.getCurrentPosition() ;
            if((currentpos+5000)>=0 ){
                player.seekTo(currentpos+5000);
            }
        }

    }

    public void stop(View v){
        stopPlayer();
    }

    private void stopPlayer(){
        if(player!=null){
            player.release();
            player=null;
            Toast.makeText(this,"media player released",Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected  void onStop(){
        super.onStop();
        stopPlayer();
    }
}