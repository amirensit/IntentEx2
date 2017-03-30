package com.example.amir.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nom;
    EditText email;
    EditText option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom=(EditText)findViewById(R.id.nom);
        email=(EditText)findViewById(R.id.email);
        option=(EditText)findViewById(R.id.option);



    }


    public void afficher(View view)
    {
        Intent intent=new Intent(this,LoadInfo.class);
        String message1=nom.getText().toString();
        String message2=email.getText().toString();
        String message3=option.getText().toString();
        intent.putExtra("nom",message1);
        intent.putExtra("email",message2);
        intent.putExtra("option",message3);
        startActivity(intent);

    }
}
