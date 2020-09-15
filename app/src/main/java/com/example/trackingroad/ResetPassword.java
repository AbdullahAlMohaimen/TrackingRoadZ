package com.example.trackingroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity implements View.OnClickListener{

    TextView setUsername;
    EditText password,confirmPassword;
    Button reset,back;

    DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        setUsername=(TextView)findViewById(R.id.setUsernameTextId);

        databaseHelper=new DatabaseHelper(this);

        password=(EditText)findViewById(R.id.password);
        confirmPassword=(EditText)findViewById(R.id.confirmPassword);

        reset=(Button)findViewById(R.id.resetId);
        back=(Button)findViewById(R.id.backId);

        reset.setOnClickListener(this);
        back.setOnClickListener(this);

        Intent set=getIntent();
        setUsername.setText(set.getStringExtra("userText"));
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
    public void onClick(View view) {

        if(view.getId()==R.id.resetId)
        {
            String username=setUsername.getText().toString();
            String pass=password.getText().toString();
            String confirmPass=confirmPassword.getText().toString();

            if(pass.equals(confirmPass))
            {
                Boolean checkPasswordUpdate=databaseHelper.updatePassword(username,pass);

                if(checkPasswordUpdate==true)
                {
                    Toast.makeText(getApplicationContext(),"Successfully Reset",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Not Reset",Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Password aren't match",Toast.LENGTH_SHORT).show();
            }
        }


        if(view.getId()==R.id.backId)
        {
            Intent back=new Intent(ResetPassword.this,MainActivity.class);
            startActivity(back);
        }
    }
}