package Main.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class Year4Semester1Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear4Semester1;
    @FXML
    private Button Button01418490;
    @FXML
    private ImageView check01418390;

    public void initialize() {
        super.initializeData(paneYear4Semester1);

        super.updatePassButton("01418490", Button01418490);

        super.checkPassOrNot("01418390", check01418390);
    }

    @FXML
    public void handleButton01418490OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418490", "01418390", Button01418490);
    }

}
