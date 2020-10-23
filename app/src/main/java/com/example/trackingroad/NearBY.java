package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class NearBY extends AppCompatActivity {

    Button fuelStation,hospital,school,college,university,gasStation,restaurant,shoppingMall,busStation,policeStation
            ,fillingStation,library,hotel,pharmacies,atm,park,mail,attraction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_near_b_y);


        fuelStation=(Button)findViewById(R.id.fuelButtonId);
        gasStation=(Button)findViewById(R.id.gasStationButtonId);
        hospital=(Button)findViewById(R.id.hospitalButtonId);
        school=(Button)findViewById(R.id.schoolButtonId);
        college=(Button)findViewById(R.id.collegeButtonId);
        university=(Button)findViewById(R.id.universityButtonId);
        restaurant=(Button)findViewById(R.id.restaurantsButtonId);
        shoppingMall=(Button)findViewById(R.id.malButtonId);
        busStation=(Button)findViewById(R.id.busStationButtonId);
        policeStation=(Button)findViewById(R.id.policeStationButtonId);
        fillingStation=(Button)findViewById(R.id.fillingStationButtonId);
        library=(Button)findViewById(R.id.libraryButtonId);
        hotel=(Button)findViewById(R.id.hotelButtonId);
        pharmacies=(Button)findViewById(R.id.pharmaciesButtonId);
        atm=(Button)findViewById(R.id.atmButtonId);
        park=(Button)findViewById(R.id.parkButtonId);
        mail=(Button)findViewById(R.id.mailButtonId);
        attraction=(Button)findViewById(R.id.attractionButtonId);


        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(true);


        fuelStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=fuel station");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });

        gasStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=gas station");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });



        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=hospital");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });



        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=school");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });


        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=college");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });



        university.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=university");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });


        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=restaurant");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });



        shoppingMall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=shopping mall");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }


            }
        });

        busStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=bus station");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });

        policeStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=police station");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });

        fillingStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=filling station");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=library");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }
            }
        });

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=hotel");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }
            }
        });

        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=park");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }
            }
        });



        pharmacies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=pharmacies");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }

            }
        });


        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=ATMs");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }
            }
        });


        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=Mail & Shipping");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }
            }
        });


        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    //when google map is installed
                    Uri uri=Uri.parse("geo:0,0?q=Attractions");

                    Intent map=new Intent(Intent.ACTION_VIEW,uri);
                    map.setPackage("com.google.android.apps.maps");
                    map.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(map);
                }catch (ActivityNotFoundException e)
                {
                    //when google map is not installed
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent mapS=new Intent(Intent.ACTION_VIEW,uri);
                    mapS.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(mapS);
                }
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