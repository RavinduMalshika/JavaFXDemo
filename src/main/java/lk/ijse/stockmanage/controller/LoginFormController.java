package lk.ijse.stockmanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.stockmanage.db.Db;

import java.io.IOException;

public class LoginFormController {
    public TextField usernameField;
    public PasswordField pwdField;
    public AnchorPane rootNode;

    public void loginBtnOnAction(ActionEvent actionEvent) throws IOException {
        if(Db.USERNAME.equals(usernameField.getText()) && Db.PASSWORD.equals(pwdField.getText())) {
            Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
            primaryStage.close();

            Stage stage = new Stage();

            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.setTitle("Stock Manager");
            stage.centerOnScreen();
            stage.show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Wrong credentials \nUsername: Admin \nPassword: pass").show();
        }
    }

    public void usernameFieldOnAction(ActionEvent actionEvent) {
        pwdField.requestFocus();
    }

    public void pwdFieldOnAction(ActionEvent actionEvent) throws IOException{
        loginBtnOnAction(actionEvent);
    }
}
