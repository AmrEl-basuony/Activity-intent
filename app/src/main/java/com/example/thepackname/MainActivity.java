package com.example.thepackname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.thepackname.MESSAGE";
    public static final String EXTRA_NUM = "com.example.thepackname.NUM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void close(View view){finish();}
    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, NotMainActivity.class);
        EditText editText =findViewById(R.id.edt_msg_txt);
        EditText editNum =findViewById(R.id.edt_phone_num);
        String message = editText.getText().toString();
        String num = editNum.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_NUM, num);
        startActivity(intent);
    }

}