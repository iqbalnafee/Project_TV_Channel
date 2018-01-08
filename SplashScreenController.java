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
import com.sun.media.jfxmedia.events.PlayerTimeListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * This class contains the SplashScreen of the Application
 *
 */
public class SplashScreenController extends StackPane {

    @FXML
    private ImageView imageView;

    // -------------------------------------------------------------
    /**
     * The logger.
     */
    private Logger logger = Logger.getLogger(getClass().getName());

    /**
     * The Window of the Splash Screen
     */
    Stage window = new Stage();
    Main main = new Main();

    /**
     * Constructor.
     */
    public SplashScreenController() {

        // ------------------------------------FXMLLOADER
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SplashScreenController.fxml"));
        loader.setController(this);
        loader.setRoot(this);

        try {
            loader.load();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "", ex);
        }

        //Window
        window.setTitle("Splash Screen");
        //window.getIcons().add(new Image(getClass().getResourceAsStream("icon64.png")))
        window.initStyle(StageStyle.TRANSPARENT);
        window.setScene(new Scene(this));

    }

    /**
     * Shows the window of the SplashScreen
     */
    public void showWindow() throws IOException, InterruptedException {
        //System.out.println("main.SplashScreenController.showWindow()");
        window.show();
        PauseTransition delay = new PauseTransition(Duration.seconds(1));
        delay.setOnFinished(event -> {
            try {
                hideWindow();
            } catch (IOException ex) {
                Logger.getLogger(SplashScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        delay.play();
        
    }

    /**
     * Hides the window of the SplashScreen
     */
    public void hideWindow() throws IOException {
        window.close();
        main.ff();
    }

    /**
     * Called as soon as .fxml is initialized
     */
    @FXML
    private void initialize() {
        imageView.setFitWidth(getScreenWidth() / 2.5);
    }

    /**
     * Gets the screen width.
     *
     * @return The screen <b>Width</b> based on the <b> bounds </b> of the
     * Screen.
     */
    public static double getScreenWidth() {
        return Screen.getPrimary().getBounds().getWidth();
    }

    /**
     * Gets the screen height.
     *
     * @return The screen <b>Height</b> based on the <b> bounds </b> of the
     * Screen.
     */
    public static double getScreenHeight() {
        return Screen.getPrimary().getBounds().getHeight();
    }

    /**
     * Gets the visual screen width.
     *
     * @return The screen <b>Width</b> based on the <b>visual bounds</b> of the
     * Screen.These bounds account for objects in the native windowing system
     * such as task bars and menu bars. These bounds are contained by
     * Screen.bounds.
     */
    public static double getVisualScreenWidth() {
        return Screen.getPrimary().getVisualBounds().getWidth();
    }

    /**
     * Gets the visual screen height.
     *
     * @return The screen <b>Height</b> based on the <b>visual bounds</b> of the
     * Screen.These bounds account for objects in the native windowing system
     * such as task bars and menu bars. These bounds are contained by
     * Screen.bounds.
     */
    public static double getVisualScreenHeight() {
        return Screen.getPrimary().getVisualBounds().getHeight();
    }

}
