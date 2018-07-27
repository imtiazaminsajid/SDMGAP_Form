package com.example.imtiazaminsajid.sdmgap_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public EditText myName, fatherName, email, address, bloodGroup, phoneNumber;
    public ImageButton cancel, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = findViewById(R.id.myName);
        fatherName = findViewById(R.id.fatherName);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
        phoneNumber = findViewById(R.id.phone);
        bloodGroup = findViewById(R.id.bloodGroup);

        cancel = findViewById(R.id.cancel);
        save = findViewById(R.id.save);
    }

    public void save(View view) {


        String name = myName.getText().toString();
        String fName = fatherName.getText().toString();
        String emailvalue = email.getText().toString();
        String phone = phoneNumber.getText().toString();
        String addressValue = address.getText().toString();
        String blood = bloodGroup.getText().toString();


        Intent intent = new Intent(this, com.example.imtiazaminsajid.sdmgap_form.Display.class);
        intent.putExtra("MYName", name);
        intent.putExtra("Fname", fName);
        intent.putExtra("Email", emailvalue);
        intent.putExtra("Phone", phone);
        intent.putExtra("Address", addressValue);
        intent.putExtra("Blood", blood);
        startActivity(intent);
    }
}
