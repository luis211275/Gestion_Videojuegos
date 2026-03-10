package org.example.clases;

import org.example.clases.enums.Genero;

public class Videojuego {
    private String nombre;
    Genero genero;
    private int velocidad_min;

    public Videojuego(String nombre, Genero genero, int velocidad_min) {
        this.nombre = nombre;
        this.genero = genero;
        this.velocidad_min = velocidad_min;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getVelocidad_min() {
        return velocidad_min;
    }

    public void setVelocidad_min(int velocidad_min) {
        this.velocidad_min = velocidad_min;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", velocidad_min=" + velocidad_min +
                '}';
    }
}
