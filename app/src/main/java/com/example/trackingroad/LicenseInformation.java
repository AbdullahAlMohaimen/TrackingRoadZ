package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class LicenseInformation extends AppCompatActivity {

    TextView name,dateOfBirth,bloodGroup,fatherOrHusband,validity,licenseNo,issueAuthority,address,firstIssue;

    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_information);
        this.setTitle("Driving License");

        //addingBackButton
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);


        name=(TextView) findViewById(R.id.licenseName);
        dateOfBirth=(TextView) findViewById(R.id.licenseDateOfBirth);
        bloodGroup=(TextView) findViewById(R.id.licenseBloodGroup);
        fatherOrHusband=(TextView) findViewById(R.id.licenseFather);
        validity=(TextView) findViewById(R.id.licenseValidity);
        licenseNo=(TextView) findViewById(R.id.licenseNumber);
        issueAuthority=(TextView) findViewById(R.id.licenseIssueAuthority);
        address=(TextView) findViewById(R.id.licenseAddress);
        firstIssue=(TextView) findViewById(R.id.licenseFirstIssue);

        mAuth=FirebaseAuth.getInstance();
        fStore=FirebaseFirestore.getInstance();
        userId=mAuth.getCurrentUser().getUid();
        DocumentReference documentReference=fStore.collection("DrivingLicense").document(userId);

        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(DocumentSnapshot documentSnapshot, FirebaseFirestoreException e) {

                name.setText(documentSnapshot.getString("Name"));
                dateOfBirth.setText(documentSnapshot.getString("DateOfBirth"));
                bloodGroup.setText(documentSnapshot.getString("BloodGroup"));
                fatherOrHusband.setText(documentSnapshot.getString("FatherOrHusband"));
                validity.setText(documentSnapshot.getString("Validity"));
                licenseNo.setText(documentSnapshot.getString("LicenseNo"));
                issueAuthority.setText(documentSnapshot.getString("IssueAuthority"));
                address.setText(documentSnapshot.getString("Address"));
                firstIssue.setText(documentSnapshot.getString("FirstIssue"));
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