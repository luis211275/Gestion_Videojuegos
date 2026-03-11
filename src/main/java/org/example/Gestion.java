package org.example;

import org.example.clases.Usuario;
import org.example.clases.Videojuego;
import org.example.clases.enums.Genero;
import org.example.clases.recursos.MyScanner;
import org.example.clases.recursos.Utilidades;

import java.util.ArrayList;

public class Gestion {

    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Videojuego> videojuegos = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();


    /**
     * Metodo para añadir el videojuego a la lista
     */
    public static void añadirVideojuego(){
        String nombre = sc.pideTexto("Introduzca el nombre del videojuego: ");
        Genero genero = Utilidades.pedirEnum(Genero.class, "Introduzca el genero del videojuego: ");
        int velocidad_min = sc.pedirNumero("Introduzca el velocidad minima que necesita el videojuego: ");
        Videojuego videojuego = new Videojuego(nombre, genero, velocidad_min);
        videojuegos.add(videojuego);
        System.out.println("Videojuego registrado con exito");
    }

    /**
     * Metodo para mostrar los videojuegos registrados en la lista
     */
    public static void mostrarVideojuego(){
        for (Videojuego videojuego : videojuegos){
            System.out.println("Nombre del videojuego: " + videojuego.getNombre());
        }
    }

    /**
     * Metodo para buscar el videojuego en la lista
     * @param nombre establece el titulo del videojuego
     */
    public static void buscarVideojuego(String nombre){
        for (Videojuego videojuego : videojuegos){
            if (videojuego.getNombre().equals(nombre)){
                System.out.println("El videojuego introducido: "+videojuego+" esta registrado");
            }
        }
    }


    /**
     * Metodo para buscar el usuario en la lista
     * @param nombre establece el nombre del usuario registrado
     */
    public static void buscarUsuario(String nombre){
        for (Usuario usuario: usuarios){
            if (usuario.getNombre().equals(nombre)){
                System.out.println("El usuario introducido: "+usuario+" esta registrado");
            }
        }
    }






}

