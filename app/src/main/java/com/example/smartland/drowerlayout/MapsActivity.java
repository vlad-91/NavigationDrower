package com.example.smartland.drowerlayout;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapsActivity extends AppCompatActivity {

    private Button btnStreet, btnLocation;
    private EditText editTextlatLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        btnStreet = findViewById(R.id.btn_street_view);
        btnLocation = findViewById(R.id.btn_show_location);
        editTextlatLong = findViewById(R.id.editText_lat_long);


        btnStreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShowStreet = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=" + editTextlatLong.getText()));
                startActivity(intentShowStreet);
            }
        });

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShowLocation = new Intent();
                intentShowLocation.setAction(Intent.ACTION_VIEW);
                if (editTextlatLong.getText()!=null) {
                    intentShowLocation.setData(Uri.parse("geo:" + editTextlatLong.getText()));
                }
                startActivity(intentShowLocation);
            }
        });
    }

}
