package automatcafea;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TreiController {

    Baza baza;

    public void setBaza(Baza baza) {
        this.baza = baza;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button inapoi;

    @FXML
    private TextField bauturaestegata;

    @FXML
    void goBack(ActionEvent event) {
        baza.incarcUnu();
    }

    @FXML
    void initialize() {

    }
}
