package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity10 extends AppCompatActivity {

    EditText numeroh1;
    Button pagarh1;
    Button regresar;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        pagarh1=(Button) findViewById(R.id.pagarh1);
        regresar = (Button) findViewById(R.id.regresar);
        numeroh1 = (EditText) findViewById(R.id.numeroh1);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numeroh1="";
                _numeroh1 = numeroh1.getText().toString();
                GuardarDatos(_numeroh1);
                Intent intent = new Intent(MainActivity10.this,MainActivity2.class);
                //intent.putExtra("Numeroh1",_numeroh1);
                startActivity(intent);
            }
        });

        pagarh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numeroh1="";
                _numeroh1 = numeroh1.getText().toString();
                GuardarDatos(_numeroh1);
                Intent intent = new Intent(MainActivity10.this,MainActivity11.class);
                //intent.putExtra("Numeroh1",_numeroh1);
                startActivity(intent);
            }
        });


    }
    private void GuardarDatos(String numeroh1) {
        preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Numeroh1",numeroh1);
        editor.commit();
    }

}