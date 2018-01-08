/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
//import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import static javafx.application.Application.launch;
import javafx.util.Duration;

public class Main extends Application {

    Stage stage=new Stage();
    private  String s;

    @Override
    public void start(Stage primaryStage) throws Exception{
        SplashScreenController spashScreen = new SplashScreenController();
        stage = primaryStage;
        spashScreen.showWindow();
        //stage.setScene(new Scene(ff()));
        //PauseTransition delay = new PauseTransition(Duration.seconds(5));
        //delay.setOnFinished( event -> stage.close() );
        //ff();
        //System.out.println("main.Main.start()");
	//I am using the code below so the Primary Stage of the application 
	//doesn't appear for 2 seconds , so the splash screen is displayed
	/*PauseTransition splashScreenDelay = new PauseTransition(Duration.seconds(3));
	splashScreenDelay.setOnFinished(f -> {
            try {
                //System.out.println("main.Main.start()");
                spashScreen.hideWindow();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
	});
        */
    }
    
    public void ff() throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("1st_Frontview.fxml"));
        Parent root = loader.load();

        // Set the primary stage
        stage.setTitle("WELCOME");
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }

    public void showLoginPage() throws Exception {
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        // Loading the controller
        LoginController controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("WELCOME");
        stage.setScene(new Scene(root, 400, 250));
        stage.show();
    }
    
    public void FirstFront() throws IOException, SQLException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DecisionFxml.fxml"));
        Parent root = loader.load();
        
        //insertData controller = loader.getController();
        //controller.load();
        
        
        stage.setTitle("Decision");
        stage.setScene(new Scene(root,600,350));
        stage.show();
    }
    
   
    
    
    public void showTable() throws IOException
    {
        
        //System.out.println("s: "+st);
        //TableViewController2 t=new TableViewController2(s);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("jobsFxml1.fxml"));
        Parent root = loader.load();
        
        
        // Loading the controller
        
        jobsfxmlController controller = loader.getController();
        controller.load();
        //controller.refreshTable();
        //controller.setMain(this);
        
        // Set the primary stage
        stage.setTitle("Dashboard");
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    public void Insert() throws IOException
    {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("InsertData.fxml"));
        Parent root = loader.load();
        
        stage.setTitle("INSERTION");
        stage.setScene(new Scene(root));
        stage.show();
        
    }

    

    public static void main(String[] args) {
        launch(args);
    }
}
