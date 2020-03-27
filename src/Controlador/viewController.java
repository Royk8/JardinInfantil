package Controlador;

import Actores.Ninno;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.calificacionesController;

import java.io.IOException;

public class viewController extends Application {

    private Stage primaryStage;
    private BorderPane bordeLayout;

    private ObservableList<Ninno> ninnoData = FXCollections.observableArrayList();
    public viewController(){
        ninnoController ninnoController = new ninnoController();
        ninnoController.addNinno();
        ninnoData.addAll(ninnoController.getNinnos());
    }

    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Jardin Infantil El Programador Del Futuro");

        initBordeLayout();
        showCalificaciones();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private void initBordeLayout(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(viewController.class.getResource("../view/fondo.fxml"));
            bordeLayout = loader.load();

            Scene scene = new Scene(bordeLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    private void showCalificaciones(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(viewController.class.getResource("../view/calificaciones.fxml"));
            AnchorPane calificaciones = loader.load();

            bordeLayout.setCenter(calificaciones);

            calificacionesController controller = loader.getController();
            controller.setViewController(this);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }



    public Stage getPrimaryStage(){
        return primaryStage;
    }
    public ObservableList<Ninno> getNinnoData(){
        return ninnoData;
    }
}
