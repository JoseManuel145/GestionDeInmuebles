package org.example.sistemadeventas.models;

import java.util.ArrayList;
import java.util.Iterator;

public class RealState {

    private ArrayList <Empleado> empleados = new ArrayList<>();
    private ArrayList <Inmueble> inmuebles = new ArrayList<>();
    private ArrayList <Inquilino> inquilinos = new ArrayList<>();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public ArrayList<Inquilino> getInquilinos() {
        return inquilinos;
    }
    public void agregarInquilino(Inquilino inquilino){
        inquilinos.add(inquilino);
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void agregarInmueble(Inmueble inmueble){
        inmuebles.add(inmueble);
    }
    public void eliminarInmueble(String eliminar) {
        Iterator<Inmueble> iterator = inmuebles.iterator();
        while (iterator.hasNext()) {
            Inmueble inmueble = iterator.next();
            if (eliminar.equals(inmueble.getNombre())) {
                iterator.remove();
            }
        }
    }
    public void eliminarEmpleado(String eliminar){
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (eliminar.equals(empleado.getNombre())) {
                iterator.remove();
            }
        }
    }

}
