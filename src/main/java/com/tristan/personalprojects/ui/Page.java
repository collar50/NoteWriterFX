package com.tristan.personalprojects.ui;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.LinkedList;
import java.util.List;

public class Page extends VBox {
    /**
     * A label for the page that the user can create.
     */
    private TextField pageLabel;
    /**
     * All of the contents added to this page.
     */
    private List<Content> contents;

    /**
     * Create and set up a new page.
     */
    public Page(){
        setupPageLabel();
        setupContextMenu();
        VBox.setVgrow(this, Priority.ALWAYS);
    }

    /**
     * Create a page label and add it to this.
     */
    private void setupPageLabel(){
        // Create a page label, and set the prompt text.
        pageLabel = new TextField();
        pageLabel.setPromptText("Enter a Page Label...");

        // Add the page label to this.
        this.getChildren().add(pageLabel);
    }

    /**
     * Create a context menu that allows users to add and remove contents from this page.
     */
    private void setupContextMenu(){

        contents = new LinkedList<>();

        MenuItem addContent = new MenuItem("Add");
        addContent.setOnAction(e -> System.out.println("Add!"));

        MenuItem removeContent = new MenuItem("Remove");
        removeContent.setOnAction(e -> System.out.println("Remove!"));


        ContextMenu contextMenu = new ContextMenu(addContent, removeContent);


        this.setOnMouseClicked(e ->{
            if (e.getButton().equals(MouseButton.SECONDARY)){
                contextMenu.show(this, e.getScreenX(), e.getScreenY());
            } else {
                contextMenu.hide();
            }
        });
    }

    /**
     * Add content to this page.
     * @param content the content to add.
     */
    private void addContent(Content content){
        this.contents.add(content);
        this.getChildren().add(content);
    }

    /**
     * Remove content from this page.
     * @param content the content to remove.
     */
    private void removeContent(Content content){
        this.contents.remove(content);
        this.getChildren().remove(content);
    }

    /**
     * Retrieve a string of all of the content in the page.
     * @return a string of all of the content in the page.
     */
    public String toString(){
        return pageLabel.getText();
    }
}
