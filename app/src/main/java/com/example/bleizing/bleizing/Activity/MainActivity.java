package com.example.bleizing.bleizing.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.bleizing.bleizing.DataWebServer.Activity.DataWebServerActivity;
import com.example.bleizing.bleizing.GPS.Activity.GPSActivity;
import com.example.bleizing.bleizing.Information.Activity.InformationActivity;
import com.example.bleizing.bleizing.R;
import com.example.bleizing.bleizing.UnitTesting.Activity.UnitTestingActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_info = (Button) findViewById(R.id.btn_info);
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        Button btn_unit_testing = (Button) findViewById(R.id.btn_unit_testing);
        btn_unit_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UnitTestingActivity.class);
                startActivity(intent);
            }
        });

        Button btn_gps = (Button) findViewById(R.id.btn_gps);
        btn_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GPSActivity.class);
                startActivity(intent);
            }
        });

        Button btn_data = (Button) findViewById(R.id.btn_data);
        btn_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataWebServerActivity.class);
                startActivity(intent);
            }
        });
    }
}
