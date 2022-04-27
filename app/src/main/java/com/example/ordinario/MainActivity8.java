package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity8 extends AppCompatActivity {

    EditText numerop1;
    Button pagarp1;
    Button regresar;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        pagarp1=(Button) findViewById(R.id.pagarp1);
        regresar = (Button) findViewById(R.id.regresar);
        numerop1= (EditText) findViewById(R.id.numerop1);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numerop1="";
                _numerop1 = numerop1.getText().toString();
                GuardarDatos(_numerop1);
                Intent intent = new Intent(MainActivity8.this,MainActivity2.class);
                //intent.putExtra("Numerop1",_numerop1);
                startActivity(intent);
            }
        });

        pagarp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numerop1="";
                _numerop1 = numerop1.getText().toString();
                GuardarDatos(_numerop1);
                Intent intent = new Intent(MainActivity8.this,MainActivity11.class);
                //intent.putExtra("Numerop1",_numerop1);
                startActivity(intent);
            }
        });

    }
    private void GuardarDatos(String numerop1) {
        preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Numerop1",numerop1);
        editor.commit();
    }

}