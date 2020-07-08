package Main.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Year2Semester1Controller extends CurriculumController {
    @FXML
    private AnchorPane paneYear2Semester1;
    @FXML
    private Button Button01417322, Button01418211, Button01418231, Button01422111;
    @FXML
    private ImageView check01417112, check01418113, check01418113_2;

    public void initialize() {
        super.initializeData(paneYear2Semester1);

        super.updatePassButton("01417322", Button01417322);
        super.updatePassButton("01418211", Button01418211);
        super.updatePassButton("01418231", Button01418231);
        super.updatePassButton("01422111", Button01422111);

        super.checkPassOrNot("01417112", check01417112);
        super.checkPassOrNot("01418113", check01418113);
        super.checkPassOrNot("01418113", check01418113_2);
    }

    @FXML
    public void handleButton01417322OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01417322", "01417112", Button01417322);
    }

    @FXML
    public void handleButton01418211OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418211", "01418113", Button01418211);
    }

    @FXML
    public void handleButton01418231OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01418231", "01418113", Button01418231);
    }

    @FXML
    public void handleButton01422111OnClick(ActionEvent actionEvent) {
        super.handlePassButtonOnClick("01422111", "null", Button01422111);
    }


}
