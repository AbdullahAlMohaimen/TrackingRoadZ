package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPassword extends AppCompatActivity implements View.OnClickListener{

    EditText userText,emailText;
    Button changePassword,cleartext;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        emailText=(EditText)findViewById(R.id.userEmailTextId);
        userText=(EditText)findViewById(R.id.userTextId);

        changePassword=(Button)findViewById(R.id.doneId);
        cleartext=(Button) findViewById(R.id.changeClearId);

        databaseHelper=new DatabaseHelper(this);

        changePassword.setOnClickListener(this);
        cleartext.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.doneId)
        {
            String user=userText.getText().toString();
            String email=emailText.getText().toString();

            Boolean result =databaseHelper.checkUser(user,email);

            if(result==true)
            {
                Intent login=new Intent(ForgetPassword.this,ResetPassword.class);
                //login.putExtra("userText",user);
                startActivity(login);
            }
            else {
                Toast.makeText(getApplicationContext(),"Email and Username didn't match",Toast.LENGTH_SHORT).show();
            }
        }


        if(v.getId()==R.id.changeClearId)
        {
            userText.setText("");
        }
    }
}