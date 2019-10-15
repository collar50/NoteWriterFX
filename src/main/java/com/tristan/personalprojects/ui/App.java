package com.tristan.personalprojects.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private VBox sidebar;
    private VBox pageDisplay;

    @Override
    public void start(Stage stage) {
        // Set up sidebar.
        sidebar = new VBox();
        sidebar.setStyle("-fx-background-color: black;");

        // Set up page display.
        pageDisplay = new VBox();
        pageDisplay.setStyle("-fx-background-color: red");

        // Create container for sidebar and page display.
        SplitPane container = new SplitPane(sidebar, pageDisplay);

        // Create scene.
        Scene scene = new Scene(container, 512, 512);

        // Set up stage.
        stage.setTitle("NoteWriterFX");
        stage.setScene(scene);
        stage.show();

        // Playground stuff.
        addPage();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void addPage(){
        pageDisplay.getChildren().add(new Page());
        VBox.setVgrow(pageDisplay, Priority.ALWAYS);
    }
}