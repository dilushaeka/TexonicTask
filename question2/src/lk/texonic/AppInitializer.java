package lk.texonic;/*
 * @Author  dilus
 * @Project question2
 * @Created 15/03/2024 - 9:41 PM

 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/lk/texonic/view/Home.fxml"));

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

