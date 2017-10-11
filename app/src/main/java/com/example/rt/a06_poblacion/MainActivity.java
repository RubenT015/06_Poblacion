package com.example.rt.a06_poblacion;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private ListView lv;
    private ImageView iv;
    ArrayList<Poblacion> poblaciones;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= (TextView)findViewById(R.id.tv);
        lv= (ListView)findViewById(R.id.lv);
        iv= (ImageView)findViewById(R.id.iv);

        poblaciones = new ArrayList<>();
        Poblacion p1 = new Poblacion("Madrid","madrileños","4.000.000",R.drawable.ban_madrid);
        Poblacion p2 = new Poblacion("Alcalá","alcalainos","200.000",R.drawable.ban_alcala);
        Poblacion p3 = new Poblacion("Móstoles","mostoleños","200.000",R.drawable.ban_mostoles);
        Poblacion p4 = new Poblacion("Torrejón","torrejoneros","100.000",R.drawable.ban_torrejon);
        poblaciones.add(p1);
        poblaciones.add(p2);
        poblaciones.add(p3);
        poblaciones.add(p4);

        String[] arrayCiudades = new String[poblaciones.size()];
        for (int i = 0;i<arrayCiudades.length;i++) {
            arrayCiudades[i]=poblaciones.get(i).getCiudad();
        }

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayCiudades);
        lv.setAdapter(adaptador);
        iv.setImageBitmap(null);
        lv.setClickable(true);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Log.i("Click", "click en el elemento " + position + " de mi ListView");

                Poblacion p = poblaciones.get(position);
                tv.setText(p.getCiudad()+" cuenta con "+p.getnHabitantes()+" "+p.getGentilicio());
                Bitmap bmp=BitmapFactory.decodeResource(getResources(), p.getBandera());
                iv.setImageBitmap(Bitmap.createBitmap(bmp));

            }
        });
    }
}
