package Main.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Year2Semester2Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear2Semester2;
    @FXML
    private Button Button01418221, Button01418232, Button01418233;
    @FXML
    private ImageView check01418113, check01418132, check01418231, check01418131, check01418113_2;

    public void initialize() {
        super.initializeData(paneYear2Semester2);

        super.updatePassButton("01418221", Button01418221);
        super.updatePassButton("01418232", Button01418232);
        super.updatePassButton("01418233", Button01418233);

        super.checkPassOrNot("01418113", check01418113);
        super.checkPassOrNot("01418132", check01418132);
        super.checkPassOrNot("01418231", check01418231);
        super.checkPassOrNot("01418131", check01418131);
        super.checkPassOrNot("01418113", check01418113_2);
    }

    @FXML
    public void handleButton01418221OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418221", "01418113", Button01418221);
    }

    @FXML
    public void handleButton01418232OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418232", "0141813201418231", Button01418232);
    }

    @FXML
    public void handleButton01418233OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418233", "01418113", Button01418233);
    }

}
