package prak14_ara;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Prak14_Ara extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
    Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
       
        Scene scene = new Scene(root);
        
        stage.setHeight(300);
        stage.setWidth(300);
        stage.setScene(scene);
        stage.setTitle("SitiHafijahZahraSiregar_2157051005");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
