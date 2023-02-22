package com.sanlucar.practica3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Mascotasfavoritas extends AppCompatActivity {

    ArrayList <animal> animales;
    private RecyclerView ListaAnimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotasfavoritas);
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ListaAnimales = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        ListaAnimales.setLayoutManager(llm);
        inicializarListaAnimales();
        inicializarAdaptador();


        TextView back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mascotasfavoritas.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
    public void inicializarAdaptador(){
        animalAdaptador adaptador = new animalAdaptador(animales);
        ListaAnimales.setAdapter(adaptador);
    }

    public void inicializarListaAnimales(){
        animales = new ArrayList<animal>();
        animales.add(new animal("Leon", getResources().getDrawable(R.mipmap.leon_foreground)));
        animales.add(new animal("Hipopotamo", getResources().getDrawable(R.mipmap.hipo2_foreground)));
        animales.add(new animal("Elefante", getResources().getDrawable(R.mipmap.elefante_foreground)));
        animales.add(new animal("Cocodrilo", getResources().getDrawable(R.mipmap.coco_foreground)));
        animales.add(new animal("Tigre", getResources().getDrawable(R.mipmap.tigre_foreground)));
    }
}