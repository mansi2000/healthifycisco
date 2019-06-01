package com.example.android.healthifycisco;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {

    EditText name,phone,email,username,password;
    Button insert,back;
    FirebaseDatabase database;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText)findViewById(R.id.name);
        phone = (EditText)findViewById(R.id.phone);
        email =(EditText)findViewById(R.id.email);
        username = (EditText)findViewById(R.id.username_reg);
        password = (EditText)findViewById(R.id.password_reg);
        insert = (Button)findViewById(R.id.btn_submit_reg);
        back =(Button)findViewById(R.id.btn_back_reg);

        database = FirebaseDatabase.getInstance();
        ref = database.getReference("User");


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this,Home2.class);
                startActivity(i);
                finish();
            }
        });



    }

    public void btnInsert(View view){
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        })


    }
}
