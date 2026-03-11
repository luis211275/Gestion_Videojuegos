package org.example.clases;

import org.example.clases.enums.Genero;

/**
 * Clase Videojuego
 * @author Alumno:Luis López-Nuño Sánchez
 */
public class Videojuego {
    private String nombre;
    Genero genero;
    private int velocidad_min;

    /**
     * Constructor principal de la clase Libro
     *
      * @param nombre establece el nombre del videojuego
     * @param genero establece el genero del videojuego
     * @param velocidad_min establece la velocidad minima del videojuego
     */
    public Videojuego(String nombre, Genero genero, int velocidad_min) {
        this.nombre = nombre;
        this.genero = genero;
        this.velocidad_min = velocidad_min;
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
        return velocidad_min;
    }

    /**
     * Setter del atributo velocidad_minima
     *
     * @param velocidad_min establece3 la velocidad_minima del videojuego
     */

    public void setVelocidad_min(int velocidad_min) {
        this.velocidad_min = velocidad_min;
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
                ", velocidad_min=" + velocidad_min +
                '}';
    }
}
