package com.example.imtiazaminsajid.sdmgap_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    public TextView nameTV, fatherTV, emailTV, phoneTV, addressTV, bloodTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);



        nameTV =findViewById(R.id.nameTV);
        fatherTV =findViewById(R.id.fatherNameTV);
        emailTV =findViewById(R.id.emailTV);
        phoneTV =findViewById(R.id.phoneTV);
        addressTV =findViewById(R.id.addressTV);
        bloodTV =findViewById(R.id.bloodTV);

        String nameValue = getIntent().getStringExtra("MYName");
        String fatherValue = getIntent().getStringExtra("Fname");
        String emailValue = getIntent().getStringExtra("Email");
        String phoneValue = getIntent().getStringExtra("Phone");
        String addressValue = getIntent().getStringExtra("Address");
        String bloodValue = getIntent().getStringExtra("Blood");


        nameTV.setText(nameValue);
        fatherTV.setText(fatherValue);
        emailTV.setText(emailValue);
        phoneTV.setText(phoneValue);
        addressTV.setText(addressValue);
        bloodTV.setText(bloodValue);





    }
}
