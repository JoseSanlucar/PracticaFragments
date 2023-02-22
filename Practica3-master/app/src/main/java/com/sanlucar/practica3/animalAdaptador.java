package com.sanlucar.practica3;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class animalAdaptador extends RecyclerView.Adapter<animalAdaptador.animalViewHolder> {

    public animalAdaptador (ArrayList<animal> animales){
        this.animales=animales;
    }


    ArrayList<animal> animales;
    public animalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_animal, parent,false);
        return new animalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull animalViewHolder animalViewHolder, int position) {
        animal Animal=animales.get(position);
        animalViewHolder.imgFotoCV.setImageDrawable(Animal.getFoto());
        animalViewHolder.tvNombreCV.setText(Animal.getNombre());
    }

    @Override
    public int getItemCount() {  //cantidad de animales en la lista
        return animales.size();
    }

    public static class animalViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotoCV;
        private TextView tvNombreCV;

        public animalViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFotoCV=(ImageView) itemView.findViewById(R.id.imgFotoCV);
            tvNombreCV=(TextView) itemView.findViewById(R.id.tvNombreCV);
        }
    }
}
