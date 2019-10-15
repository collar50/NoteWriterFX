package com.tristan.personalprojects.ui;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public abstract class Content extends VBox {
    private TextField contentLabel;

    public Content(){
        setupContentLabel();
    }

    /**
     * Create a page label and add it to this.
     */
    private void setupContentLabel(){
        // Create a content label, and set the prompt text.
        contentLabel = new TextField();
        contentLabel.setPromptText("Enter a Page Label...");

        // Add the content label to this.
        this.getChildren().add(contentLabel
        );
    }
}
