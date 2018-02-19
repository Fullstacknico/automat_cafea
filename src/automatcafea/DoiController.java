package automatcafea;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DoiController {

    Baza baza;

    public void setBaza(Baza baza) {
        this.baza = baza;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> denumireprodus;

    @FXML
    private TextArea ingrediente;

    @FXML
    private TextField cantitateneta;

    @FXML
    void initialize() {
        // Se adauga denumirea produsului
        denumireprodus.getItems().add("ESPRESSO");
        denumireprodus.getItems().add("ESPRESSO LUNG");
        denumireprodus.getItems().add("ESPRESSO CU LAPTE");
        denumireprodus.getItems().add("CAPPUCCINO");
        denumireprodus.getItems().add("CAPPUCCINO CHOCO");
        denumireprodus.getItems().add("LATTE MACCHIATO");
        denumireprodus.getItems().add("CAFEA DECOFEINIZATA");
        denumireprodus.getItems().add("CIOCOLATA CALDA");
        denumireprodus.getItems().add("CEAI");
        denumireprodus.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Se impune elementul 0 din listă ca element deja selectat.
        denumireprodus.getSelectionModel().select(0);
        
       
        
    }
}
