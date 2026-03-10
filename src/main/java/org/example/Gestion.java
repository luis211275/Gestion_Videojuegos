package org.example;

import org.example.clases.Videojuego;
import org.example.clases.enums.Genero;
import org.example.clases.recursos.MyScanner;
import org.example.clases.recursos.Utilidades;

import java.util.ArrayList;

public class Gestion {

    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Videojuego> videojuegos = new ArrayList<>();

    public static void registarVideojuego(){
        String nombre = sc.pideTexto("Introduzca el nombre del videojuego: ");
        Genero genero = Utilidades.pedirEnum(Genero.class, "Introduzca el genero del videojuego: ");
        int velocidad_min = sc.pedirNumero("Introduzca el velocidad minima que necesita el videojuego: ");
        Videojuego videojuego = new Videojuego(nombre, genero, velocidad_min);
        videojuegos.add(videojuego);
        System.out.println("Videojuego registrado con exito");
    }

    public static void mostrarVideojuego(){
        for (Videojuego videojuego : videojuegos){
            System.out.println("Nombre del videojuego: " + videojuego.getNombre());
        }
    }


}

