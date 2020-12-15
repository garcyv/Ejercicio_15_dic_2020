package com.example.ejercicio_14_dic_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nom,ape;
    private String label=MainActivity.class.getSimpleName();


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperamos los objetos editores texto
        nom = findViewById(R.id.edtNombre);
        ape = findViewById(R.id.edtApellido);
        Log.d( label, "OnCreate");

        Button mButton =findViewById(R.id.myButton);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "PRESS", Toast.LENGTH_SHORT).show();

                // Verify that the intent will resolve to an activity
                Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(mIntent);
                }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d( label, "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( label, "OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( label, "OnStop");
       Toast.makeText(this, "Detenido", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( label, "OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( label, "OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( label, "OnDestroy");
    }

}
