package org.example;

import org.example.clases.Usuario;
import org.example.clases.Videojuego;
import org.example.clases.enums.Genero;
import org.example.clases.recursos.MyScanner;
import org.example.clases.recursos.Utilidades;
import org.example.exceptions.InvalidSpeedException;
import org.example.exceptions.InvalidUserException;
import org.example.exceptions.InvalidVideogamesException;

import java.util.ArrayList;
import java.util.List;

public class Gestion {

    private static ArrayList<Videojuego> videojuegos = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();


    /**
     * metodo para añadir un videojuego a la lista
     *
     * @param videojuego creacion de un videojuego con sus datos
     */
    public void añadirVideojuego(Videojuego videojuego) {
        if (videojuego != null) {
            videojuegos.add(videojuego);
        }

    }


    /**
     * Metodo para buscar el videojuego en la lista
     *
     * @param nombre establece el titulo del videojuego
     */
    public Videojuego buscarVideojuego(String nombre) {
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getNombre().equals(nombre)) {
                return videojuego;
            }
        }
        return null;
    }


    /**
     * metodo para ver todos los videojuegos registrados
     *
     * @return todos los videojuegos registrados
     */
    public List<Videojuego> verVideojuegos() {
        return videojuegos;
    }


    /**
     * metodo para registrar los usuarios y meterlos en la lista
     *
     * @param usuario creacion de usuario con sus datos
     */

    public void registrarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        }
    }


    /**
     * Metodo para buscar el usuario en la lista
     *
     * @param correo establece el nombre del usuario registrado
     */
    public Usuario buscarUsuario(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(correo)) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * metodo para ver todos los usuarios registrados
     *
     * @return lista de todos los usuarios
     */
    public List<Usuario> verUsuarios() {
        return usuarios;
    }

}






