package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {
    private Button btn_ok= findViewById(R.id.btn_ok);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence message = "Sending numbers";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration); toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
            }
        });
    }







}
