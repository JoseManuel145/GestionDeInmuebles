package org.example.sistemadeventas.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.sistemadeventas.Application;
import org.example.sistemadeventas.models.Inmueble;
import org.example.sistemadeventas.models.RealState;


public class GestionInmuebleController {
    @FXML
    private ListView<String> list;
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField ubicacionTxt;
    @FXML
    private TextField cuartosTxt;
    @FXML
    private TextField eliminarTxt;
    @FXML
    private Button guardarBtn;
    @FXML
    private Button eliminarBtn;

    private ObservableList<Inmueble> inmuebles = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        RealState tienda = Application.getHotel();

        list.getItems().clear();

        for (Inmueble i:tienda.getInmuebles()){
            list.getItems().add(i.toString());
        }
    }

    @FXML
    void guardarBtnClick(){
        String nombre = nombreTxt.getText();
        String ubicacion = ubicacionTxt.getText();
        int cuartos = Integer.parseInt(cuartosTxt.getText());

        Inmueble inmueble = new Inmueble(nombre, ubicacion, cuartos);
        Application.getHotel().agregarInmueble(inmueble);
        inmuebles.add(inmueble);

        list.getItems().add(inmueble.toString());
    }

    @FXML
    void eliminarBtnClick() {
        String eliminar = eliminarTxt.getText();
        Application.getHotel().eliminarInmueble(eliminar);
        inmuebles.setAll(Application.getHotel().getInmuebles());

        initialize();
    }

}
