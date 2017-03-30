package com.example.amir.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoadInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_info);
        Bundle data=getIntent().getExtras();
        String nom=data.getString("nom");
        String email=data.getString("email");
        String option=data.getString("option");
        TextView aff=(TextView)findViewById(R.id.textView2);
        aff.setText("nom: "+nom+"\nemail: "+email+"\noption: "+option);

    }
}
