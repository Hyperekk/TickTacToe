package com.bartt.cosconiewyjdzie;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {
    boolean czyX = false;
    int tura = 0;
    int punktyO = 0;
    int punktyX = 0;
    public Pane pane;
    public ArrayList<Button> przyciski = new ArrayList<>();

    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    @FXML
    public void initialize() {
        addNewButton(100, 290);
        addNewButton(250, 290);
        addNewButton(400, 290);
        addNewButton(100, 190);
        addNewButton(250, 190);
        addNewButton(400, 190);
        addNewButton(100, 90);
        addNewButton(250, 90);
        addNewButton(400, 90);
        addGrajButton(30, 10);
    }

    public void allert()
    {
        alert.showAndWait();

    }

    private void addNewButton(double x, double y) {
        Button btn = new Button();
        btn.setPrefSize(120, 50);
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        btn.setText("");
        pane.getChildren().add(btn);

        przyciski.add(btn);
    }

    private void addGrajButton(int x, int y) {
        Button btn = new Button();
        btn.setPrefSize(120, 50);
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        btn.setText("GRAJ");
        pane.getChildren().add(btn);

        btn.setOnAction(event -> {
            gra();
        });
    }

    private void gra() {
        ruch();
    }

    public void ruch() {
        Scanner skaner = new Scanner(System.in);
        int liczba = skaner.nextInt(8) + 1;

        if (czyX == false)
            if (przyciski.get(liczba).getText() == null) {
                przyciski.get(liczba).setText("O");

            } else {
                liczba = skaner.nextInt(8) + 1;
                przyciski.get(liczba).setText("O");
            }

        else if (przyciski.get(liczba).getText() == null) {
            przyciski.get(liczba).setText("X");

        } else {
            liczba = skaner.nextInt(8) + 1;
            przyciski.get(liczba).setText("X");
        }
        czyX = !czyX;

        przyciski.get(liczba).setDisable(true);
        czyWygral();
    }

    public void czyJestMiejsce() {

    }


    public void czyWygral() {
        if (przyciski.get(0).getText().equals("O") && przyciski.get(1).getText().equals("O") && przyciski.get(2).getText().equals("O") || przyciski.get(3).getText().equals("O") && przyciski.get(4).getText().equals("O") && przyciski.get(5).getText().equals("O") || przyciski.get(6).getText().equals("O") && przyciski.get(7).getText().equals("O") && przyciski.get(8).getText().equals("O") ||
                przyciski.get(0).getText().equals("O") && przyciski.get(4).getText().equals("O") && przyciski.get(8).getText().equals("O") || przyciski.get(2).getText().equals("O") && przyciski.get(4).getText().equals("O") && przyciski.get(6).getText().equals("O") ||
                przyciski.get(0).getText().equals("O") && przyciski.get(3).getText().equals("O") && przyciski.get(6).getText().equals("O") || przyciski.get(1).getText().equals("O") && przyciski.get(4).getText().equals("O") && przyciski.get(7).getText().equals("O") || przyciski.get(2).getText().equals("O") && przyciski.get(5).getText().equals("O") && przyciski.get(8).getText().equals("O")) {
            punktyO++;
            alert.setContentText("wygrana O");
            allert();
            przyciski.get(0).setDisable(true);
            przyciski.get(1).setDisable(true);
            przyciski.get(2).setDisable(true);
            przyciski.get(3).setDisable(true);
            przyciski.get(4).setDisable(true);
            przyciski.get(5).setDisable(true);
            przyciski.get(6).setDisable(true);
            przyciski.get(7).setDisable(true);
            przyciski.get(8).setDisable(true);
            tura = 0;
        } else if (przyciski.get(0).getText().equals("X") && przyciski.get(1).getText().equals("X") && przyciski.get(2).getText().equals("X") || przyciski.get(3).getText().equals("X") && przyciski.get(4).getText().equals("X") && przyciski.get(5).getText().equals("X") || przyciski.get(6).getText().equals("X") && przyciski.get(7).getText().equals("X") && przyciski.get(8).getText().equals("X") ||
                przyciski.get(0).getText().equals("X") && przyciski.get(4).getText().equals("X") && przyciski.get(8).getText().equals("X") || przyciski.get(2).getText().equals("X") && przyciski.get(4).getText().equals("X") && przyciski.get(6).getText().equals("X") ||
                przyciski.get(0).getText().equals("X") && przyciski.get(3).getText().equals("X") && przyciski.get(6).getText().equals("X") || przyciski.get(1).getText().equals("X") && przyciski.get(4).getText().equals("X") && przyciski.get(7).getText().equals("X") || przyciski.get(2).getText().equals("X") && przyciski.get(5).getText().equals("X") && przyciski.get(8).getText().equals("X")) {
            punktyX++;
            alert.setContentText("wygrana X");
            allert();
            przyciski.get(0).setDisable(true);
            przyciski.get(1).setDisable(true);
            przyciski.get(2).setDisable(true);
            przyciski.get(3).setDisable(true);
            przyciski.get(4).setDisable(true);
            przyciski.get(5).setDisable(true);
            przyciski.get(6).setDisable(true);
            przyciski.get(7).setDisable(true);
            przyciski.get(8).setDisable(true);
            tura = 0;
        } else if (tura == 9) {
            alert.setContentText("remis");
            allert();
            tura = 0;
        }

    }

}