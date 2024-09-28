package co.edu.uniquindio.marketplacefx.marketplaceapp.controller;

import co.edu.uniquindio.marketplacefx.marketplaceapp.factory.ModelFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    ModelFactory modelFactory;
    void initialize() {
        modelFactory = ModelFactory.getInstance();
    }
    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonRegister;

    @FXML
    private PasswordField textPassword;

    @FXML
    private TextField textUser;


}

