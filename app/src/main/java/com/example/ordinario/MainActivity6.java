package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {

    EditText numeron;
    Button pagarn;
    Button regresar;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        pagarn=(Button) findViewById(R.id.pagarn);
        regresar = (Button) findViewById(R.id.regresar);
        numeron = (EditText) findViewById(R.id.numeron);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numeron="";
                _numeron = numeron.getText().toString();
                GuardarDatos(_numeron);
                Intent intent = new Intent(MainActivity6.this,MainActivity2.class);
                //intent.putExtra("Numeron",_numeron);
                startActivity(intent);
            }
        });

        pagarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _numeron="";
                _numeron = numeron.getText().toString();
                GuardarDatos(_numeron);
                Intent intent = new Intent(MainActivity6.this,MainActivity11.class);
                //intent.putExtra("Numeron",_numeron);
                startActivity(intent);
            }
        });

    }
    private void GuardarDatos(String numeron) {
        preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Numeron",numeron);
        editor.commit();
    }

}