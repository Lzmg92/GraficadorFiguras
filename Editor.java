package com.example.lezs.graficadorfiguras;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.FileInputStream;
import java.util.LinkedList;


public class Editor extends ActionBarActivity {

    Button btncompilar;
    TextView txtcodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        btncompilar = (Button)findViewById(R.id.btncompilar);
        btncompilar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String texto = txtcodigo.getText().toString();
                try {
                    new Parser(new Scanner(new java.io.StringReader(texto))).parse();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Intent intent = new Intent(Editor.this, Valores.class);
                startActivity(intent);
            }
        });





        txtcodigo = (TextView)findViewById(R.id.txtcodigo);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
