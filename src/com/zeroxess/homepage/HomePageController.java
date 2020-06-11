package com.zeroxess.homepage;

import com.zeroxess.condition.Condition;
import com.zeroxess.livestockpage.LiveStockController;
import com.zeroxess.user.DoctorUser;
import com.zeroxess.user.UserManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML   GridPane homePane;
    @FXML   ListView<String> upcomingAppointmentsList;

    public void initialize(){ upcomingAppointmentsList.setItems(UserManager.getInstance().getLoggedInUser().getUpcomingAppointments()); }

    @FXML
    Button conditionsButton;

    public void initialize() {
        if(!(UserManager.getInstance().getLoggedInUser() instanceof DoctorUser)){
            conditionsButton.setDisable(true);
        }
    }

    public void openProfileManager() throws IOException {
        Stage stage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/profilepage/profilepage.fxml"));
        Scene scene =  new Scene(root, 800 ,600);
        stage.setScene(scene);
        stage.show();
    }

    public void openContacts() throws IOException {
        Stage stage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/contactspage/contacts.fxml"));
        Scene scene =  new Scene(root, 800 ,600);
        stage.setScene(scene);
        stage.show();
    }

    public void openLiveStock() {
        Stage stage = (Stage) homePane.getScene().getWindow();
        new LiveStockController().start(stage);
    }

    public void openMarket() throws IOException {
        Stage stage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/marketpage/marketpage.fxml"));
        Scene scene =  new Scene(root, 800 ,600);
        stage.setScene(scene);
        stage.show();
    }

    public void openAppointmentsManager() throws IOException {
        Stage stage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/medical/appointmentmanager.fxml"));
        Scene scene =  new Scene(root, 800 ,600);
        stage.setScene(scene);
        stage.show();
    }

    public void openConditions() throws IOException {
        Stage stage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/condition/conditionpage.fxml"));
        Scene scene =  new Scene(root, 800 ,600);
        stage.setScene(scene);
        stage.show();
    }

    public void onLogOut() throws IOException {
        UserManager.getInstance().setLoggedInUser(null);

        Stage stage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/loginpage.fxml"));
        Scene scene =  new Scene(root, 800 ,600);
        stage.setScene(scene);
        stage.show();
    }
}
