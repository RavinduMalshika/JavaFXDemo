package lk.ijse.stockmanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane formPane;
    public AnchorPane rootNode;
    public Button dashboardBtn;
    public Button customerBtn;
    public Button itemBtn;
    public Button supplierBtn;

    public void customerBtnOnAction(ActionEvent actionEvent) throws Exception {
        Parent formPane = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        this.formPane.getChildren().clear();
        this.formPane.getChildren().add(formPane);

        dashboardBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
        customerBtn.setStyle("-fx-background-color: #99B85A;");
        itemBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
        supplierBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
    }

    public void itemBtnOnAction(ActionEvent actionEvent) throws Exception{
        Parent formPane = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        this.formPane.getChildren().clear();
        this.formPane.getChildren().add(formPane);

        dashboardBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
        customerBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
        itemBtn.setStyle("-fx-background-color: #99B85A;");
        supplierBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
    }

    public void supplierBtnOnAction(ActionEvent actionEvent) throws Exception{
        Parent formPane = FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));

        this.formPane.getChildren().clear();
        this.formPane.getChildren().add(formPane);

        dashboardBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
        customerBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
        itemBtn.setStyle("-fx-background-color:  linear-gradient(to top, #A8C272, #D4E1BA);");
        supplierBtn.setStyle("-fx-background-color: #99B85A;");
    }

    public void dashboardBtnOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
    }

    public void LogoutBtnOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.close();

        Stage loginStage = new Stage();
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);

        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
        stage.show();
    }
}
