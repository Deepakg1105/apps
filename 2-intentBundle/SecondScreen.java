package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Toast toast = Toast.makeText(this, "Started Second acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("data1");
        String id = bundle.getString("data2");


        TextView textView = (TextView)findViewById(R.id.screen2Text);
        textView.setText("Welcome " + name + " ID is " + id);

    }

    protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(this, "Started Second acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 340);
        toast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(this, "Resumed Second acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 460);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(this, "Restarted Second acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 140);
        toast.show();
    }


    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(this, "Paused second acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 380);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(this, "Stopped second acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 540);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(this, "Destroyed second acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 660);
        toast.show();
    }
//    public void navToSecond(View view){
//        //Toast.makeText(this, "Navigating to 2nd", Toast.LENGTH_LONG).show();
//        Toast toast = Toast.makeText(this, "Navigating to 2nd", Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.BOTTOM, 0, 0);
//        Intent intent = new Intent(this, SecondScreen.class);
//        toast.show();
//        startActivity(intent);
//
//
//    }

}