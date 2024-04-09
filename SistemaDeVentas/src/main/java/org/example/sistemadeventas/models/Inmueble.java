package org.example.sistemadeventas.models;

public class Inmueble {
    String nombre;
    String ubicacion;
    int numCuartos;
    public Inmueble(String nombre, String ubicacion, int numCuartos) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numCuartos = numCuartos;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Ubicacion: " + ubicacion + " Numero de cuartos: "
                + numCuartos;
    }

}
