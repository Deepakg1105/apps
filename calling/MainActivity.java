package com.example.basiccalling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        EditText t1=findViewById(R.id.text1);
        String num = t1.getText().toString();
        Intent it = new Intent(Intent.ACTION_DIAL);
        it.setData(Uri.parse("tel:" + num));
        startActivity(it);
    }
}