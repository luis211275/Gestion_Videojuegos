package org.example;

import org.example.clases.Suscripcion;
import org.example.clases.Usuario;
import org.example.clases.Videojuego;
import org.example.clases.enums.Genero;
import org.example.exceptions.InvalidSpeedException;
import org.example.exceptions.InvalidUserException;
import org.example.exceptions.InvalidVideogamesException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GestionTest {

    private Gestion gestion;

    @BeforeEach
    void setUp() {
        gestion = new Gestion();
        gestion.verVideojuegos().clear();
        gestion.verUsuarios().clear();
    }




    // --- TESTS DE GESTIÓN DE VIDEOJUEGOS ---

    @Test
    void testAñadirVideojuego() {
        Videojuego v = new Videojuego("FIFA 24", Genero.deporte, 50);
        gestion.añadirVideojuego(v);

        //tendra que contener el videojuego añadido y tambien habra 1 videojuego en la lista
        assertEquals(1, gestion.verVideojuegos().size());
        assertTrue(gestion.verVideojuegos().contains(v));
    }

    @Test
    void testAñadirVideojuegoNulo() {
        gestion.añadirVideojuego(null);

        //si no hay nada, no habra nada en la lista
        assertEquals(0, gestion.verVideojuegos().size());
    }

    @Test
    void testBuscarVideojuegoExistente() {
        Videojuego v = new Videojuego("The Last of Us", Genero.aventura, 100);
        gestion.añadirVideojuego(v);

        Videojuego encontrado = gestion.buscarVideojuego("The Last of Us");

        //no es nulo por que el nombre es el mismo, y por eso se ha encontrado
        assertNotNull(encontrado);
        assertEquals("The Last of Us", encontrado.getNombre());
    }

    @Test
    void testBuscarVideojuegoNoExistente() {
        Videojuego encontrado = gestion.buscarVideojuego("Juego Inexistente");

        //al ser no existir ningun juego en la lista, será null
        assertNull(encontrado);
    }




    // --- TESTS DE GESTIÓN DE USUARIOS ---

    @Test
    void testRegistrarUsuario() {
        Suscripcion plan = new Suscripcion("Plan Test", 100, 2, Arrays.asList("Mario Kart")) {};
        Usuario u = new Usuario("Juan", "Perez", "juan@mail.com", plan, 0);

        gestion.registrarUsuario(u);

        //habra 1 en la lista de usuarios registrados, el añadido
        assertEquals(1, gestion.verUsuarios().size());
    }

    @Test
    void testBuscarUsuarioExistente() {
        Suscripcion plan = new Suscripcion("Plan Test", 100, 2, Arrays.asList("Mario Kart")) {};
        Usuario u = new Usuario("Ana", "Gomez", "ana@mail.com", plan, 0);
        gestion.registrarUsuario(u);

        Usuario encontrado = gestion.buscarUsuario("ana@mail.com");

        //al haber encontrado el mail, no sera nulo
        assertNotNull(encontrado);
        assertEquals("ana@mail.com", encontrado.getEmail());
    }





    // --- TESTS DE INICIAR Y FINALIZAR PARTIDA ---

    @Test
    void testIniciarPartidaExito() throws Exception {
        Videojuego v = new Videojuego("Mario Kart", null, 50);
        Suscripcion plan = new Suscripcion("Plan Test", 100, 2, Arrays.asList("Mario Kart")) {};
        Usuario u = new Usuario("Luis", "Garcia", "luis@mail.com", plan, 0);

        gestion.iniciarPartida(u, v);

        //compruebo primero si se ha añadido los datos introducidos primeros
        assertEquals(1, u.getNumPartidas());
    }

    @Test
    void testIniciarPartidaFallaPorLimitePartidas() {
        Videojuego v = new Videojuego("Mario Kart", null, 50);
        Suscripcion plan = new Suscripcion("Plan Test", 100, 1, Arrays.asList("Mario Kart")) {};
        Usuario u = new Usuario("Luis", "Garcia", "luis@mail.com", plan, 0);

        u.setNumPartidas(1);

        //gracias a la excepcion que he creado, se puede comprobar si funcionan las validaciones
        assertThrows(InvalidUserException.class, () -> {
            gestion.iniciarPartida(u, v);
        });
    }

    @Test
    void testIniciarPartidaFallaPorCatalogo() {
        Videojuego v = new Videojuego("Zelda", null, 50);
        Suscripcion plan = new Suscripcion("Plan Test", 100, 2, Arrays.asList("Mario Kart", "FIFA")) {};
        Usuario u = new Usuario("Luis", "Garcia", "luis@mail.com", plan, 0);


        //gracias a la excepcion que he creado, se puede comprobar si funcionan las validaciones
        assertThrows(InvalidVideogamesException.class, () -> {
            gestion.iniciarPartida(u, v);
        });
    }

    @Test
    void testIniciarPartidaFallaPorVelocidad() {
        Videojuego v = new Videojuego("Cyberpunk", null, 150);
        Suscripcion plan = new Suscripcion("Plan Test", 100, 2, Arrays.asList("Cyberpunk")) {};
        Usuario u = new Usuario("Luis", "Garcia", "luis@mail.com", plan, 0);


        //gracias a la excepcion que he creado, se puede comprobar si funcionan las validaciones
        assertThrows(InvalidSpeedException.class, () -> {
            gestion.iniciarPartida(u, v);
        });
    }

    @Test
    void testFinalizarPartidaExito() {
        Suscripcion plan = new Suscripcion("Plan Test", 100, 2, Arrays.asList("Mario Kart")) {};
        Usuario u = new Usuario("Luis", "Garcia", "luis@mail.com", plan, 0);

        u.setNumPartidas(2);
        gestion.finalizarPartida(u);

        //valido si funciona el final de la partida, teniendo que restar una numPartidas

        assertEquals(1, u.getNumPartidas());
    }

    @Test
    void testFinalizarPartidaSinPartidasActivas() {
        Suscripcion plan = new Suscripcion("Plan Test", 100, 2, Arrays.asList("Mario Kart")) {};
        Usuario u = new Usuario("Luis", "Garcia", "luis@mail.com", plan, 0);

        u.setNumPartidas(0);
        gestion.finalizarPartida(u);

        //Si no hay paradas, no tiene que cambiar nada el numero
        assertEquals(0, u.getNumPartidas());
    }
}