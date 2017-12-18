/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author user2
 */
public class insertData {
    private String s;

    
    
    @FXML
    private TextField pri;
    @FXML
    private TextField prn;
    @FXML
    private Button Insert;
    
    @FXML
    void insertAction(ActionEvent event) throws SQLException
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@user:1521:ORCL", "new", "123");
            String T1 = pri.getText();
            String T2 = prn.getText();
            String sql = "insert into AD_during_program(PRODUCT_ID,PROGRAM_ID) values(?,?)" ;
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, T1);
            pst.setString(2, T2); 
            pst.executeUpdate();
            pst.close();
            con.close();
        }
        catch (SQLException e)
        {
            System.out.println("Connection Failed! Check it from console");
            e.printStackTrace();
        }

    }
    
    
    
}
