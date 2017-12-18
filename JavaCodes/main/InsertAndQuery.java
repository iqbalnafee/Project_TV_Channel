/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author user2
 */
public class InsertAndQuery {
    
    private Main main=new Main();
    private static String t;
    private call_pl_sql1 pl=new call_pl_sql1();
     Stage stage=new Stage();
    
    
    @FXML
    private Button Insert;
    @FXML
    private Button Query;
    
    @FXML
    private TextField Tquery;
    @FXML
    private TextField InsertTable;
    @FXML
    private Button check_pl_sql;

    @FXML
    private void InsertOnAction(ActionEvent event) throws IOException, SQLException,InvocationTargetException, Exception
    {
            String AddInTable = InsertTable.getText();
            
            try
            {
                main.Insert();
               
            } catch (Exception e)
            {
                //System.out.println("main.LoginController.");
                e.printStackTrace();
            }

        }
    
    @FXML
    private void QueryOnAction(ActionEvent event) throws IOException, SQLException,InvocationTargetException,NullPointerException, Exception
    {
            String table = Tquery.getText();
            this.t=table;
            
            try
            {
                //main.getString(table);
                main.showTable();
            } catch (Exception e)
            {
                //System.out.println("main.LoginController.");
                e.printStackTrace();
            }

        }
    /*public String retString()
    {    
        
    }*/
    
    @FXML
    private void pl_sqlOnAction(ActionEvent event) throws IOException, SQLException,InvocationTargetException,NullPointerException, Exception
    {
           
        //pl.call_pl_sql(806);
        //pl.showPlGui(806);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("pl1.fxml"));
        Parent root = loader.load();
        
        stage.setTitle("PL/SQL");
        stage.setScene(new Scene(root));
        stage.show();
    }


    public String retString() {
        return t;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
