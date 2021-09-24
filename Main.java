package com.example.guicomponents;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {


            VBox vbox = new VBox(10);
            HBox hbox1 = new HBox(15);
            HBox hbox2 = new HBox(15);
            HBox hbox3 = new HBox(15);
            HBox hbox4 = new HBox(15);
            HBox hbox5 = new HBox(15);

            vbox.setAlignment(Pos.CENTER);
            hbox1.setAlignment(Pos.CENTER);

            Scene scene = new Scene(vbox,400,400);

            //Login Page
            Label label1 = new Label("Restaurant Demo");
            label1.setFont(Font.font("Times New Roman", 36));

            Separator sep = new Separator();
            sep.setMaxWidth(300);
            sep.setHalignment(HPos.CENTER);
            sep.setValignment(VPos.CENTER);

            TextField textf = new TextField();
            textf.setPromptText("Username");

            PasswordField passf = new PasswordField();
            passf.setPromptText("Password");

            Button btn1 = new Button("Log In");

            vbox.getChildren().addAll(label1, sep, textf, passf, btn1);


            //Ordering
            Label label2 = new Label();
            label2.setFont(Font.font("Times new Roman", 20));

            Label label3 = new Label("Order Type: ");
            label3.setFont(Font.font("Times new Roman", 20));

            String[] orderType = {"Dine in", "Take Away", "Delivery"};

            ChoiceBox choicebox = new ChoiceBox(FXCollections.observableArrayList(orderType));

            hbox1.getChildren().addAll(label3, choicebox);

            CheckBox cb1 = new CheckBox("Fries");
            CheckBox cb2 = new CheckBox("Pasta");
            CheckBox cb3 = new CheckBox("Soup");

            Slider sl1 = new Slider();
            sl1.setMin(0);
            sl1.setMax(5);
            sl1.setValue(0);
            sl1.setShowTickLabels(true);
            sl1.setShowTickMarks(true);
            sl1.setMajorTickUnit(1);
            sl1.setMinorTickCount(0);
            sl1.setSnapToTicks(true);

            Slider sl2 = new Slider();
            sl2.setMin(0);
            sl2.setMax(5);
            sl2.setValue(0);
            sl2.setShowTickLabels(true);
            sl2.setShowTickMarks(true);
            sl2.setMajorTickUnit(1);
            sl2.setMinorTickCount(0);
            sl2.setSnapToTicks(true);

            Slider sl3 = new Slider();
            sl3.setMin(0);
            sl3.setMax(5);
            sl3.setValue(0);
            sl3.setShowTickLabels(true);
            sl3.setShowTickMarks(true);
            sl3.setMajorTickUnit(1);
            sl3.setMinorTickCount(0);
            sl3.setSnapToTicks(true);


            RadioButton rb1 = new RadioButton("Cash");
            RadioButton rb2 = new RadioButton("Credit Card");
            ToggleGroup tg = new ToggleGroup();
            rb1.setToggleGroup(tg);
            rb2.setToggleGroup(tg);

            Label label4 = new Label("Payment Method: ");
            label4.setFont(Font.font("Times new Roman", 20));

            hbox2.getChildren().addAll(cb1, sl1);
            hbox3.getChildren().addAll(cb2, sl2);
            hbox4.getChildren().addAll(cb3, sl3);
            hbox5.getChildren().addAll(label4, rb1, rb2);

            Button btn2 = new Button("Order");

            btn1.setOnAction((ActionEvent e) -> {
                vbox.getChildren().removeAll(textf, passf, btn1);
                label2.setText("Welcome " + textf.getText());
                vbox.getChildren().addAll(label2, hbox1, hbox2, hbox3, hbox4, hbox5, btn2);
            });

            Label label5 = new Label("Thank you for ordering.\nYour order will be served soon");
            label5.setFont(Font.font("Times new Roman", 30));

            btn2.setOnAction((ActionEvent e) -> {
                vbox.getChildren().removeAll(label2, hbox1, hbox2, hbox3, hbox4, hbox5, btn2);
                vbox.getChildren().add(label5);
            });

            primaryStage.setTitle("Restaurant");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

