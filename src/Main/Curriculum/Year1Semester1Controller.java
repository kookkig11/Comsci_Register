package Main.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Year1Semester1Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear1Semester1;
    @FXML
    private Button Button01417111, Button01418112, Button01418114, Button01418131, Button01999111;
    @FXML
    private ImageView check01418114;

    public void initialize() {
        // page and class fileManager
        super.initializeData(paneYear1Semester1);

        //set Button (always update from file)
        super.updatePassButton("01417111", Button01417111);
        super.updatePassButton("01418112", Button01418112);
        super.updatePassButton("01418114", Button01418114);
        super.updatePassButton("01418131", Button01418131);
        super.updatePassButton("01999111", Button01999111);

        //set show preSubject (Pass or Not)
        super.checkPassOrNot("01418114", check01418114);
    }

    @FXML
    public void handleButton01417111OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01417111", "null", Button01417111);
    }

    @FXML
    public void handleButton01418112OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418112", "01418114", Button01418112);
    }

    @FXML
    public void handleButton01418114OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418114", "null", Button01418114);
        super.checkPassOrNot("01418114", check01418114);
    }

    @FXML
    public void handleButton01418131OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418131", "null", Button01418131);
    }

    @FXML
    public void handleButton01999111OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01999111", "null", Button01999111);
    }
}