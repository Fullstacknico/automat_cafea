package automatcafea;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class UnuController {

    Baza baza;

    public void setBaza(Baza baza) {
        this.baza = baza;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buton1;

    @FXML
    private Button buton2;

    @FXML
    private Button buton3;

    @FXML
    private Button buton4;

    @FXML
    private Button buton5;

    @FXML
    private Button buton6;

    @FXML
    private Button buton7;

    @FXML
    private Button buton8;

    @FXML
    private Button buton9;

    @FXML
    void maideparte1(MouseEvent  event) {

    }

    @FXML
    void maideparte2(MouseEvent  event) {

    }

    @FXML
    void maideparte3(MouseEvent  event) {

    }

    @FXML
    void maideparte4(MouseEvent  event) {

    }

    @FXML
    void maideparte5(MouseEvent  event) {

    }

    @FXML
    void maideparte6(MouseEvent  event) {

    }

    @FXML
    void maideparte7(MouseEvent  event) {

    }

    @FXML
    void maideparte8(MouseEvent  event) {

    }

    @FXML
    void maideparte9(MouseEvent event) {
// Incarc ecranul doi
        baza.incarcDoi();
    }

    @FXML
    void initialize() {

    }
}
