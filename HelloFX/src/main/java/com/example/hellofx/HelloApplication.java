package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Insets;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Text text1 = new Text("Name: ");
        Text text2 = new Text("Registered");
        TextField textField = new TextField();
        ComboBox combobox = new ComboBox();

        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");

        GridPane gridpane = new GridPane();
        gridpane.setMinSize(600, 400);
        gridpane.setPadding(new Insets(10,10,10,10));
        gridpane.setVgap(10);
        gridpane.setHgap(10);

        gridpane.setAlignment(Pos.CENTER);
        gridpane.add(text1, 0, 0);
        gridpane.add(textField, 1, 0);
        gridpane.add(button1, 1, 1);

        gridpane.add(text2, 0,2);
        gridpane.add(combobox, 1 ,2);
        gridpane.add(button2, 1 ,3);
        button1.setStyle ("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;"); button2.setStyle ("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size: 13pt;");
        text1.setStyle ("-fx-font: normal bold 20px 'serif' "); text2.setStyle ("-fx-font: normal bold 20px 'serif' "); gridpane.setStyle ("-fx-background-color: BEIGE;");





       Scene scene = new Scene(gridpane);



       stage.setScene(scene);
       stage.show();
    }
}
