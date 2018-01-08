/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Callback;
import javax.xml.ws.Action;

public class QueryFxmlController {

    Stage stage = new Stage();
    @FXML
    private ObservableList<ObservableList> data;
    @FXML
    private TableView tablview = new TableView();
    @FXML
    private TextField t1;

    @FXML
    void QueryOnAction(ActionEvent e) throws SQLException {
        for (int i = 0; i < tablview.getItems().size(); i++) {
            tablview.getItems().clear();
            tablview.getColumns().clear();
        }    
        String q = t1.getText();
        Connection c;
        data = FXCollections.observableArrayList();
        try {
            c = DriverManager.getConnection("jdbc:oracle:thin:@user:1521:ORCL", "new", "123");
            ResultSet rs = c.createStatement().executeQuery(q);

            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });

                tablview.getColumns().addAll(col);
            }

            while (rs.next()) {
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    row.add(rs.getString(i));
                }
                data.add(row);

            }
            tablview.setItems(data);

        } catch (IndexOutOfBoundsException i) {
            i.printStackTrace();
            System.out.println("Error on Building Data");
        }
        

    }

    @FXML
    void refreshOnAction(ActionEvent e) throws SQLException {
        //tablview.clear();
        for (int i = 0; i < tablview.getItems().size(); i++) {
            tablview.getItems().clear();
            tablview.getColumns().clear();
        }
        stage.close();
        t1.clear();
    }

}
