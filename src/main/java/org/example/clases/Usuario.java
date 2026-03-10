package org.example.clases;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String suscripcion;

    public Usuario(String nombre, String apellido, String email, String suscripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.suscripcion = suscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

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
