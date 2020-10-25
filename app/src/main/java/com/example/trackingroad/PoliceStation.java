package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PoliceStation extends AppCompatActivity {

    Button barishal,chittagong,dhaka,mymensingh,khulna,rajshahi,rangpur,sylhet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_police_station);
        //this.setTitle("Police Station");

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(true);

        barishal=(Button)findViewById(R.id.barishalButtonId);
        chittagong=(Button)findViewById(R.id.chittagongButtonId);
        dhaka=(Button)findViewById(R.id.dhakalButtonId);
        mymensingh=(Button)findViewById(R.id.mymensinghButtonId);
        khulna=(Button)findViewById(R.id.khulnalButtonId);
        rajshahi=(Button)findViewById(R.id.rajshahiButtonId);
        rangpur=(Button)findViewById(R.id.rangpurlButtonId);
        sylhet=(Button)findViewById(R.id.sylhetButtonId);



        barishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent barishalM=new Intent(getApplicationContext(),Barishal.class);
                startActivity(barishalM);
            }
        });

        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dhakaM=new Intent(getApplicationContext(),Dhaka.class);
                startActivity(dhakaM);
            }
        });

        chittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent chittagongM=new Intent(getApplicationContext(),Chittagong.class);
                startActivity(chittagongM);
            }
        });

        mymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mymensinghM=new Intent(getApplicationContext(),Mymensingh.class);
                startActivity(mymensinghM);
            }
        });

        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent khulnaM=new Intent(getApplicationContext(),Khulna.class);
                startActivity(khulnaM);
            }
        });

        rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rajshahiM=new Intent(getApplicationContext(),Rajshahi.class);
                startActivity(rajshahiM);
            }
        });

        rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rangpurM=new Intent(getApplicationContext(),Rangpur.class);
                startActivity(rangpurM);
            }
        });

        sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sylhetM=new Intent(getApplicationContext(),Sylhet.class);
                startActivity(sylhetM);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}