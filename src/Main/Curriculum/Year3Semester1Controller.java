package Main.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Year3Semester1Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear3Semester1;
    @FXML
    private Button Button01418321, Button01418331, Button01418341, Button01418497;
    @FXML
    private ImageView check01418211, check01418221, check01418233, check01418221_2;

    public void initialize() {
        super.initializeData(paneYear3Semester1);

        super.updatePassButton("01418321", Button01418321);
        super.updatePassButton("01418331", Button01418331);
        super.updatePassButton("01418341", Button01418341);
        super.updatePassButton("01418497", Button01418497);

        super.checkPassOrNot("01418211", check01418211);
        super.checkPassOrNot("01418221", check01418221);
        super.checkPassOrNot("01418233", check01418233);
        super.checkPassOrNot("01418221", check01418221_2);
    }

    @FXML
    public void handleButton01418321OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418321", "01418211", Button01418321);
    }

    @FXML
    public void handleButton01418331OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418331", "01418233", Button01418331);
    }

    @FXML
    public void handleButton01418341OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418341", "null", Button01418341);
    }

    @FXML
    public void handleButton01418497OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418497", "01418221", Button01418497);
    }

}
