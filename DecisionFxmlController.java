/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author user2
 */
public class DecisionFxmlController {
    Stage stage=new Stage();
    @FXML
    void tableOnAction(ActionEvent e) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TablesFxml.fxml"));
        Parent root = loader.load();
        
        //insertData controller = loader.getController();
        //controller.load();
        
        
        stage.setTitle("Tables");
        stage.setScene(new Scene(root,600,500));
        stage.show();
    }
    
    @FXML
    void queryOnAction(ActionEvent e) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("QueryFxml.fxml"));
        Parent root = loader.load();
        
        //insertData controller = loader.getController();
        //controller.load();
        
        
        stage.setTitle("Tables");
        stage.setScene(new Scene(root,600,500));
        stage.show();
    }
    
}
