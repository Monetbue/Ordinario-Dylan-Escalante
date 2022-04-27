package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity7 extends AppCompatActivity {

    EditText numeroh2;
    Button pagarh2;
    Button regresar;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        pagarh2=(Button) findViewById(R.id.pagarh2);
        regresar = (Button) findViewById(R.id.regresar);
        numeroh2 = (EditText) findViewById(R.id.numeroh2);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numeroh2="";
                _numeroh2 = numeroh2.getText().toString();
                GuardarDatos(_numeroh2);
                Intent intent = new Intent(MainActivity7.this,MainActivity2.class);
                //intent.putExtra("Numeroh2",_numeroh2);
                startActivity(intent);
            }
        });

        pagarh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numeroh2="";
                _numeroh2 = numeroh2.getText().toString();
                GuardarDatos(_numeroh2);
                Intent intent = new Intent(MainActivity7.this,MainActivity11.class);
                //intent.putExtra("Numeroh2",_numeroh2);
                startActivity(intent);
            }
        });


    }
    private void GuardarDatos(String numeroh2) {
        preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Numeroh2",numeroh2);
        editor.commit();
    }

}