package lk.texonic.controller;/*
 * @Author  dilus
 * @Project question2
 * @Created 15/03/2024 - 10:45 PM

 */

import animatefx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController
        implements Initializable
{
    public Pane context;
    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(this.getClass().
                getResource("/lk/texonic/view/" + location + ".fxml")));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            empBtnOnAction();
            new FadeIn(context).play();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void empBtnOnAction() throws IOException {
        setUi("ViewEmployee");
        new FadeIn(context).play();
    }

    public void desBtnOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Designation");
        new FadeIn(context).play();
    }
}
