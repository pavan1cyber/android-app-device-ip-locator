package com.example.a1ay19cs0shtasdf3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button shtbut = findViewById(R.id.shtbut);
        EditText shtpl = findViewById(R.id.shtplace);
        //EditText shtdel = findViewById(R.id.shtdetailtv);
        EditText shtdeltv = findViewById(R.id.shtdetailtv);


        shtbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String shtburl  = "http://ip-api.com/json/" + shtpl.getText().toString();
                StringRequest shtreq = new StringRequest(Request.Method.POST, shtburl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //shtdel.setText(response);
                        shtdeltv.setText(response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //shtdel.setText("turn on the data enter city,country");
                        shtdeltv.setText(" turn on the data");
                        Toast.makeText(MainActivity.this,"no internet",Toast.LENGTH_SHORT).show();
                    }
                });
                RequestQueue shtq = Volley.newRequestQueue(getApplicationContext());
                shtq.add(shtreq);





            }
        });

        //1.186.213.66
// {"status":"success","country":"India","countryCode":"IN","region":"KA","regionName":"Karnataka","city":"Bengaluru","zip":"560001","lat":12.9634,"lon":77.5855,"timezone":"Asia/Kolkata","isp":"Reliance Jio Infocomm Limited","org":"Reliance Jio Infocomm Limited","as":"AS55836 Reliance Jio Infocomm Limited","query":"157.45.72.211"}
// {'status':'success','country':'India','countryCode':'IN','region':'KA','regionName':'Karnataka','city':'Bengaluru','zip':'560068','lat':12.9634,'lon':77.5855,'timezone':'Asia/Kolkata','isp':'D-VoiS Broadband Private Limited','org':'DVOIS','as':'AS45769 D-Vois Broadband Pvt Ltd','query':'1.186.213.66'}

        Button shtfull = findViewById(R.id.shtfull);

        shtfull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String shtburl  = "http://ip-api.com/json/" + shtpl.getText().toString();
                StringRequest shreq = new StringRequest(Request.Method.POST, shtburl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //shtdel.setText(response);
                        shtdeltv.setText(response);

                        Intent shin = new Intent(MainActivity.this,MainActivity2.class);
                        shin.putExtra("shtmssg" , "{\"employee\":" + response+ "}");
                        startActivity(shin);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        shtdeltv.setText(" turn on the data");
                        //errorshhht
                        String shjsont ="{'status':'success','country':'India','countryCode':'IN','region':'KA','regionName':'Karnataka','city':'Bengaluru','zip':'560068','lat':12.9634,'lon':77.5855,'timezone':'Asia/Kolkata','isp':'D-VoiS Broadband Private Limited','org':'DVOIS','as':'ACHARYA D-Vois Broadband Pvt Ltd','query':'1.186.213.66'}" ;
                        Intent shin = new Intent(MainActivity.this,MainActivity2.class);
                        shin.putExtra("shtmssg" , "{\"employee\":" + shjsont+ "}");
                        startActivity(shin);
                    }
                });
                RequestQueue shtq = Volley.newRequestQueue(getApplicationContext());
                shtq.add(shreq);


            }
        });





    }
}