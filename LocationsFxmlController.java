
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Font;

/**
 *
 * @author user2
 */
public class LocationsFxmlController {
    private Main main = new Main();
    private String s;
    @FXML
    private TableView tableView;
    @FXML
    private Label label;

    ObservableList<Locations> data;
    //ObservableList<Advertisement> data1;

    @FXML
    private TableColumn<Locations, String> c1;
    @FXML
    private TableColumn<Locations, String> c2;
    @FXML
    private TableColumn<Locations, String> c3;
    @FXML
    private TableColumn<Locations, String> c4;
    @FXML
    private TableColumn<Locations, String> c5;
    @FXML
    private TableColumn<Locations, String> c6;
    @FXML
    private TableColumn<Locations, String> c7;

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    
    @FXML
    private TextField t4;
    @FXML
    private TextField t5;
    @FXML
    private TextField t6;
    @FXML
    private TextField t7;
    
    @FXML
    private Button save;
    @FXML
    private Button update;
    @FXML
    private Button delete;
    @FXML
    private Button refresh;

    @FXML
    private ListView<String> list = new ListView<String>();

    @FXML
    void onMouseAction() throws SQLException {
        String l = (String) list.getSelectionModel().getSelectedItem();
        String sql = "SELECT * FROM Locations where Location_id = " + l;
        //System.out.println(sql);
        try {

            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                t1.setText(rs.getString("Location_id"));
                t2.setText(rs.getString("Address"));
                t3.setText(rs.getString("Postal_code")); 
                t4.setText(rs.getString("City"));
                t5.setText(rs.getString("State_province"));
                t6.setText(rs.getString("Country_code"));
                t7.setText(rs.getString("Country_name"));
                break;
            }
            pst.close();
            con.close();
        } catch (Exception e) {

        }

    }

    @FXML
    void saveOnAction(ActionEvent event) throws SQLException {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@user:1521:ORCL", "new", "123");
            String T1 = t1.getText();
            String T2 = t2.getText();
            String T3 = t3.getText();
            String T4 = t4.getText();
            String T5 = t5.getText();
            String T6 = t6.getText();
            String T7 = t7.getText();
            
            String sql = "insert into Locations(Location_id,Address,Postal_code,City,State_province,Country_code,Country_name) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, T1);
            pst.setString(2, T2);
            pst.setString(3, T3);
            pst.setString(4, T4);
            pst.setString(5, T5);
            pst.setString(6, T6);
            pst.setString(7, T7);
            
            pst.executeUpdate();
            label.setText("Data Saved!");
            label.setFont(Font.font("Verdana",20));
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check it from console");
            e.printStackTrace();
        }

    }

    @FXML
    void updateOnAction(ActionEvent event) throws SQLException {
        //String l=(String) list.getSelectionModel().getSelectedItem();
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@user:1521:ORCL", "new", "123");

            String sql = "update Locations  set Location_id=?, Address=?, Postal_code=?,City=?,State_province=?,Country_code=?,Country_name=? where Advertisement_id= " + t1.getText();
            PreparedStatement pst = con.prepareStatement(sql);
            String T1 = t1.getText();
            String T2 = t2.getText();
            String T3 = t3.getText();
            String T4 = t4.getText();
            String T5 = t5.getText();
            String T6 = t6.getText();
            String T7 = t7.getText();
            
            pst.setString(1, T1);
            pst.setString(2, T2);
            pst.setString(3, T3);
            pst.setString(4, T4);
            pst.setString(5, T5);
            pst.setString(6, T6);
            pst.setString(7, T7);
            pst.executeUpdate();
            label.setText("Data Updated!");
            label.setFont(Font.font("Verdana",20));
            pst.close();
            //System.out.println(t2.getText());
            con.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check it from console");
            e.printStackTrace();
        }

    }

    @FXML
    void deleteOnAction(ActionEvent event) throws SQLException {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@user:1521:ORCL", "new", "123");
            String sql = "delete from Locations where Location_id = " + t1.getText();
            //System.out.println(sql);
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, t1.getText());
            pst.executeUpdate();
            label.setText("Data Deleted!");
            label.setFont(Font.font("Verdana",20));
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check it from console");
            e.printStackTrace();
        }

    }

    private boolean init = true;

    private void initializeColumns() {

    }

    public List<List<String>> getAllUsers() throws IOException {
        String sql = "SELECT * FROM Locations";
        List<String> listOfSomething = new ArrayList<>();
        List<List<String>> resultList = new ArrayList<>();
        try {
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                List<String> row = new ArrayList<>();

                listOfSomething.add(rs.getString("Location_id"));
                row.add(rs.getString("Location_id"));
                row.add(rs.getString("Address"));
                row.add(rs.getString("Postal_code"));
                row.add(rs.getString("City"));
                row.add(rs.getString("State_province"));
                row.add(rs.getString("Country_code"));
                row.add(rs.getString("Country_name"));
                //System.out.println(rs.getString("Country_name"));
                resultList.add(row);
            }
            ObservableList<String> ldata = FXCollections.observableArrayList(listOfSomething);
            //SortedList<String> sortedList = new SortedList((ObservableList) ldata);
            list.setItems(ldata);
            pst.close();
            con.close();
        } catch (Exception e) {

        }
        return resultList;
    }

    public void load() throws IOException, NullPointerException {
        //System.out.println("main.AdvertisementFxmlContoller.load()");
        if (init) {
            initializeColumns();
            init = false;
        }

        data = FXCollections.observableArrayList();

        List<List<String>> userDataList = getAllUsers();
        for (List<String> row : userDataList) {
            data.add(new Locations(row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6)));
        }

        c1.setCellValueFactory(new PropertyValueFactory<>("Location_id"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Address"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Postal_code")); 
        c4.setCellValueFactory(new PropertyValueFactory<>("City"));
        c5.setCellValueFactory(new PropertyValueFactory<>("State_province"));
        c6.setCellValueFactory(new PropertyValueFactory<>("Country_code"));
        c7.setCellValueFactory(new PropertyValueFactory<>("Country_name "));
        
        tableView.setEditable(true);
        tableView.setItems(data);
        ((TableColumn) (tableView.getColumns().get(0))).setVisible(true);
        //((TableColumn) (tableView.getColumns().get(6))).setVisible(true);
    }

    @FXML
    void refreshOnAction(ActionEvent event) throws SQLException, IOException {
        data = FXCollections.observableArrayList();

        List<List<String>> userDataList = getAllUsers();
        for (List<String> row : userDataList) {
            data.add(new Locations(row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6)));
        }
        
        c1.setCellValueFactory(new PropertyValueFactory<>("Location_id"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Address"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Postal_code"));
        c4.setCellValueFactory(new PropertyValueFactory<>("City"));
        c5.setCellValueFactory(new PropertyValueFactory<>("State_province"));
        c6.setCellValueFactory(new PropertyValueFactory<>("Country_code"));
        c7.setCellValueFactory(new PropertyValueFactory<>("Country_name "));
        t1.clear();
        t2.clear();
        t3.clear();
        t4.clear();
        t5.clear();
        t6.clear();
        t7.clear();
        
        
        tableView.setEditable(true);
        tableView.setItems(data);
        //System.out.println("main.LocationsFxmlController.refreshOnAction()");
        ((TableColumn) (tableView.getColumns().get(0))).setVisible(true);
        label.setText("Refreshed!");
        label.setFont(Font.font("Verdana",20));

    }
    
}
