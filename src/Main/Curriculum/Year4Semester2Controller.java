package Main.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class Year4Semester2Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear4Semester2;
    @FXML
    private Button Button01418499;
    @FXML
    private ImageView check01418321;

    public void initialize() {
        super.initializeData(paneYear4Semester2);

        super.updatePassButton("01418499", Button01418499);

        super.checkPassOrNot("01418321", check01418321);
    }

    @FXML
    public void handleButton01418499OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418499", "01418321", Button01418499);
    }

}
