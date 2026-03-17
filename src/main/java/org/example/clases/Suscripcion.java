package org.example.clases;

import java.util.List;

/**
 * Clase suscripcion
 * @author Alumno: Luis López-Nuño Sánchez
 * @version 1.0
 */
public abstract class Suscripcion {
    protected String nombre;
    protected int velocidad_max;
    protected int num_partidas;
    protected List<String> catalogo;


    /**
     * constructor principal de la clase Suscripcion
     *
     * @param nombre establece el nombre de la suscripcion
     * @param velocidad_max establece la velocidad_max que acepta la suscripcion
     * @param num_partidas establece el numero de partidas simultaneas que acepta la suscripcion
     * @param catalogo establece la lista de videojuegos disponibles
     */
    public Suscripcion(String nombre, int velocidad_max, int num_partidas, List<String> catalogo) {
        this.nombre = nombre;
        this.velocidad_max = velocidad_max;
        this.num_partidas = num_partidas;
        this.catalogo = catalogo;
    }

    /**
     * getter del atributo nombre
     *
     * @return el nombre de la suscripcion
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     *
     * @param nombre establece el nombre de la suscripcion
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter del atributo velocidad_minima
     *
     * @return la velocidad minima de la suscripcion
     */
    public int getVelocidad_max() {
        return velocidad_max;
    }

    /**
     * Setter del atributo velocidad_minima
     *
     * @param velocidad_max establece la velocidad minima de la suscripcion
     */
    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    /**
     * Getter del atributo numero de partidas
     *
     * @return el numero de partidas de la suscripcion
     */
    public int getNum_partidas() {
        return num_partidas;
    }

    /**
     * Setter del atributo numero de partidas
     *
     * @param num_partidas establece el numero de partidas de la suscripcion
     */
    public void setNum_partidas(int num_partidas) {
        this.num_partidas = num_partidas;
    }

    /**
     * Getter del atributo catalogo
     *
     * @return la lista catalogo de la suscripcion
     */
    public List<String> getCatalogo() {
        return catalogo;
    }

    /**
     * Setter del atributo catalogo
     *
     * @param catalogo establece el catalogo de la suscrpicion
     */
    public void setCatalogo(List<String> catalogo) {
        this.catalogo = catalogo;
    }
}
