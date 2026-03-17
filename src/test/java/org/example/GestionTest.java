package org.example;

import org.example.clases.Basic;
import org.example.clases.Usuario;
import org.example.clases.Videojuego;
import org.example.clases.enums.Genero;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionTest {
    private Gestion gestion;

    @BeforeEach
    public void setUp() {
        gestion = new Gestion();
    }


    //Tests de registrar usuarios:

    @Test
    void testRegistrarUsuario() {
        Usuario usuario = new Usuario("Luis", "Lopez", "luislopez@gmail.com", "Basic", 3);
        gestion.registrarUsuario(usuario);
        //si funciona al ver los usuarios tiene que haber uno registrado
        assertEquals(1, gestion.verUsuarios().size());
        //el email debe ser este mismo a la hora de getEmail en ver usuarios
        assertEquals("luislopez@gmail.com", gestion.verUsuarios().get(0).getEmail());
    }

    @Test
    void testRegistrarUsuariosNull(){
        gestion.registrarUsuario(null);
        //no tiene que haber nada en ver usuarios
        assertEquals(0, gestion.verUsuarios().size());
    }



    //Test de añadir videojuego

    @Test
    void testAñadirVideojuego(){
        Videojuego videojuego = new Videojuego("fifa", Genero.deporte, 30);

        gestion.añadirVideojuego(videojuego);

        //si funciona al ver los videojuegos tiene que haber uno registrado
        assertEquals(1, gestion.verVideojuegos().size());

        //el nombre debe ser este mismo a la hora de getNombre en ver usuarios
        assertEquals("fifa", gestion.verVideojuegos().get(0).getNombre());
    }


    @Test
    void testAñadirVideojuegoNull(){
        gestion.añadirVideojuego(null);

        //no tiene que haber nada en ver videojuegos
        assertEquals(0, gestion.verVideojuegos().size());
    }



    //Test de buscar usuarios
    @Test
    void buscarUsuarioExistente(){
        Usuario u = new Usuario("Luis", "Lopez", "luislopez@gmail.com", "Basic", 3);
        gestion.registrarUsuario(u);
        Usuario result = gestion.buscarUsuario("luislopez@gmail.com");

        //si he buscado un correo de un usuario que esta registrado, me tiene que salir algo, notNull
        assertNotNull(result);

        //Tiene que salir el nombre de la persona que esta registrada
        assertEquals("Luis", result.getNombre());
    }

    @Test
    void buscarUsuarioExistenteNull(){

        Usuario result = gestion.buscarUsuario("noExiste");

        //si a la hora de buscar un correo no esta registrado, dara null
        assertNull(result);
    }



    //Test de buscar videojuego

    @Test
    void buscarVideojuegoExistente(){
        Videojuego v = new Videojuego("fifa", Genero.deporte, 30);
        gestion.añadirVideojuego(v);

        Videojuego result = gestion.buscarVideojuego("fifa");

        //Si esta el nombre del juego registrado, no me dara null, por lo tanto, notNull
        assertNotNull(result);

        //Tiene que salir el nombre del nombre del videojuego que esta registrado
        assertEquals("fifa", result.getNombre());
    }

    @Test
    void buscarVideojuegoExistenteNull(){
        Videojuego result = gestion.buscarVideojuego("Minecraft");

        //si a la hora de buscar un videojuego no esta registrado, dara null
        assertNull(result);
    }




    //Test de ver todos los usuarios registrados

    @Test
    void verUsuariosVacio(){

        //va a ser verdadero que si vemos ahora los usuarios va a estar vacio ya que no hay ningun usuarios registrado
        assertTrue (gestion.verUsuarios().isEmpty());
    }

    @Test
    void verUsuario(){
        gestion.registrarUsuario(new Usuario("Luis", "Lopez", "luislopez@gmail.com", "Basic", 3));
        gestion.registrarUsuario(new Usuario("pepe", "marcos", "pepemarcos@gmail.com", "Advanced", 5));
        gestion.registrarUsuario(new Usuario("Manuel", "Domingez", "manueldominguez@gmail.com", "Premium", 3));

        assertEquals(3, gestion.verUsuarios().size());
    }


    //Test ver todos los videojuegos

    @Test
    void verVideojuegoVacio(){

        //va a ser verdadero que si vemos ahora los videojeugos va a estar vacio ya que no hay ningun videojuego registrado
        assertTrue (gestion.verVideojuegos().isEmpty());
    }

    @Test
    void verVideojuego(){
        gestion.añadirVideojuego(new  Videojuego("fifa", Genero.deporte, 30));
        gestion.añadirVideojuego(new  Videojuego("COD", Genero.lucha, 50));
        gestion.añadirVideojuego(new  Videojuego("Minecraft", Genero.aventura, 25));


        assertEquals(3, gestion.verVideojuegos().size());
    }

}