package com.example.activitylifecycles;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(this, "Created first acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }

    protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(this, "Started first acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 140);
        toast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(this, "Resumed first acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 260);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(this, "Restarted first acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 40);
        toast.show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(this, "Paused first acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 380);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(this, "Stopped first acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 540);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(this, "Destroyed first acitivity", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 660);
        toast.show();
    }
    
    public void passData(View view){
        //Toast.makeText(this, "Navigating to 2nd", Toast.LENGTH_LONG).show();
        EditText editText = (EditText)findViewById(R.id.userName);
        EditText editText2 = (EditText)findViewById(R.id.userID);

        String name = editText.getText().toString();
        String ID = editText2.getText().toString();

        Intent intent = new Intent(getApplicationContext(),SecondScreen.class);
        Bundle bundle = new Bundle();
        bundle.putString("data1",name);
        bundle.putString("data2",ID);

        intent.putExtras(bundle);
        Toast toast = Toast.makeText(this, "Navigating to 2nd", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();

        startActivity(intent);
    }

}