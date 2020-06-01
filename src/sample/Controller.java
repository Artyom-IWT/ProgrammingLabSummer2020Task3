package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button newGame;
    @FXML
    void handleButtonAction(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("lose.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("2048");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private Button tryAgain;
    @FXML
    void tryAgain(ActionEvent event) throws Exception{
        tryAgain.getScene();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("2048");
        stage.setScene(scene);
        stage.show();
    }

}