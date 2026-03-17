package org.example;


import org.example.clases.Basic;
import org.example.clases.Suscripcion;
import org.example.clases.Usuario;
import org.example.clases.Videojuego;
import org.example.clases.enums.Genero;
import org.example.clases.recursos.MyScanner;
import org.example.exceptions.InvalidSpeedException;
import org.example.exceptions.InvalidUserException;
import org.example.exceptions.InvalidVideogamesException;

public class Main {
public static void main(String[] args) throws InvalidSpeedException, InvalidVideogamesException, InvalidUserException {

    final MyScanner sc = new MyScanner();
    Gestion g = new Gestion();

    int opcion = sc.pedirNumero("===GESTION DE VIDEOJUEGOS===" +
                                "\n1.Añadir videojuego" +
                                "\n2.Buscar videojuego" +
                                "\n3.Ver todos los videojuegos" +
                                "\n4.Registrar usuario" +
                                "\n5.Buscar usuario" +
                                "\n6.Ver los usuarios registrados" +
                                "\n7.Iniciar partida" +
                                "\n8.Finalizar partida" +
                                "\n9.Salir" +
                                "\nOpcion: ");


    switch (opcion) {
        case 1:
            g.añadirVideojuego(new Videojuego("Sonic", Genero.aventura, 10));
            break;
        case 2:
            g.buscarVideojuego("Sonic");
            break;
        case 3:
            g.verVideojuegos();
            break;
        case 4:
            g.registrarUsuario(new Usuario("Luis", "lopez", "luislopez@gmail.com", new Basic(), 2));
            break;
        case 5:
            g.buscarUsuario("Luis");
            break;
        case 6:
            g.verUsuarios();
            break;
        case 7:
            g.iniciarPartida(new Usuario("Luis", "lopez", "luislopez@gmail.com", new Basic(), 2), new Videojuego("Sonic", Genero.aventura, 10));
            break;
        case 8:
            g.finalizarPartida(new Usuario("Luis", "lopez", "luislopez@gmail.com", new Basic(), 2));
            break;
        case 9:
            break;
        default:
            System.out.println("numero no valido");
            break;
    }
}

}