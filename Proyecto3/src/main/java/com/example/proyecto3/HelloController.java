package com.example.proyecto3;

import com.proyecto3.ciudades.Ciudad;
import com.proyecto3.ciudades.ObtenerCiudades;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void ButtonClick() {
        System.out.println("Hola");
        }

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
        try {
            PruebaCiudades();
        } catch (InterruptedException | IOException e) {
            System.out.println("Hubo un error en la prueba");
        }
    }
    public void PruebaCiudades() throws IOException, InterruptedException {
        ObtenerCiudades objCiudades = new ObtenerCiudades();
        ArrayList<Ciudad> listadeciudades = objCiudades.getCiudades();
        objCiudades.ImprimirMatriz(objCiudades.getMatriz());
    }
}