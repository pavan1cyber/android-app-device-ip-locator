package com.example.a1ay19cs0shtasdf3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button shtbut3 = findViewById(R.id.shtbut3);
        Button shtbut4 = findViewById(R.id.shtbut4);
        Button shtbut5 = findViewById(R.id.shtbut5);
        Button shtbut6 = findViewById(R.id.shtbut6);
        Button shtbut7 = findViewById(R.id.shtbut7);
        Button shtbut8 = findViewById(R.id.shtbut8);
        Button shtbut9 = findViewById(R.id.shtbut9);
        Button shtbut10 = findViewById(R.id.shtbut10);
        Button shtbut11 = findViewById(R.id.shtbut11);

        Intent shtin = getIntent();


        String shtst = shtin.getStringExtra("shtmssg");

        try {
            JSONObject emp=(new JSONObject(shtst)).getJSONObject("employee");

            shtbut3.setText("country:- "+ emp.getString("country") + "\n" + "country code:- " + emp.getString("countryCode"));
            shtbut4.setText("state:- "+ emp.getString("regionName"));
            shtbut5.setText("state code:- " + emp.getString("region"));
            shtbut6.setText("city:- "+ emp.getString("city"));
            shtbut7.setText("zipcode:- "+ emp.getString("zip"));
            shtbut8.setText("isp / dns :- " + "\n" + emp.getString("isp") + "\n" + emp.getString("org"));
            shtbut9.setText("system:-" + "\n" + emp.getString("as"));
            shtbut10.setText("ip address:-" + emp.getString("query"));
            shtbut11.setText("lat:-" + emp.getDouble("lat") + "\n" + "lon:-" + emp.getDouble("lon"));

        } catch (JSONException e) {


            shtbut3.setText("country:- "+ ("fail") + "\n" + ("fail"));
            shtbut4.setText("state:- "+ ("fail"));
            shtbut5.setText("state code:- " + ("fail"));
            shtbut6.setText("city:- "+ ("fail"));
            shtbut7.setText("zipcode:- "+ ("fail"));
            shtbut8.setText("isp / dns :- " + "\n" + ("fail") + "\n" + ("fail"));
            shtbut9.setText("system:-" + "\n" + ("fail"));
            shtbut10.setText("ip address:-" + ("fail"));
            shtbut11.setText("lat:-" + ("fail") + "\n" + "lon:-" + ("fail"));

            Toast.makeText(this,"invalid ip address \n no internet" , Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }


    }
}