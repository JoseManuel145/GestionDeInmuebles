package org.example.sistemadeventas.models;

public class Empleado extends Persona{
    String cargo;
    double salario;
    public Empleado(String nombre, int edad, String direccion, String cargo, String fechaContrato, double salario) {
        super(nombre, edad, direccion, fechaContrato);
        this.cargo = cargo;
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + edad + " Direccion: "
                + direccion + " Cargo: " + cargo + " Fecha en que se contrato: "
                + fechaInicio + " Salario: " + salario;
    }

}
