/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author user2
 */

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class First_Frontview  {
    //Scene scene=new Scene();
    //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    Main main=new Main();
    @FXML
    private Button admin;
    @FXML
    private Button guest;
    @FXML
    private Label label;
    
    @FXML
    private void AdminOnAction(ActionEvent event) throws IOException, SQLException,InvocationTargetException, Exception
    {
          main.showLoginPage();
    }
    
    @FXML
    private void GuestOnAction(ActionEvent event) throws IOException, SQLException,InvocationTargetException, Exception
    {
            

    }
    
    @FXML
    void adminOnAction() throws SQLException, Exception {
        main.showLoginPage();
    }
    
    
   
}
