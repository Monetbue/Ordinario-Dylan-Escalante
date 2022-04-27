package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity9 extends AppCompatActivity {

    EditText numerop2;
    Button pagarp2;
    Button regresar;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        pagarp2=(Button) findViewById(R.id.pagarp2);
        regresar = (Button) findViewById(R.id.regresar);
        numerop2= (EditText) findViewById(R.id.numerop2);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numerop2="";
                _numerop2 = numerop2.getText().toString();
                GuardarDatos(_numerop2);
                Intent intent = new Intent(MainActivity9.this,MainActivity2.class);
                //intent.putExtra("Numerop2",_numerop2);
                startActivity(intent);
            }
        });

        pagarp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numerop2="";
                _numerop2 = numerop2.getText().toString();
                GuardarDatos(_numerop2);
                Intent intent = new Intent(MainActivity9.this,MainActivity11.class);
                //intent.putExtra("Numerop2",_numerop2);
                startActivity(intent);
            }
        });

    }
    private void GuardarDatos(String numerop2) {
        preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Numerop2",numerop2);
        editor.commit();
    }

}