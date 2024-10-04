package com.example.pruebarecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.adaptadores.BebidasAdaptador;
import com.example.pruebarecyclerview.clases.Bebida;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_bebidas;
    List<Bebida> listaBebidas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_bebidas = findViewById(R.id.rcv_bebidas);

        Bebida usu1 = new Bebida("https://www.thecocktaildb.com/images/media/drink/vrwquq1478252802.jpg","Old fashioned","Cóctel para tomar con amigos");
        Bebida usu2 = new Bebida("https://www.thecocktaildb.com/images/media/drink/qgdu971561574065.jpg","Long island tea","Cóctel para tomar solo");
        Bebida usu3 = new Bebida("https://cocteleriacreativa.com/sites/default/files/styles/cover/public/imagen/receta/Bluecoat-Negroni_DTA1606_cocteleria-creativa_900x675.jpg?itok=VhsnNoaV","Negroni","Cóctel para tomar con familia");
        Bebida usu4 = new Bebida("https://www.thecocktaildb.com/images/media/drink/hbkfsh1589574990.jpg","Whiskey sour","Cóctel para personas cultas");

        listaBebidas.add(usu1);
        listaBebidas.add(usu2);
        listaBebidas.add(usu3);
        listaBebidas.add(usu4);

        rcv_bebidas.setLayoutManager(new LinearLayoutManager(this));
        rcv_bebidas.setAdapter(new BebidasAdaptador(listaBebidas));


    }
}