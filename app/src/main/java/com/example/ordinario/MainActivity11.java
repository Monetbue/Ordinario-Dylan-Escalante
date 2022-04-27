package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {
    TextView mensaje1;
    Button regresar3;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        mensaje1 = (TextView) findViewById(R.id.mensaje1);
        regresar3 = (Button) findViewById(R.id.regresar3);


        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            String dato1 = extras.getString("Nombre");
            String dato2 = extras.getString("Direccion");
            String dato3 = extras.getString("numeron");
            String dato4 = extras.getString("numeroh2");
            String dato5 = extras.getString("numerop1");
            String dato6 = extras.getString("numerop2");
            String dato7 = extras.getString("numeroh1");


            double valor1 = Double.parseDouble(dato3);
            double valor2 = Double.parseDouble(dato4);
            double valor3 = Double.parseDouble(dato5);
            double valor4 = Double.parseDouble(dato6);
            double valor5 = Double.parseDouble(dato7);
            double nfinal= valor1*150 +valor2*250 + valor3*180 + valor4*300 + valor5*90;


            if(!dato1.equals("")&&!dato2.equals("")&&!dato3.equals("")&&!dato4.equals("")&&!dato5.equals("")&&!dato6.equals("")&&!dato7.equals("")){
                mensaje1.setText("Estimado "+dato1+" con direccion: " +dato2+ " El total de tu compra es " +nfinal+ "Tu orden esta conformada por :  numero de Paquetes de hamburguesa individual: " +dato7+
                        "numero de paquetes de hamburguesa familiares: " +dato4+ "numero de paquetes de pizza + dedos de queso: " +dato5+ "numero de paquetes de pizzza doble: " +dato6+ "numero de paquetes de nachos: " +dato3);

            }
            else
                mensaje1.setText("Los datos que enviaste son incorrectos");

        }
        else {
            mensaje1.setText("No se envio ningun extra en el intent");
            LeerDatos();
        }




        regresar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity11.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void LeerDatos() {
        preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String dato1 = preferences.getString("Nombre","No hay dato");
        String dato2 = preferences.getString("Direccion","No hay dato");
        String dato3 = preferences.getString("numeron","No hay dato");
        String dato4 = preferences.getString("numeroh2","No hay dato");
        String dato5 = preferences.getString("numerop1","No hay dato");
        String dato6 = preferences.getString("numerop2","No hay dato");
        String dato7 = preferences.getString("numeroh1","No hay dato");
        double valor1 = Double.parseDouble(dato3);
        double valor2 = Double.parseDouble(dato4);
        double valor3 = Double.parseDouble(dato5);
        double valor4 = Double.parseDouble(dato6);
        double valor5 = Double.parseDouble(dato7);
        double nfinal= valor1*150 +valor2*250 + valor3*180 + valor4*300 + valor5*90;




        if(!dato1.equals("")&&!dato2.equals("")&&!dato3.equals("")&&!dato4.equals("")&&!dato5.equals("")&&!dato6.equals("")&&!dato7.equals(""))
            mensaje1.setText("Estimado "+dato1+" con direccion: " +dato2+ " El total de tu compra es " +nfinal+ "Tu orden esta conformada por :  numero de Paquetes de hamburguesa individual: " +dato7+
                    "numero de paquetes de hamburguesa familiares: " +dato4+ "numero de paquetes de pizza + dedos de queso: " +dato5+ "numero de paquetes de pizzza doble: " +dato6+ "numero de paquetes de nachos: " +dato3);

        else
            mensaje1.setText("Los datos que enviaste son incorrectos nombre: "+dato1+" direccion: "+dato2);


    }



}
