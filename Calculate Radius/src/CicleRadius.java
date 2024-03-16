import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CicleRadius extends Application {

    private final String imagePath = "./assets/img.png";
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Image view for the circle
        ImageView circleImageView = new ImageView();

        // Load the circle image (replace "circle.png" with your image path)
        try {
            Image circleImage = new Image(getClass().getResourceAsStream(imagePath));
            circleImageView.setImage(circleImage);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + imagePath);
        }
        Label oLabel = new Label("");
        Label gLabel = new Label("Enter Value g:");
        TextField gInput = new TextField();
        Label fLabel = new Label("Enter Value f:");
        TextField fInput = new TextField();
        Label cLabel = new Label("Enter Value c:");
        TextField cInput = new TextField();


        Button calculateButton = new Button("Calculate Radius");


        Label radiusLabel = new Label("Radius:");
        Label radiusValue = new Label();

        // Calculate button action
        calculateButton.setOnAction(event -> {
            try {
                // Get values of TextFields
                double g = Double.parseDouble(gInput.getText());
                double f = Double.parseDouble(fInput.getText());
                double c = Double.parseDouble(cInput.getText());

                // Calculate radius using separate method (explained later)
                double radius = calculateRadius(g, f, c);

                // Update radius label
                radiusValue.setText(String.valueOf(radius));
            } catch (NumberFormatException e) {
                // Handle invalid input (non-numeric values)
                radiusValue.setText("Invalid Input. Please enter numbers only.");
            }
        });

        // Layout using GridPane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(15));
        pane.setHgap(15);
        pane.setVgap(10);

        pane.add(circleImageView,0,0);
//        pane.add(oLabel, 0, 0);
        pane.add(gLabel, 0, 1);
        pane.add(gInput, 1, 1);
        pane.add(fLabel, 0, 2);
        pane.add(fInput, 1, 2);
        pane.add(cLabel, 0, 3);
        pane.add(cInput, 1, 3);
        pane.add(calculateButton, 0, 4);
        pane.add(radiusLabel, 0, 5);
        pane.add(radiusValue, 1, 5);

        // Scene and Stage setup
        Scene scene = new Scene(pane, 800, 400);
        primaryStage.setTitle("Circle Radius Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Separate method to calculate radius
    private double calculateRadius(double g, double f, double c) {
        if (g * g + f * f - c <= 0) {
            throw new IllegalArgumentException("Invalid circle equation. g^2 + f^2 - c must be positive for a circle.");
        }
        return Math.sqrt(g * g + f * f - c);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
