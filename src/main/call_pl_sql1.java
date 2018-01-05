/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.xml.ws.Action;

/**
 *
 * @author user2
 */
public class call_pl_sql1 {

    /**
     *
     */
    @FXML
    private TextField prn;
    @FXML
    private Button Check;
    @FXML
    private Label label;
    @FXML
    private Label label2;
    @FXML
    private Button check2;
    @FXML
    private TextField Cast;
    
    @FXML
    public void CheckOnAction(ActionEvent event) throws SQLException {
            String AddInTable = prn.getText();
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@user:1521:ORCL","new","123");
            CallableStatement cstmt = con.prepareCall("{CALL pro2(?,?)}");
            cstmt.registerOutParameter(2,Types.INTEGER);
            cstmt.setString(1, AddInTable);
            cstmt.execute();
            int acctBal = cstmt.getInt(2); 
            label.setText(Integer.toString(acctBal));
            label.setFont(Font.font("Verdana",20));
          
         
            cstmt.close();
            con.close();
        
    }
    
    @FXML
    public void Check2OnAction(ActionEvent event) throws SQLException {
            String AddInTable = Cast.getText();
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@user:1521:ORCL","new","123");
            
            
            CallableStatement cstmt1 = con.prepareCall("{CALL pro3(?,?)}");
            cstmt1.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt1.registerOutParameter(2, java.sql.Types.VARCHAR);
            int res=Integer.parseInt(AddInTable);
            cstmt1.setInt(1, res);
            cstmt1.execute();
            String userName = cstmt1.getString(2);
            label2.setText(userName);
            label2.setFont(Font.font("Verdana",20));
            cstmt1.close();
            con.close();
            
        
    }
    public  void showPlGui(int number) throws IOException
    {
        
    }
    

}
