package com.example.android.samplepageui;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frontPage = (Button) findViewById(R.id.first_page);

        frontPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent storeListActivity = new Intent(MainActivity.this, StoreListActivity.class);
                startActivity(storeListActivity);

            }
        });

        Button secondPage = (Button) findViewById(R.id.second);
        secondPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent profilePage = new Intent(MainActivity.this, StoreProfilePageActivity.class);
                startActivity(profilePage);
            }
        });


    }


}
