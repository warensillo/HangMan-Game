package com.example.hangman.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DifficultySelectionController {
    private String category;
    public void setCategory(String category) {  this.category = category;}
    @FXML
    private void onDifficultySelected(ActionEvent event) throws IOException {
        String selectedDifficulty = ((Button) event.getSource()).getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/example/hangman/Views/game_screen.fxml"));
        Parent root = loader.load();

        GameController controller = loader.getController();
        controller.setupGame(category, selectedDifficulty);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
