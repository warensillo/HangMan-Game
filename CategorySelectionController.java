package com.example.hangman.Controllers;

import com.example.hangman.Controllers.DifficultySelectionController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CategorySelectionController {
    @FXML
    private void onCategorySelected(ActionEvent event) throws IOException {
        String selectedCategory = ((Button) event.getSource()).getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/example/hangman/Views/difficulty_selection.fxml"));
        Parent root = loader.load();

        // Pass the selected category to the next screen (if needed)
        DifficultySelectionController controller = loader.getController();
        controller.setCategory(selectedCategory);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}

