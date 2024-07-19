package Controller;

import DAO.AppointmentsDB;
import Model.Appointment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ReportsController {

    @FXML
    private TableColumn<?, ?> AppContactCol;

    @FXML
    private TableColumn<?, ?> AppCustIDCol;

    @FXML
    private TableColumn<?, ?> AppDescCol;

    @FXML
    private TableColumn<?, ?> AppEndCol;

    @FXML
    private TableColumn<?, ?> AppIDCol;

    @FXML
    private TableColumn<?, ?> AppLocationCol;

    @FXML
    private TableColumn<?, ?> AppStartCol;

    @FXML
    private TableColumn<?, ?> AppTitleCol;

    @FXML
    private TableColumn<?, ?> AppTypeCol;

    @FXML
    private TableColumn<?, ?> AppUserIDCol;

    @FXML
    private TableView<?> AppointmentTable;

    @FXML
    private Button LogOutButton;

    @FXML
    void toMainScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../View/MainScreen.fxml"));
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 1200, 700);
        stage.setTitle("Main Screen");
        stage.setScene(scene);
        stage.show();

    }

}
