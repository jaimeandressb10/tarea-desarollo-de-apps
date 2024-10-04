package com.example.pruebarecyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    ImageView img_bebida;
    TextView txt_nombre_bebidas, txt_descripcion_bebidas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img_bebida = findViewById(R.id.img_bebida);
        txt_nombre_bebidas = findViewById(R.id.txt_nombre_bebidas);
        txt_descripcion_bebidas = findViewById(R.id.txt_descripcion_bebidas);

        String imagen = getIntent().getStringExtra("imagen");
        String nombre = getIntent().getStringExtra("nombre");
        String tipo = getIntent().getStringExtra("tipo");

        Picasso.get().load(imagen).into(img_bebida);
        txt_nombre_bebidas.setText(nombre);
        txt_descripcion_bebidas.setText(tipo);

    }
}