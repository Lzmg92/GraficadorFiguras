package com.example.lezs.graficadorfiguras;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Valores extends ActionBarActivity {

    Button btnok;
    Datos d = new Datos();
    TextView txtval ;
    String res;
    double hola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores);

         txtval= (TextView)findViewById(R.id.txtval);

        res = "Cantidad de figuras: "+(String.valueOf(d.Lista.size()))+ "\n";

        for (int i = 0; i < d.Lista.size(); i++){
            res = res+ d.Lista.get(i).getTipo() + " "+d.Lista.get(i).getValx()+" "+
                    d.Lista.get(i).getValy()+ " "+ d.Lista.get(i).getVal1()+" "+
                    d.Lista.get(i).getVal2()+" "+ d.Lista.get(i).getVal3()+" "+
                    d.Lista.get(i).getColor()+"\n";
        }

        txtval.setText(res);

        btnok = (Button)findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Valores.this, Resultado.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_valores, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
