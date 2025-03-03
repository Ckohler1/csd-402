/**
 * Colton Kohler
 * 3/2/2025
 * M11 Programming Assignment
 * This JavaFX program demonstrates the use of HBox and VBox layouts.
 * HBox arranges UI elements in a horizontal row, while VBox arranges them in a vertical column.
 * The program creates a graphical interface that displays both layouts with sample buttons and labels.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

/**
 * JavaFX Application demonstrating the use of HBox and VBox layouts.
 */
public class JavaFXLayouts extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creating an HBox layout
        HBox hbox = new HBox(10); // 10px spacing
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER);
        hbox.setStyle("-fx-background-color: lightgray;");

        // Adding label and buttons to HBox
        Label hboxLabel = new Label("HBox Example:");
        Button hboxBtn1 = new Button("Button 1");
        Button hboxBtn2 = new Button("Button 2");
        hbox.getChildren().addAll(hboxLabel, hboxBtn1, hboxBtn2);

        // Creating a VBox layout
        VBox vbox = new VBox(10); // 10px spacing
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: lightblue;");

        // Adding label and buttons to VBox
        Label vboxLabel = new Label("VBox Example:");
        Button vboxBtn1 = new Button("Button 1");
        Button vboxBtn2 = new Button("Button 2");
        vbox.getChildren().addAll(vboxLabel, vboxBtn1, vboxBtn2);

        // Creating a scene and adding VBox and HBox to it
        VBox root = new VBox(20); // 20px spacing between HBox and VBox
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(hbox, vbox);

        Scene scene = new Scene(root, 400, 300);

        // Configuring the Stage
        primaryStage.setTitle("JavaFX HBox and VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Main method to launch the JavaFX application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
