package org.example.sistemadeventas.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.sistemadeventas.Application;
import org.example.sistemadeventas.models.Inmueble;
import org.example.sistemadeventas.models.Inquilino;
import org.example.sistemadeventas.models.RealState;

public class InquilinosController {
    @FXML
    private TextField costoTxt;

    @FXML
    private TextField cuartoTxt;

    @FXML
    private TextField direccionTxt;

    @FXML
    private TextField edadTxt;

    @FXML
    private TextField estadiaTxt;

    @FXML
    private Button guardarBtn;

    @FXML
    private TextField inmuebleTxt;

    @FXML
    private ListView<String> lista;

    @FXML
    private TextField nombreTxt;
    private ObservableList<Inquilino> inquilinos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        RealState tienda = Application.getHotel();

        lista.getItems().clear();

        for (Inquilino i:tienda.getInquilinos()){
            lista.getItems().add(i.toString());
        }
    }
    @FXML
    void onGuardarBtnClick(){
        String nombre = nombreTxt.getText();
        int edad = Integer.parseInt(edadTxt.getText());
        String direccion = direccionTxt.getText();
        String estadia = estadiaTxt.getText();
        String inmueble = inmuebleTxt.getText();
        int numCuarto = Integer.parseInt(cuartoTxt.getText());
        double costo = Double.parseDouble(costoTxt.getText());

        Inquilino inquilino = new Inquilino(nombre, edad, direccion, estadia, inmueble, numCuarto, costo);

        Application.getHotel().agregarInquilino(inquilino);
        inquilinos.add(inquilino);
        lista.getItems().add(inquilino.toString());
    }
}
