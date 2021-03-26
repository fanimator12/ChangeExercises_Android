package com.example.changecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button changeButton;
    TextView info;
    Switch switch1;
    ImageView imageView1;
    ImageView imageView2;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButton = findViewById(R.id.changeButton);
        info = findViewById(R.id.textView);
        switch1 = findViewById(R.id.switch1);
        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        Log.d(TAG, "onCreate was called");

        changeButton.setOnClickListener(view -> onClick(info));
        switch1.setOnClickListener(view -> changeImage(info));
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view){
        Context context = getApplicationContext();
        String text = "Changing text...";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();

        info.setText("Congrats, you changed the text");
    }

    @SuppressLint("SetTextI18n")
    public void changeImage(View view){
        Context context = getApplicationContext();
        String text = "Changing image...";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();

        if(switch1.isChecked()){
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        } else {
            imageView2.setVisibility(View.VISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
        }
     }
}