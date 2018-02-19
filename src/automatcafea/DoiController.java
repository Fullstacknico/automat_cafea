package automatcafea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DoiController {

    Baza baza;

    public void setBaza(Baza baza) {
        this.baza = baza;
    }
    
    @FXML
    private TextArea ingrediente;

    @FXML
    private TextField cantitate;

    @FXML
    private Button inapoi;

    @FXML
    void goBack(ActionEvent event) {
        baza.incarcUnu();
    }

//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private URL location;
//
//    @FXML
//    private ListView<String> denumireprodus;
//
//    @FXML
//    private TextArea ingrediente;
//
//    @FXML
//    private TextField cantitateneta;
        @FXML
    private ComboBox<String> denumireprodus;

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
        

        // Se impune elementul 0 din listă ca element deja selectat.
        denumireprodus.getSelectionModel().select(0);
        
       
        
    }
}
