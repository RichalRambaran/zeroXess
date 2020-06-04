package com.zeroxess.educationpage;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MathGameController {
    public Button normalPlayButton;
    public Button infinitePlayButton;
    public Button returnToStartButton;
    public Button normalDificulty;
    public Button hardDificulty;
    public Button returnToGameSelect;

    public Label number2;
    public Label mathSign1;
    public Label number1;
    public Label mathSign2;
    public Label number3;
    public TextField AnswerTextField;
    public Button checkAnswerButton;
    public Button nextQuestion;
    public Label scoreLabel;
    public Button QuitButton;
    public Label equalsSign;
    public Label scoreName;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button backButton;
    @FXML
    private Button startGame;

    boolean gameMode;
    boolean gameDifficulty;

    @FXML
    private void onStartClicked(){
        onStartClickedDisabler();
    }

    @FXML
    private void returnToStart(){
        returnToStartDisabler();
    }
    @FXML
    private void returnToGameSelect(){
        returnToGameSelectDisabler();
    }

    @FXML
    private void normalPlay(){
        playSelected();
        this.gameMode = true;


    }
    @FXML
    private void infinitePlay(){
       playSelected();
       this.gameMode = false;


    }

    @FXML
    private void normalDificulty(){
        this.gameDifficulty = true;
        displayGameScrean();

    }

    @FXML
    private void hardDificulty(){
        this.gameDifficulty = false;
        displayGameScrean();


    }

    @FXML
    private void onCheckAswerClicked(){
        checkAnswerButton.setVisible(false);
        nextQuestion.setVisible(true);


    }

    @FXML
    private void onnextQuestionClicked(){
        checkAnswerButton.setVisible(true);
        nextQuestion.setVisible(false);

    }

    @FXML
    private void onQuitButtonClicked() throws IOException {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/educationpage/endScreen.fxml"));
        Scene scene =  new Scene(root, 800 ,600);
        stage.setScene(scene);
        stage.show();

    }




    @FXML
    private void returnToHomePage() throws IOException {
            Stage stage = (Stage) borderPane.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/zeroxess/homepage/homepage.fxml"));
            Scene scene =  new Scene(root, 800 ,600);
            stage.setScene(scene);
            stage.show();
    }

    private void onStartClickedDisabler(){
        normalPlayButton.setVisible(true);
        infinitePlayButton.setVisible(true);
        returnToStartButton.setVisible(true);
        startGame.setVisible(false);
        backButton.setVisible(false);
    }

    private void returnToStartDisabler(){
        normalPlayButton.setVisible(false);
        infinitePlayButton.setVisible(false);
        returnToStartButton.setVisible(false);
        startGame.setVisible(true);
        backButton.setVisible(true);
    }

    private void playSelected(){
        normalPlayButton.setVisible(false);
        infinitePlayButton.setVisible(false);
        returnToStartButton.setVisible(false);
        normalDificulty.setVisible(true);
        hardDificulty.setVisible(true);
        returnToGameSelect.setVisible(true);
    }

    private void returnToGameSelectDisabler(){
        normalDificulty.setVisible(false);
        hardDificulty.setVisible(false);
        returnToGameSelect.setVisible(false);
        normalPlayButton.setVisible(true);
        infinitePlayButton.setVisible(true);
        returnToStartButton.setVisible(true);
    }

    private void displayGameScrean(){
        number1.setVisible(true);
        number2.setVisible(true);
        number3.setVisible(true);
        mathSign1.setVisible(true);
        mathSign2.setVisible(true);
        equalsSign.setVisible(true);
        scoreLabel.setVisible(true);
        scoreLabel.setText("0");
        scoreName.setVisible(true);
        AnswerTextField.setVisible(true);
        checkAnswerButton.setVisible(true);
        QuitButton.setVisible(true);
        normalDificulty.setVisible(false);
        hardDificulty.setVisible(false);
        returnToGameSelect.setVisible(false);

    }


}
