package org.example.clases;

import java.util.List;

public class Suscripcion {
    protected String nombre;
    protected int velocidad_max;
    protected int num_partidas;
    protected List<String> catalogo;


    public Suscripcion(String nombre, int velocidad_max, int num_partidas, List<String> catalogo) {
        this.nombre = nombre;
        this.velocidad_max = velocidad_max;
        this.num_partidas = num_partidas;
        this.catalogo = catalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad_max() {
        return velocidad_max;
    }

    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public int getNum_partidas() {
        return num_partidas;
    }

    public void setNum_partidas(int num_partidas) {
        this.num_partidas = num_partidas;
    }

    public List<String> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<String> catalogo) {
        this.catalogo = catalogo;
    }
}
