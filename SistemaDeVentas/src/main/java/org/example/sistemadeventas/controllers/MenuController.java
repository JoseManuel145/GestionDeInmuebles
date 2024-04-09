package org.example.sistemadeventas.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.example.sistemadeventas.Application;

public class MenuController {

    @FXML
    private Button inmuebleBtn;
    @FXML
    private Button quitarInmuebleBtn;
    @FXML
    private Button EmpleadosBtn;
    @FXML
    private Button inquilinoBtn;
    @FXML
    private Button SalirBtn;
    @FXML
    void onInmuebleBtnClick(){
        Application.newStage("Agregar-Eliminar", "Gestion de Inmuebles");
    }
    @FXML
    void onEmpleadosBtnClick(){
        Application.newStage("Empleados", "Gestion de Empleados");
    }
    @FXML
    void onInquilinoBtnClick(){
        Application.newStage("Inquilinos", "Gestion de Inquilinos");
    }
    @FXML
    void OnSalirBtn(){
        Stage stage = (Stage) SalirBtn.getScene().getWindow();
        stage.close();
    }
}
