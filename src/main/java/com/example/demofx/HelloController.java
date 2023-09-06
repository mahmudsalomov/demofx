package com.example.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField nprget;
//    @FXML
//    private Label button;

    @FXML
    private TextField qskvget;
    @FXML
    private TextField tskvget;


    @FXML
    protected void onButtonClick() {

        System.out.println(qskvget.getText());
        double a= Double.parseDouble(qskvget.getText());
        double a2=a*a;
        tskvget.setText(String.valueOf(a2));

//        welcomeText.setText(qskvget.getText());
//        yangi.setText("salom");
    }
}