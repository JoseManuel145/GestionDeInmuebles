package org.example.sistemadeventas.models;

public class Inquilino extends Persona{
    String inmueble;
    int numCuarto;
    double costo;

    public Inquilino(String nombre, int edad, String direccion, String fechaInicio, String inmueble, int numCuarto, double costo) {
        super(nombre, edad, direccion, fechaInicio);
        this.inmueble = inmueble;
        this.numCuarto = numCuarto;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + edad + " Direccion: "
                + direccion + " Fecha de ingreso: " + fechaInicio + " Inmueble: "
                + inmueble + " Numero de cuarto: " + numCuarto + " Costo: " + costo;
    }
}
