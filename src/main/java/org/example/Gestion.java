package org.example;

import org.example.clases.Suscripcion;
import org.example.clases.Usuario;
import org.example.clases.Videojuego;
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


    /**
     * metodod para iniciar la partida
     *
     * @param usuario usuario de la clase
     * @param videojuego videojuego de la clase
     * @throws InvalidUserException excepcion de usuario invalido
     * @throws InvalidVideogamesException excepcion de videojuego invalido
     * @throws InvalidSpeedException excepcion velocidad invalida
     */
    public void iniciarPartida(Usuario usuario, Videojuego videojuego)
            throws InvalidUserException, InvalidVideogamesException, InvalidSpeedException {

        Suscripcion plan = usuario.getSuscripcion();


        if (usuario.getNumPartidas() >= plan.getNum_partidas()) {
            throw new InvalidUserException("Límite de partidas simultáneas alcanzado. Su plan permite un máximo de " + plan.getNum_partidas() + ".");
        }


        if (!plan.getCatalogo().contains(videojuego.getNombre())) {
            throw new InvalidVideogamesException("El juego '" + videojuego.getNombre() + "' no está incluido en su catálogo actual.");
        }


        if (plan.getVelocidad_max() < videojuego.getVelocidad_min()) {
            throw new InvalidSpeedException("Velocidad insuficiente. El juego requiere " + videojuego.getVelocidad_min() +
                    " Mbps, pero su plan ofrece máximo " + plan.getVelocidad_max() + " Mbps.");
        }


        usuario.setNumPartidas(usuario.getNumPartidas() + 1);
        System.out.println("Partida iniciada con éxito para el juego: " + videojuego.getNombre());
    }

    /**
     * metodo para finalizar la partida
     *
     * @param usuario usuario de la clase
     */
    public void finalizarPartida(Usuario usuario) {

        if (usuario.getNumPartidas() > 0) {
            usuario.setNumPartidas(usuario.getNumPartidas() - 1);
            System.out.println("Partida finalizada. Partidas activas actualmente: " + usuario.getNumPartidas());
        } else {
            System.out.println("El usuario no tiene ninguna partida activa en este momento.");
        }
    }

}






