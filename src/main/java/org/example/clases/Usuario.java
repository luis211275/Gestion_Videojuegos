package org.example.clases;

/**
 * Clase Usuario
 * @author Alumno: Luis López-Nuño
 * @version 1.0
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String suscripcion;

    /**
     * Constructor principal de la clase usuario
     *
     * @param nombre establece el nombre del usuario
     * @param apellido establece el apellido del usuario
     * @param email establece el email del usuario
     * @param suscripcion establece la suscripcion del usuario
     */
    public Usuario(String nombre, String apellido, String email, String suscripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.suscripcion = suscripcion;
    }

    /**
     * getter del atributo nombre
     *
     * @return el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     *
     * @param nombre establece el nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter del atributo apellido
     *
     * @return el apellido del usuario
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter del atributo apellido
     *
     * @param apellido establece el apellido del usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Getter del atributo email
     *
     * @return el email del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter del atributo email
     *
     * @param email establece el email del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter del atributo suscripcion
     *
     * @return la suscripcion del usuario
     */

    public String getSuscripcion() {
        return suscripcion;
    }

    /**
     * Setter del atributo suscripcion
     *
     * @param suscripcion establece la suscripcion del usuario
     */
    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }


    /**
     * Metodos para mostrar los datos del usuario
     *
     * @return texto con los datos de la pelicula
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", suscripcion='" + suscripcion + '\'' +
                '}';
    }
}
