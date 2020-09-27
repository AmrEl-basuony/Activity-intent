package com.example.thepackname;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NotMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_main);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String num = intent.getStringExtra(MainActivity.EXTRA_NUM);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.displaymsg);
        textView.setText(message);
        TextView textView1 = findViewById(R.id.displaynum);
        textView1.setText(num);

    }

    public void close(View view){finish();}
}
