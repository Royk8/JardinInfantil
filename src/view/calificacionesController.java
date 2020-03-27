package view;

import Actores.Logro;
import Actores.Ninno;
import Controlador.ninnoController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class calificacionesController {
    //Se definen los espacios para la tabla de ninnos
    @FXML
    private TableView<Ninno> ninnoTable;
    @FXML
    private TableColumn<Ninno,String> nombreColumn;
    @FXML
    private TableColumn<Ninno,String> apellidoColumn;

    //Se definen las etiquetas para la informacion detallada del ninno
    @FXML
    private Label nombreLabel, apellidoLabel, idLabel, idTypeLabel, padreLabel, madreLabel,
            acudienteLabel, edadLabel, nacimientoLabel, alturaLabel, pesoLabel, generoLabel,
            situacionLabel, nivelLabel, horarioLabel;

    //Se definen las etiquedas para la tabla de logros
    @FXML
    private TableView<Logro> logroTable;
    @FXML
    private TableColumn<Logro,String> logroColumn;
    @FXML
    private TableColumn<Logro,String> bimestreColumn;
    @FXML
    private TableColumn<Logro,String> completadoColumn;

    private Controlador.viewController viewController;

    @FXML
    private void initialize(){
        for (int i = 0; i <= ninnoController.ninnos.size(); i++) {
            nombreColumn.setCellValueFactory(new PropertyValueFactory<Ninno,String>(
                    ninnoController.ninnos.get(i).getNombre()
            ));
            apellidoColumn.setCellValueFactory(new PropertyValueFactory<Ninno,String>(
                    ninnoController.ninnos.get(i).getNombre()
            ));
        }
    }

    public void setViewController(Controlador.viewController viewController){
        this.viewController = viewController;
        ninnoTable.setItems(viewController.getNinnoData());
    }
}
