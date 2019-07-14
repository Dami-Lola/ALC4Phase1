package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutalc,myprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        aboutalc = findViewById(R.id.aboutAlc);
        aboutalc.setOnClickListener(selectClickListener);

        myprofile = findViewById(R.id.myProfile);
        myprofile.setOnClickListener(selectClickListener);

    }

    View.OnClickListener selectClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()){

                case R.id.aboutAlc:
                    Intent aboutALCIntent = new Intent(getApplicationContext(), AboutALC.class);
                    startActivity(aboutALCIntent);
                    break;

                case R.id.myProfile:
                    Intent profileintent = new Intent(getApplicationContext(), MyProfile.class);
                    startActivity(profileintent);
                    break;
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
