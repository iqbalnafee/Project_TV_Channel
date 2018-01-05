/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    Stage stage=new Stage();
    
    @FXML
    void jobsOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("jobsFxml1.fxml"));
        Parent root = loader.load();
        jobsfxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Jobs");
        stage.setScene(new Scene(root));
        stage.show();

    }
    @FXML
    void advertisementOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AdvertisementFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        AdvertisementFxmlContoller controller = loader.getController();
        controller.load();
        stage.setTitle("Advertisement");
        stage.setScene(new Scene(root));
        stage.show();

    }
    @FXML
    void DepartmentsOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DepartmentsFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        DepartmentsFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Departments");
        stage.setScene(new Scene(root));
        stage.show();

    }
    
    @FXML
    void programsOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ProgramsFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        ProgramsFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Programs");
        stage.setScene(new Scene(root,700,600));
        stage.show();

    }
    
    @FXML
    void locationsOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LocationsFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        LocationsFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Locations");
        stage.setScene(new Scene(root,700,600));
        stage.show();

    }
    
    @FXML
    void employeesOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("EmployeesFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        EmployeesFxmlController  controller = loader.getController();
        controller.load();
        stage.setTitle("Employees ");
        stage.setScene(new Scene(root,800,650));
        stage.show();

    }


    
    
}
