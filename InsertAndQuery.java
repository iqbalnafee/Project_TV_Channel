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
    
    @FXML
    void reportsOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ReportFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        ReportFxmlController  controller = loader.getController();
        controller.load();
        stage.setTitle("Reports ");
        stage.setScene(new Scene(root,800,650));
        stage.show();

    }
    
    @FXML
    void news_readerOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("News_readerFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        News_readerFxmlController  controller = loader.getController();
        controller.load();
        stage.setTitle("News Reader ");
        stage.setScene(new Scene(root,600,450));
        stage.show();

    }
    
    @FXML
    void Programs_cameramansOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Programs_cameramansFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        Programs_cameramansFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Programs Cameramans ");
        stage.setScene(new Scene(root,600,450));
        stage.show();

    }
    
    @FXML
    void newsOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("NewsFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        NewsFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("News");
        stage.setScene(new Scene(root,600,600));
        stage.show();

    }
    
    @FXML
    void castingOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CastingFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        CastingFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Casting");
        stage.setScene(new Scene(root,600,600));
        stage.show();

    }
    
    @FXML
    void castOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CastFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        CastFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Cast");
        stage.setScene(new Scene(root,600,500));
        stage.show();

    }
    
    @FXML
    void showOnAction() throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowFxml.fxml"));
        //System.out.println("main.InsertAndQuery.advertisementOnAction()");
        Parent root = loader.load();
        ShowFxmlController controller = loader.getController();
        controller.load();
        stage.setTitle("Show");
        stage.setScene(new Scene(root,600,600));
        stage.show();

    }


    
    
}
