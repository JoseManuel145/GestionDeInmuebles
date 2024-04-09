package org.example.sistemadeventas.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.sistemadeventas.Application;
import org.example.sistemadeventas.models.Empleado;
import org.example.sistemadeventas.models.RealState;

public class EmpleadosController {
    @FXML
    private TextField cargoTxt;
    @FXML
    private TextField direccionTxt;
    @FXML
    private TextField edadTxt;
    @FXML
    private Button eliminarBtn;
    @FXML
    private TextField eliminarTxt;
    @FXML
    private TextField fechaTxt;
    @FXML
    private Button guardarBtn;
    @FXML
    private ListView<String> lista;
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField salarioTxt;
    private ObservableList<Empleado> empleados = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        RealState tienda = Application.getHotel();

        lista.getItems().clear();

        for (Empleado i:tienda.getEmpleados()){
            lista.getItems().add(i.toString());
        }
    }

    @FXML
    void onGuardarClick(){
        String nombre = nombreTxt.getText();
        int edad = Integer.parseInt(edadTxt.getText());
        String direccion = direccionTxt.getText();
        String contrato = fechaTxt.getText();
        String cargo = cargoTxt.getText();
        double salario = Double.parseDouble(salarioTxt.getText());

        Empleado empleado = new Empleado(nombre, edad, direccion, contrato, cargo, salario);

        Application.getHotel().agregarEmpleado(empleado);
        empleados.add(empleado);

        lista.getItems().add(empleado.toString());
    }
    @FXML
    void onEliminarClick(){
        String eliminar = eliminarTxt.getText();
        Application.getHotel().eliminarEmpleado(eliminar);
        empleados.setAll(Application.getHotel().getEmpleados());

        initialize();
    }
}