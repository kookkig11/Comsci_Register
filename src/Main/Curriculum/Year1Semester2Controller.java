package Main.Curriculum;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Year1Semester2Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear1Semester2;
    @FXML
    private Button Button01417112, Button01418113, Button01418132;
    @FXML
    private ImageView check01417111, check01418112;

    public void initialize() {
        super.initializeData(paneYear1Semester2);

        super.updatePassButton("01417112", Button01417112);
        super.updatePassButton("01418113", Button01418113);
        super.updatePassButton("01418132", Button01418132);

        super.checkPassOrNot("01417111", check01417111);
        super.checkPassOrNot("01418112", check01418112);
    }

    @FXML
    public void handleButton01417112OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01417112", "01417111", Button01417112);
    }

    @FXML
    public void handleButton01418113OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418113", "01418112", Button01418113);
    }

    @FXML
    public void handleButton01418132OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418132", "null", Button01418132);
    }
}
