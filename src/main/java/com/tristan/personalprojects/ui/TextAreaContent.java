package com.tristan.personalprojects.ui;

import javafx.scene.control.TextArea;

public class TextAreaContent extends Content{
    /**
     * An area where notes can be written.
     */
    private TextArea textArea;

    /**
     * Create text area content for notes.
     */
    public TextAreaContent(){
        super();
        setupThis();
        setupTextArea();
    }

    /**
     * Set up this content.
     */
    private void setupThis(){

    }

    /**
     * Set up the text area.
     */
    private void setupTextArea(){
        textArea = new TextArea();
        textArea.setPromptText("Enter notes here...");
        textArea.setWrapText(true);
        this.getChildren().add(textArea);
    }

    /**
     * Return the label in quotes and the content of the text area.
     * @return a string representation of this TextAreaContent.
     */
    public String toString(){
        return "(" + getContentLabel().getText() + ") " + textArea.getText();
    }
}
