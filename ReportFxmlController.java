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
public class ReportFxmlController {
    private Main main = new Main();
    private String s;
    @FXML
    private TableView tableView;
    @FXML
    private Label label;

    ObservableList<Reports> data;
    //ObservableList<Advertisement> data1;

    @FXML
    private TableColumn<Reports, String> c1;
    @FXML
    private TableColumn<Reports, String> c2;
    @FXML
    private TableColumn<Reports, String> c3;
    @FXML
    private TableColumn<Reports, String> c4;
    @FXML
    private TableColumn<Reports, String> c5;
    @FXML
    private TableColumn<Reports, String> c6;

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
        String sql = "SELECT * FROM Reports where Report_id = " + l;
        //System.out.println(sql);
        try {

            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                t1.setText(rs.getString("Report_id"));
                t2.setText(rs.getString("Report_name"));
                t3.setText(rs.getString("Report_type")); 
                t4.setText(rs.getString("Reporter_id"));
                t5.setText(rs.getString("Cameraman_id"));
                t6.setText(rs.getString("Collection_date"));
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
            
            String sql = "insert into Reports(Report_id,Report_name,Report_type,Reporter_id,Cameraman_id,Collection_date) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, T1);
            pst.setString(2, T2);
            pst.setString(3, T3);
            pst.setString(4, T4);
            pst.setString(5, T5);
            pst.setString(6, T6);
            
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

            String sql = "update Reports  set Report_id=?, Report_name=?, Report_type=?,Reporter_id=?,Cameraman_id=?,Collection_date=? where Report_id= " + t1.getText();
            PreparedStatement pst = con.prepareStatement(sql);
            String T1 = t1.getText();
            String T2 = t2.getText();
            String T3 = t3.getText();
            String T4 = t4.getText();
            String T5 = t5.getText();
            String T6 = t6.getText();
            
            pst.setString(1, T1);
            pst.setString(2, T2);
            pst.setString(3, T3);
            pst.setString(4, T4);
            pst.setString(5, T5);
            pst.setString(6, T6);
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
            String sql = "delete from Reports where Report_id = " + t1.getText();
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
        String sql = "SELECT * FROM Reports";
        List<String> listOfSomething = new ArrayList<>();
        List<List<String>> resultList = new ArrayList<>();
        try {
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                List<String> row = new ArrayList<>();

                listOfSomething.add(rs.getString("Report_id"));
                row.add(rs.getString("Report_id"));
                row.add(rs.getString("Report_name"));
                row.add(rs.getString("Report_type"));
                row.add(rs.getString("Reporter_id"));
                row.add(rs.getString("Cameraman_id"));
                row.add(rs.getString("Collection_date"));
                
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
            data.add(new Reports(row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5)));
        }

        c1.setCellValueFactory(new PropertyValueFactory<>("Report_id"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Report_name"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Report_type")); 
        c4.setCellValueFactory(new PropertyValueFactory<>("Reporter_id"));
        c5.setCellValueFactory(new PropertyValueFactory<>("Cameraman_id"));
        c6.setCellValueFactory(new PropertyValueFactory<>("Collection_date"));
        
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
            data.add(new Reports(row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5)));
        }

        c1.setCellValueFactory(new PropertyValueFactory<>("Report_id"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Report_name"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Report_type")); 
        c4.setCellValueFactory(new PropertyValueFactory<>("Reporter_id"));
        c5.setCellValueFactory(new PropertyValueFactory<>("Cameraman_id"));
        c6.setCellValueFactory(new PropertyValueFactory<>("Collection_date"));
        t1.clear();
        t2.clear();
        t3.clear();
        t4.clear();
        t5.clear();
        t6.clear();
        
        
        tableView.setEditable(true);
        tableView.setItems(data);
        //System.out.println("main.LocationsFxmlController.refreshOnAction()");
        ((TableColumn) (tableView.getColumns().get(0))).setVisible(true);
        label.setText("Refreshed!");
        label.setFont(Font.font("Verdana",20));

    }
}
