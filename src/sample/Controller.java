package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField searchField;

    @FXML
    private void search(ActionEvent actionEvent) {
        if (searchField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Invalid Entry", "Please input your ingredients");

        }
        else {
            Recipe hotDog = new Recipe("Hotdog", new String[] {"Buns", "Hotlinks"},"Cook links on stove top.");
            Recipe pasta = new Recipe("Pasta", new String[] {"Pasta", "Sauce"}, "Boil past for 5 mins and add to sauce");
            Recipe[] recipes = {hotDog, pasta};
            System.out.println(searchField.getText());

            for (int i = 0; i < recipes.length; i++) {
                System.out.println("Current recipe object: " + recipes[i].getName());
                for (int j = 0; j < recipes[i].getIngredients().length; i++) {
                    if (searchField.getText().equals(recipes[i].getIngredients()[j])) {

                        System.out.println(searchField.getText() + " matched with " + recipes[i].getIngredients()[j]);
                        return;
                    } else {
                        System.out.println(searchField.getText() + " did not match with " + recipes[i].getIngredients()[j]);
                    }
                }
            }
            return;
            /*
            @TODO
            Once the search input is correctly accessed, loop through the recipes to see if there are any matching
            ingredients.

            @TODO
            If there are any matching ingredients, print the name of the object with the matching ingredients to the console

            @TODO
            Print the name of the recipe containing the matching ingredient to the Alert.

            @TODO
            Print the instructions to the alert.
             */
//             AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Match Found", "Here are your options");
        }
    }

    public void blog(ActionEvent actionEvent) {
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "New Blog Created", "Congrats on your new blog!!!");
    }

    public void aboutUs(ActionEvent actionEvent) {
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "About Us", "We help you find recipes based on things you already have in your kitchen!");
    }

    public void create(ActionEvent actionEvent) {
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Create", "Congratulations, you have added a new recipe to our database!");
    }

    public void post(ActionEvent actionEvent) {
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Post", "New post created!");
    }

    public void trending(ActionEvent actionEvent) {
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Trending", "Here is whats currently trending!");
    }

    public void home(ActionEvent actionEvent) {
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Home", "You're now back on the home page! :)");
    }
}
