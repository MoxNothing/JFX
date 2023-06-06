package com.example.demo.vista;

import com.example.demo.MainApp;
import javafx.fxml.FXML;


public class RootLayoutController {
    private MainApp mainApp;

    // Constructor
    public RootLayoutController() {
        // Inicializar mainApp
        this.mainApp = new MainApp();
    }

    // Otro método de configuración
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    @FXML
    private void handleShowBirthdayStatistics() {
        mainApp.showBirthdayStatistics();
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }
}