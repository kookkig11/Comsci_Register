package Main.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Year3Semester2Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear3Semester2;
    @FXML
    private Button Button01418332, Button01418333, Button01418334, Button01418351, Button01418390;
    @FXML
    private ImageView check01418331, check01418132, check01418333, check01418321, check01418331_2;

    public void initialize() {
        super.initializeData(paneYear3Semester2);

        super.updatePassButton("01418332", Button01418332);
        super.updatePassButton("01418333", Button01418333);
        super.updatePassButton("01418334", Button01418334);
        super.updatePassButton("01418351", Button01418351);
        super.updatePassButton("01418390", Button01418390);

        super.checkPassOrNot("01418331", check01418331);
        super.checkPassOrNot("01418132", check01418132);
        super.checkPassOrNot("01418333", check01418333);
        super.checkPassOrNot("01418321", check01418321);
        super.checkPassOrNot("01418331", check01418331_2);
    }

    @FXML
    public void handleButton01418332OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418332", "01418331", Button01418332);
    }

    @FXML
    public void handleButton01418333OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418333", "01418132", Button01418333);
        super.checkPassOrNot("01418333", check01418333);
    }

    @FXML
    public void handleButton01418334OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418334", "01418333", Button01418334);
    }

    @FXML
    public void handleButton01418351OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418351", "01418331", Button01418351);
    }

    @FXML
    public void handleButton01418390OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418390", "01418321", Button01418390);
    }

}
