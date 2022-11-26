package com.bartt.cosconiewyjdzie;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class HelloController {

    public Pane pane;
    public ArrayList<Button> przyciski = new ArrayList<>();

    @FXML
    public void initialize()
    {
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

    private void addNewButton(double x, double y)
    {
        Button btn = new Button();
        btn.setPrefSize(120, 50);
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        btn.setText("");
        pane.getChildren().add(btn);

                przyciski.add(btn);
    }

    private void addGrajButton(int x, int y)
    {
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

    private void gra()
    {
        
    }

}