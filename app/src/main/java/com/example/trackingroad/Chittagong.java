package com.example.trackingroad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chittagong extends AppCompatActivity {

    Button rangeOffice,bandarbanOffice,brahmanbariaOffice,chandpurOffice,chittagongOffice
            ,coxBazarOffice,comillaOffice,feniOffice,khagrachariOffice,lakshmipurOffice,noakhaliOffice
            ,rangamatiOffice,rrf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_chittagong);

        rangeOffice=(Button)findViewById(R.id.chittagongRange);
        bandarbanOffice=(Button)findViewById(R.id.bandarbanOffice);
        brahmanbariaOffice=(Button)findViewById(R.id.brahamanbariaOffice);
        chandpurOffice=(Button)findViewById(R.id.chandpurOffice);
        chittagongOffice=(Button)findViewById(R.id.chittagongOffice);
        coxBazarOffice=(Button)findViewById(R.id.coxBazarOffice);
        comillaOffice=(Button)findViewById(R.id.comillaOffice);
        feniOffice=(Button)findViewById(R.id.feniOffice);
        khagrachariOffice=(Button)findViewById(R.id.khagrachariOffice);
        noakhaliOffice=(Button)findViewById(R.id.noakhaliOffice);
        lakshmipurOffice=(Button)findViewById(R.id.lakshmipurOffice);
        rangamatiOffice=(Button)findViewById(R.id.rangamatiOffice);
        rrf=(Button)findViewById(R.id.chittagongRRF);

        rangeOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rangeC=new Intent(getApplicationContext(),ChittagongRange.class);
                startActivity(rangeC);
            }
        });

        bandarbanOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bandarbanP=new Intent(getApplicationContext(),BandarbanPolice.class);
                startActivity(bandarbanP);

            }
        });

        brahmanbariaOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        chandpurOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        chittagongOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        lakshmipurOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        comillaOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        feniOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        coxBazarOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        khagrachariOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        noakhaliOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        rangamatiOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        rrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}