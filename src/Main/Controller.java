package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class Controller {
    @FXML
    private AnchorPane rootPane;

    public void initialize() {
        // get font and style from StyleSheet
        rootPane.getStylesheets().add(getClass().getResource("/SetStyle/StyleSheet.css").toExternalForm());

        //check have file in Directory (not >> create file)
        String currentWorkDir = System.getProperty("user.dir");
        String path = currentWorkDir + "\\checkCurriculum.txt";
        File checkFile = new File(path);
        String pathUser = currentWorkDir + "\\user.txt";
        File userFile = new File(pathUser);

        if (!checkFile.exists()) {
            //create file when open program
            File newFile = new File("checkCurriculum.txt");
            try {
                if (newFile.createNewFile()) {
                    System.out.println("create checkCurriculum.txt");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            //set thisSubject and preSubject
            String[] subject = {"01418112", "01418114", "01418131", "01417111", "01999111",
                    "01418113", "01418132", "01417112", "01418211", "01418231",
                    "01417322", "01422111", "01418221", "01418233", "01418232",
                    "01418331", "01418321", "01418497", "01418341", "01418332",
                    "01418333", "01418351", "01418390", "01418334", "01418490", "01418499"};
            StringBuilder stringSet = new StringBuilder();
            stringSet.append(subject[0] + " N " + subject[1] + "\n");
            stringSet.append(subject[1] + " N " + "null" + "\n");
            stringSet.append(subject[2] + " N " + "null" + "\n");
            stringSet.append(subject[3] + " N " + "null" + "\n");
            stringSet.append(subject[4] + " N " + "null" + "\n");
            stringSet.append(subject[5] + " N " + subject[0] + "\n");
            stringSet.append(subject[6] + " N " + "null" + "\n");
            stringSet.append(subject[7] + " N " + subject[3] + "\n");
            stringSet.append(subject[8] + " N " + subject[5] + "\n");
            stringSet.append(subject[9] + " N " + subject[5] + "\n");
            stringSet.append(subject[10] + " N " + subject[7] + "\n");
            stringSet.append(subject[11] + " N " + "null" + "\n");
            stringSet.append(subject[12] + " N " + subject[5] + "\n");
            stringSet.append(subject[13] + " N " + subject[5] + "," + subject[2] + "\n");
            stringSet.append(subject[14] + " N " + subject[9] + "," + subject[6] + "\n");
            stringSet.append(subject[15] + " N " + subject[13] + "\n");
            stringSet.append(subject[16] + " N " + subject[12] + "," + subject[8] + "\n");
            stringSet.append(subject[17] + " N " + subject[12] + "\n");
            stringSet.append(subject[18] + " N " + "null" + "\n");
            stringSet.append(subject[19] + " N " + subject[15] + "\n");
            stringSet.append(subject[20] + " N " + subject[6] + "\n");
            stringSet.append(subject[21] + " N " + subject[15] + "\n");
            stringSet.append(subject[22] + " N " + subject[16] + "\n");
            stringSet.append(subject[23] + " N " + subject[20] + "\n");
            stringSet.append(subject[24] + " N " + subject[22] + "\n");
            stringSet.append(subject[25] + " N " + subject[16] + "\n");

            try (PrintWriter printWriter = new PrintWriter(new FileWriter(newFile))) {
                printWriter.printf(stringSet.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(newFile));
                bufferedReader.close();
            } catch (FileNotFoundException e) { //sub
                e.printStackTrace();
            } catch (IOException e) { //super
                e.printStackTrace();
            }
        }

        if (!userFile.exists()) {
            //create file when open program
            File newUserFile = new File("user.txt");
            try {
                if (newUserFile.createNewFile()) {
                    System.out.println("create user.txt");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //if click Main.Curriculum, open Main.Curriculum windows
    @FXML
    public void handleCurriculumButtonClick(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Curriculum/year1_semester1.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
