package automatcafea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DoiController {

    Connection cnx;
    Baza baza;
    int categ;

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
    private Button prepararebautura;

    @FXML
    void goBack(ActionEvent event) {
        baza.incarcUnu();
    }

    @FXML
    void maideparte(ActionEvent event) {
        baza.incarcTrei();
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
        try {
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
            // Realizez conexiunea cu baza de date
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection // cnx apartine clasei Connection
                        ("jdbc:mysql://localhost/AutomatCafea?characterEncoding=utf8", "root", "");
             categ = denumireprodus.getSelectionModel().getSelectedIndex();
            incarc(categ);
          
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DoiController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DoiController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
