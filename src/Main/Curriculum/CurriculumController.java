package Main.Curriculum;

import Main.FileManager;
import Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class CurriculumController {
    private FileManager fileManager;
    private AnchorPane paneCurriculum;

    public void initializeData(AnchorPane paneCurriculum) {
        this.paneCurriculum = paneCurriculum;
        try {
            fileManager = new FileManager();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handlePassButtonOnClick(String code, String preSubjectCode, Button passButton) {
        try {
            if (preSubjectCode.equals("null")) {
                fileManager.toggleStatusSubject(fileManager.getSubjects(code));
                updatePassButton(code, passButton);
            } else {
                if (fileManager.getSubjects(preSubjectCode).isPass()) {
                    fileManager.toggleStatusSubject(fileManager.getSubjects(code));
                    updatePassButton(code, passButton);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Unable to load component: File not found!");
        }
    }

    public void updatePassButton(String code, Button checkButton) {
        try {
            if (fileManager.getSubjects(code).isPass()) {
                checkButton.setText("PASS");
                checkButton.setStyle("-fx-text-fill: white; -fx-background-color: #155e63");
            } else {
                checkButton.setText("NOT");
                checkButton.setStyle("-fx-text-fill: white; -fx-background-color: #db3951");
            }
        } catch (NullPointerException e) {
            System.out.println("Unable to load component: File not found!");
        }
    }

    public void checkPassOrNot(String code, ImageView star) {
        try {
            if (fileManager.getSubjects(code).isPass()) {
                star.setImage(new Image("/SetStyle/icon/passStar.png"));
            } else {
                star.setImage(new Image("/SetStyle/icon/notPassStar.png"));
            }
        } catch (NullPointerException e) {
            System.out.println("Unable to load component: File not found!");
        }
    }

    // click to change column (year and semester)
    public void openPage(String year, String semester) throws IOException {
        Stage currentStage = (Stage) paneCurriculum.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("year" + year + "_semester" + semester + ".fxml")));
        scene.getStylesheets().add(getClass().getResource("/SetStyle/StyleSheet.css").toExternalForm());
        currentStage.setScene(scene);
        currentStage.show();
    }

    //if click BACK, back to Page HOME
    @FXML
    public void handleBackButtonClick(ActionEvent actionEvent) throws IOException {
        Stage currentStage = (Stage) paneCurriculum.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("MainPage.fxml")));
        currentStage.setScene(scene);
        currentStage.show();
    }

    @FXML
    public void handleYear1Semester1Click(MouseEvent mouseEvent) throws IOException {
        openPage("1", "1");
    }

    @FXML
    public void handleYear1Semester2Click(MouseEvent mouseEvent) throws IOException {
        openPage("1", "2");
    }

    @FXML
    public void handleYear2Semester1Click(MouseEvent mouseEvent) throws IOException {
        openPage("2", "1");
    }

    @FXML
    public void handleYear2Semester2Click(MouseEvent mouseEvent) throws IOException {
        openPage("2", "2");
    }

    @FXML
    public void handleYear3Semester1Click(MouseEvent mouseEvent) throws IOException {
        openPage("3", "1");
    }

    @FXML
    public void handleYear3Semester2Click(MouseEvent mouseEvent) throws IOException {
        openPage("3", "2");
    }

    @FXML
    public void handleYear4Semester1Click(MouseEvent mouseEvent) throws IOException {
        openPage("4", "1");
    }

    @FXML
    public void handleYear4Semester2Click(MouseEvent mouseEvent) throws IOException {
        openPage("4", "2");
    }

}
