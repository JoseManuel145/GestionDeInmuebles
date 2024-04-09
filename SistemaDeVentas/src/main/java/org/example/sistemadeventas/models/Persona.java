package org.example.sistemadeventas.models;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String direccion;
    protected String fechaInicio;

    public Persona(String nombre, int edad, String direccion, String fechaInicio) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }
}
