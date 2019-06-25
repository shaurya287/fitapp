package com.example.shauryasingh.fitapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button1);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("admin") && et2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Signing in", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(), com.example.shauryasingh.fitapp.HomeActivity.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Id or Pass",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

}
