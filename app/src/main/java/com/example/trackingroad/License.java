package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class License extends AppCompatActivity {

    EditText name,dateOfBirth,bloodGroup,fatherOrHusband,validity,licenseNo,issueAuthority,address,firstIssue;
    Button clearLicense,saveLicense;

    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_license);
        //this.setTitle("License");

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(true);

        clearLicense=(Button)findViewById(R.id.clearLicense);
        saveLicense=(Button)findViewById(R.id.saveLicense);

        name=(EditText)findViewById(R.id.nameLicense);
        dateOfBirth=(EditText)findViewById(R.id.dateOfBirthLicense);
        bloodGroup=(EditText)findViewById(R.id.bloodGroupLicense);
        fatherOrHusband=(EditText)findViewById(R.id.fatherLicense);
        validity=(EditText)findViewById(R.id.validityLicense);
        licenseNo=(EditText)findViewById(R.id.licenseNo);
        issueAuthority=(EditText)findViewById(R.id.authorityLicense);
        address=(EditText)findViewById(R.id.addressLicense);
        firstIssue=(EditText)findViewById(R.id.issueLicense);

        mAuth = FirebaseAuth.getInstance();
        fStore=FirebaseFirestore.getInstance();

        clearLicense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                dateOfBirth.setText("");
                bloodGroup.setText("");
                fatherOrHusband.setText("");
                validity.setText("");
                licenseNo.setText("");
                issueAuthority.setText("");
                address.setText("");
                firstIssue.setText("");
            }
        });

        saveLicense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveDrivingLicense();
            }
        });
    }

    private void saveDrivingLicense() {

        final String nameOf=name.getText().toString().trim();
        final String dateOf=dateOfBirth.getText().toString().trim();
        final String bloodOf=bloodGroup.getText().toString().trim();
        final String fatherOf=fatherOrHusband.getText().toString().trim();
        final String validityOf=validity.getText().toString().trim();
        final String licenseOf=licenseNo.getText().toString().trim();
        final String issueAuthorityOf=issueAuthority.getText().toString().trim();
        final String addressOf=address.getText().toString().trim();
        final String firstIssueOf=firstIssue.getText().toString().trim();

        if(nameOf.isEmpty())
        {
            name.setError("Please fill up this!");
            name.requestFocus();
            return;
        }

        if(dateOf.isEmpty())
        {
            dateOfBirth.setError("Please fill up this!");
            dateOfBirth.requestFocus();
            return;
        }

        if(bloodOf.isEmpty())
        {
            bloodGroup.setError("Please fill up this!");
            bloodGroup.requestFocus();
            return;
        }

        if(fatherOf.isEmpty())
        {
            fatherOrHusband.setError("Please fill up this!");
            fatherOrHusband.requestFocus();
            return;
        }

        if(validityOf.isEmpty())
        {
            validity.setError("Please fill up this!");
            validity.requestFocus();
            return;
        }

        if(licenseOf.isEmpty())
        {
            licenseNo.setError("Please fill up this!");
            licenseNo.requestFocus();
            return;
        }

        if(issueAuthorityOf.isEmpty())
        {
            issueAuthority.setError("Please fill up this!");
            issueAuthority.requestFocus();
            return;
        }

        if(addressOf.isEmpty())
        {
            address.setError("Please fill up this!");
            address.requestFocus();
            return;
        }

        if(firstIssueOf.isEmpty())
        {
            firstIssue.setError("Please fill up this!");
            firstIssue.requestFocus();
            return;
        }
        userID=mAuth.getCurrentUser().getUid();
        DocumentReference documentReference=fStore.collection("DrivingLicense").document(userID);

        Map<String,Object> licenseSet=new HashMap<>();
        licenseSet.put("Name",nameOf);
        licenseSet.put("DateOfBirth",dateOf);
        licenseSet.put("BloodGroup",bloodOf);
        licenseSet.put("FatherOrHusband",fatherOf);
        licenseSet.put("Validity",validityOf);
        licenseSet.put("LicenseNo",licenseOf);
        licenseSet.put("IssueAuthority",issueAuthorityOf);
        licenseSet.put("Address",addressOf);
        licenseSet.put("FirstIssue",firstIssueOf);

        documentReference.set(licenseSet).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(getApplicationContext(),"Successfully Saved",Toast.LENGTH_SHORT).show();
                Log.d("Success","onSuccess: Location Save"+userID);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
                Log.d("Failure","onFailure: "+e.toString());
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