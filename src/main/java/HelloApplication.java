package com.example.guidriver;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {

    /**
     GUI - Graphical User Interface

     In Java, you use Java Foundation Classes (JFC) to create a GUI

     The 3 JFC's
     - Abstract Windowing Toolkit (AWT) - since the earliest version
     of Java. There are still some aspects of AWT in use today,
     but very limited in what can be created with it.

     - Swing - Introduced in the release of Java 2 (we are currently
     at version 21). Still used today. Extends the JFrame class
     that must be imported. The components all have the letter J
     in front of the names.

     - JavaFx - is newer (since around Java 7) and incorporates touch
     screen capabilities as well as allowing windows to be
     created separately or in a browser. Extends the Application
     class that must be imported
     * However, after Java 8 it was removed from the JDK
     but IntelliJ has it built in.

     JavaFX Components/Nodes: the items in a window
     Label - An area that can display text
     TextField - An area in which the user may type a single
     line of input from the keyboard.
     Button - A button that can cause an action to occur
     when it is clicked.
     RadioButton
     CheckBox
     ListView
     ComboBox
     */
    /** un-comment the below section if you want to see the default window
     You will need to comment the other start method though */
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }

    /**
     A layout manager is an object that governs the position and sizes
     of components in a container.

     JavaFX has multiple Layout managers
     - FlowPane - Organizes the nodes in the horizontal rows according
     to the available horizontal spaces. Wraps the nodes to the next
     line if the horizontal space is less than the total width of
     the nodes
     - BorderPane - arranges components in five regions:
     top, left, center, right, and bottom
     - GridPane- arranges components in a grid rows and columns
     - HBox - Organizes the nodes in a single horizontal row (multiple columns across).
     - VBox - Organizes nodes in a single vertical column (multiple rows down).

     You can have layouts within layouts and add them to a scene,
     Ex: Create multiple HBox layouts and add them to a VBox layout
     then add the VBox layout to the scene.
     This allows you to arrange a scene in a different but similar way
     as grid or Border layouts

     */


    private TextField fNum, sNum, total; // textFields for user input or display
    private Label output;
    // radio buttons
    private RadioButton rButton1;
    private RadioButton rButton2;
    private RadioButton rButton3;

    // check boxes
    private CheckBox cBox1;
    private CheckBox cBox2;

    /** an array for a listView and Combo Box*/
    private String[] names = {"Bob", "Darryl", "Aysha", "Sue", "Trevon", "Sam", "James", "Steve"};


    @Override
    public void start(Stage primaryStage) throws IOException {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_CENTER);
        /** By default, windows are set to Top_LEFT
         but there are others: TOP_RIGHT, CENTER_LEFT, CENTER, CENTER_RIGHT
         BOTTOM_LEFT, BOTTOM_CENTER, AND BOTTOM_RIGHT */
        pane.setPadding(new Insets(30, 30, 30, 30));
        /** sets the padding around the outer edges of the window */

        pane.add(new Label("The Calculator!"), 0, 0);
        /** for grid layout, the components are placed column first, row second */
        pane.add(new Label(), 0, 1);
        fNum = new TextField();
        sNum = new TextField();

        pane.add(new Label("Enter the first number:"), 0, 2);
        pane.add(fNum, 1, 2);
        pane.add(new Label("Enter the second number:"), 0, 3);
        pane.add(sNum, 1, 3);

        Button btAdd = new Button("Add");
        OKHandlerClass handler1 = new OKHandlerClass();
        btAdd.setOnAction(handler1);

        pane.add(new Label(), 0, 4);
        pane.add(btAdd, 4, 5);
        //pane.add(new Label(), 0, 5);
        pane.add(new Label(), 0, 6);
        pane.add(new Label("Total: "), 0, 7);
        total = new TextField();
        pane.add(total, 1, 7);
        pane.add(new Label(), 0, 8);

        /** instantiate the radio buttons */
        rButton1 = new RadioButton("convert to miles");
        rButton2 = new RadioButton("convert to feet");
        rButton3 = new RadioButton("convert to inches");
        rButton1.setSelected(true); // to have one pre-selected
        /**
         Radio buttons are usually linked together, but don't
         have to be. The buttons as they are above are not linked.
         Each button can be selected independently of the other.

         You don't have to have an action listener for the radio buttons,
         but you can. If you don't have a separate action listener for
         the radio buttons, the determination of them being selected or
         not would be in a regular buttons action listener.
         */

        /** radio button can even have action listener like regular buttons */
        RadioButtonHandler radio = new RadioButtonHandler();
        rButton1.setOnAction(radio);
        rButton2.setOnAction(radio);
        rButton3.setOnAction(radio);

        /**	If you want them linked you must instantiate a toggle group
         that will link/connect the radio buttons together. This way
         only one button cna be selected. */
        ToggleGroup group = new ToggleGroup();

        /** then add the radio buttons to the buttongroup */
        rButton1.setToggleGroup(group);
        rButton2.setToggleGroup(group);
        rButton3.setToggleGroup(group);

        /** add the radio buttons to the pane */
        pane.add(rButton1, 0, 9);
        pane.add(rButton2, 1, 9);
        pane.add(rButton3, 2, 9);
        pane.add(new Label(), 0, 10);

        /** instantiate check boxes */
        cBox1 = new CheckBox("Short sleeve");
        cBox2 = new CheckBox("Long sleeve");

        /** you can't connect check boxes like radio buttons,
         but you can add an action listener */
        CheckBoxHandler cBox = new CheckBoxHandler();
        cBox1.setOnAction(cBox);
        cBox2.setOnAction(cBox);
        cBox2.setSelected(true);

        /** add the checkboxes to the pane */
        pane.add(cBox1, 1, 11);
        pane.add(cBox2, 1, 12);
        pane.add(new Label(), 0, 13);


        /** instantiate a listView */
        ListView<String> list = new ListView<String>();
        list.setPrefSize(70, 100); // you can set the size of the ListView
        /** if the area for the ListView can't contain the data, a scrollbar
         is automatically added. */
        list.getItems().addAll(names); // the names could be here instead of an array
        // or use an arraylist

        /** create a button for the listView */
        Button listButton = new Button("ListView Selection");

        /** Lambda Expression event handler - another type of action listener */
        listButton.setOnAction(event -> {
            String selected = list.getSelectionModel().getSelectedItem();
            output.setText("selection: " + selected);
        });

        /** add the list and button to the panel */
        pane.add(list, 1, 14);
        pane.add(listButton, 1, 15);
        /** You can also allow multiple selections from a listview,
         or get the index of the selected item. */

        /** A ComboBox allows users to select an item from a drop-down list */
        ComboBox combo = new ComboBox();
        /** add items to the ComboBox just like a listview */
        combo.getItems().addAll(names);

        /** to select an item from the combo box??
         you guessed it, you need an action listener
         But unlike a ListView, you don't need a separate button

         Lambda Expression event handler on the ComboBox itself */
        combo.setOnAction(event -> {
            output.setText("You selected " + combo.getValue());

        });

        /** by default combo boxes are uneditable,
         but you can make them editable by using the setEditable method */
        combo.setEditable(true);
        /** it doesn't add values to the array, it simply adds a text box
         making the editable combo box a combination of a text box and list

         add the combo box to the panel */
        pane.add(combo, 1, 16);

        output = new Label("will show output from selections");
        pane.add(new Label(),0, 19);
        pane.add(output, 0, 20);
        Scene scene = new Scene(pane, 800, 800);
        /** the first argument is the root node (layout)
         the next two are the width and height of the window */

        primaryStage.setTitle("GUI Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }





    class OKHandlerClass implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent arg0) {
//            String word = fNum.getText();
//            for(int i = 0; i < word.length(); i++){
//                Character letter = word.charAt(i);
//                if(!Character.isDigit(letter)){
//
//                }
//            }
            int first = Integer.parseInt(fNum.getText());
            int second = Integer.parseInt(sNum.getText());
            String value = String.valueOf(first + second);
            total.setText(value);
        }
    }


    class RadioButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent arg0) {
            /** Determining what was selected

             you can use the ActionEvent variable e */
            if(arg0.getSource() == rButton1) {
                // do a conversion for Miles
                output.setText("selected miles");
            }
            else if (arg0.getSource() == rButton2) {
                // do a conversion for feet
                output.setText("selected feet");
            }
            else if (arg0.getSource() == rButton3) {
                // do a conversion for feet
                output.setText("selected inches");
            }

            /** When you run this comment one section out

             Or you can use the isSelected method of the Radio Buttons */
//            if(rButton1.isSelected()) {
//                // do a conversion for Miles
//                output.setText("selected miles using the method");
//            }
//            else if (rButton2.isSelected()) {
//                // do a conversion for feet
//                output.setText("selected feet using the method");
//            }
//            else if (rButton3.isSelected()) {
//                // do a conversion for inches
//                output.setText("selected inches using the method");
//            }
        }
    }

    class CheckBoxHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent arg0) {
            /** Determining what was selected

             check boxes have an isSelected method as well */
            if(cBox1.isSelected() && cBox2.isSelected()) {
                output.setText("$50");
            }
            else if(cBox1.isSelected()) {
                output.setText("$20");
            }
            else if(cBox2.isSelected()) {
                output.setText("$30");
            }
            else {
                output.setText("What? you don't want a shirt!");
            }


//			if(arg0.getSource() == cBox1 && arg0.getSource() == cBox2) {
//				output.setText("$50");
//			}
//			else if(arg0.getSource() == cBox1) {
//				output.setText("$20");
//			}
//			else if(arg0.getSource() == cBox2) {
//				output.setText("$30");
//			}
//			else {
//				output.setText("What? you don't want a shirt!");
//			}
            /** Notice the  mistake with this implementation above,
             the variable arg0 can only be one of the checkboxes
             so using arg0.getSource doesn't work for multiple
             selections */
        }
    }


    public static void main(String[] args) {
        launch();
    }
}