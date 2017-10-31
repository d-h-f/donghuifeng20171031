package com.example.d_h_f.donghuifeng20171031;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText phone,pass;
    private Button  login,zhuce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone  = (EditText) findViewById(R.id.phone);
        pass  = (EditText) findViewById(R.id.pass);
        login  = (Button) findViewById(R.id.login);
        zhuce  = (Button) findViewById(R.id.zhuce);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phone.equals("")||pass.equals("")){
                    Toast.makeText(MainActivity.this,"不能为空",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        });

        zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThridActivity.class);
                startActivity(intent);
            }
        });
    }
}
