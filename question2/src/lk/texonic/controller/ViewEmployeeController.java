package lk.texonic.controller;/*
 * @Author  dilus
 * @Project question2
 * @Created 15/03/2024 - 11:25 PM

 */

import animatefx.animation.FadeInDownBig;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViewEmployeeController {

    public void addOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("/lk/texonic/view/AddEmployeeForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        new FadeInDownBig(parent).play();

    }


    public void tblCashierClick(MouseEvent mouseEvent) {

    }

    public void refreshOnAction(ActionEvent actionEvent) {
    }
}
