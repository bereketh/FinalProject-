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
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Invalid Entry", "Please input your ingredients.");
        }
        else {
            Recipe hotDog = new Recipe("HotDog", new String[] {"Buns", "Hotlinks"},"Cook links on stove top.");
            Recipe pasta = new Recipe("Pasta", new String[] {"Pasta", "Sauce"}, "Boil past for 5 minutes and add to sauce.");
            Recipe hamburger = new Recipe("Hamburger", new String[] {"Patties", "Buns", "Tomato", "Lettuce", "Cheese"}, "Grill patty on grill and toast buns.");
            Recipe tacos = new Recipe("Tacos", new String[] {"Meat", "Shell", "Cheese", "Salsa", "Guacamole"}, "Cook meat in a pan. Add favorite toppings to shell.");
            Recipe salad = new Recipe("Salad", new String[] {"Baby Spinach", "Tomatoes", "Dressing"}, "Mix it really good! :).");
            Recipe ramen = new Recipe("Ramen", new String[] {"Noodles", "Broth", "Protein", "Soy Sauce", "Boiled Eggs","Bamboo Shoots"}, "Boil broth and add all the shit together.");
            Recipe cookies = new Recipe("Cookies", new String[] {"Chocolate Chips", "Milk", "Butter", "Eggs", "Flour"}, "Mix together and bank at 425 degrees. Enjoy");
            Recipe[] recipes = {hotDog, pasta, hamburger, tacos, salad, ramen, cookies};
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
