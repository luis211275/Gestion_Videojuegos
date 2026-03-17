package org.example.clases;

import org.example.clases.enums.Genero;

/**
 * Clase Videojuego
 * @author Alumno:Luis López-Nuño Sánchez
 */
public class Videojuego {
    private String nombre;
    private Genero genero;
    private int velocidadMin;

    /**
     * Constructor principal de la clase Libro
     *
      * @param nombre establece el nombre del videojuego
     * @param genero establece el genero del videojuego
     * @param velocidadMin establece la velocidad minima del videojuego
     */
    public Videojuego(String nombre, Genero genero, int velocidadMin) {
        this.nombre = nombre;
        this.genero = genero;
        this.velocidadMin = velocidadMin;
    }

    /**
     * getter del atributo Nombre
     *
     * @return el nombre del videojuego
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter del atributo nombre
     *
     * @param nombre establece el nombre del videojuego
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo genero
     *
     * @return el genero del videojuego
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Setter del atributo genero
     *
     * @param genero establece el genero del videojuego
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Getter del atributo velocidad_minima
     *
     * @return la velocidad minima del videojuego
     */
    public int getVelocidad_min() {
        return velocidadMin;
    }

    /**
     * Setter del atributo velocidad_minima
     *
     * @param velocidadMin establece3 la velocidad_minima del videojuego
     */

    public void setVelocidad_min(int velocidadMin) {
        this.velocidadMin = velocidadMin;
    }

    /**
     * Metodo para mostrar los datos del videojuego
     *
     * @return texto con todos los datos del videojuego
     */

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", velocidad_min=" + velocidadMin +
                '}';
    }
}
