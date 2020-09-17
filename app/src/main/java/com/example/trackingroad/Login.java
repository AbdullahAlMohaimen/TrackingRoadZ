package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    TextView setProfileNameText;
    Button staticButton,mapButton,vehicleButton,locationButton,gasStationButton,exitButton,internetConnection,distance;
    ImageButton profileSetting,logout,vehicleInformation;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setTitle("Home");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        setProfileNameText=(TextView)findViewById(R.id.profileEmailTextId);

        staticButton=(Button)findViewById(R.id.staticId);
        mapButton=(Button)findViewById(R.id.mapId);
        vehicleButton=(Button)findViewById(R.id.vehicleId);
        locationButton=(Button)findViewById(R.id.locationId);
        gasStationButton=(Button)findViewById(R.id.gasStationId);
        exitButton=(Button)findViewById(R.id.exitId);
        distance=(Button)findViewById(R.id.distanceId);
        internetConnection=(Button)findViewById(R.id.checkInternetId);

        mAuth=FirebaseAuth.getInstance();

        vehicleInformation=(ImageButton)findViewById(R.id.vehicleInformationButton);
        profileSetting=(ImageButton)findViewById(R.id.profileSettingButton);
        logout=(ImageButton)findViewById(R.id.logoutButton);


        staticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent statics=new Intent(Login.this,Static.class);
                startActivity(statics);

            }
        });


        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent currentLocation=new Intent(getApplicationContext(),CurrentLocation.class);
                startActivity(currentLocation);
            }
        });




        vehicleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vehicle=new Intent(Login.this,Vehicle.class);
                startActivity(vehicle);
            }
        });




        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });




        gasStationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });




        vehicleInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vehicleInfo=new Intent(Login.this,VehicleInformation.class);
                startActivity(vehicleInfo);
            }
        });




        profileSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent showSetting=new Intent(Login.this,profileSetting.class);
                startActivity(showSetting);
            }
        });




        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                finish();
                Intent logout=new Intent(Login.this,MainActivity.class);
                startActivity(logout);
            }
        });



        internetConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkConnection();

            }
        });


        distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dist=new Intent(getApplicationContext(),DistanceTwoPlace.class);
                startActivity(dist);

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


    public void checkConnection()
    {
        ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork=manager.getActiveNetworkInfo();

        if(null!=activeNetwork)
        {
            if(activeNetwork.getType()==ConnectivityManager.TYPE_WIFI)
            {
                Toast.makeText(getApplicationContext(),"Wifi Enable",Toast.LENGTH_SHORT).show();
            }
            else if(activeNetwork.getType()==ConnectivityManager.TYPE_MOBILE)
            {
                Toast.makeText(getApplicationContext(),"Network Enable",Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"No Internet Connection",Toast.LENGTH_SHORT).show();
        }
    }
}