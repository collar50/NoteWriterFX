package com.tristan.personalprojects.ui;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public abstract class Content extends VBox {
    /**
     * A label (or title) for this content.
     */
    private TextField contentLabel;

    /**
     * Create content for notes.
     */
    public Content(){
        setupContentLabel();
    }

    /**
     * Get the content label.
     * @return the content label.
     */
    TextField getContentLabel(){
        return contentLabel;
    }

    /**
     * Create a page label and add it to this.
     */
    private void setupContentLabel(){
        // Create a content label, and set the prompt text.
        contentLabel = new TextField();
        contentLabel.setPromptText("Enter a Label...");

        // Add the content label to this.
        this.getChildren().add(contentLabel
        );
    }
}
