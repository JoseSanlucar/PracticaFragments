package com.sanlucar.practica3;

import android.graphics.drawable.Drawable;

public class animal {

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Drawable getFoto() {
        return foto;
    }

    public void setFoto(Drawable foto) {
        this.foto = foto;
    }

    private String Nombre;
    private Drawable foto;

    public animal(String nombre, Drawable foto) {
        Nombre = nombre;
        this.foto = foto;
    }
}
