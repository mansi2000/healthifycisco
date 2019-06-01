package com.example.android.healthifycisco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Home2 extends AppCompatActivity {
    private Button mSendData;
    private Button profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        mSendData = (Button)findViewById(R.id.add_string);
        profile = (Button)findViewById(R.id.login_btn) ;
        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home2.this,Register.class);
                startActivity(i);
                finish();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home2.this,profile.class);
                startActivity(i);
                finish();
            }
        });
    }
}
