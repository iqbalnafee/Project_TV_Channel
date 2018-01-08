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


public class ShowFxmlController {
    private Main main = new Main();
    private String s;
    @FXML
    private TableView tableView;
    @FXML
    private Label label;

    ObservableList<Show> data;
    //ObservableList<Advertisement> data1;

    @FXML
    private TableColumn<Show, String> c1;
    @FXML
    private TableColumn<Show, String> c2;
    @FXML
    private TableColumn<Show, String> c3;
    
    @FXML
    private TableColumn<Show, String> c4;
    @FXML
    private TableColumn<Show, String> c5;
    @FXML
    private TableColumn<Show, String> c6;
    @FXML
    private TableColumn<Show, String> c7;
    @FXML
    private TableColumn<Show, String> c8;

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
    private TextField t8;
    
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
        String sql = "SELECT * FROM Show where Show_id = " + l;
        //System.out.println(sql);
        try {

            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            //System.out.println("main.NewsFxmlController.onMouseAction()");

            while (rs.next()) {
                t1.setText(rs.getString("Show_id"));
                t2.setText(rs.getString("Show_name"));
                t3.setText(rs.getString("Show_episode")); 
                t4.setText(rs.getString("Show_topic"));
                t5.setText(rs.getString("Show_type"));
                t6.setText(rs.getString("Director_id"));
                t7.setText(rs.getString("Producer_id"));
                t8.setText(rs.getString("Duration"));
                //System.out.println("main.NewsFxmlController.onMouseAction()");
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
            String T8 = t8.getText();
            String sql = "insert into Show(Show_id,Show_name,Show_episode,Show_topic,Show_type,Director_id,Producer_id,Duration) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, T1);
            pst.setString(2, T2);
            pst.setString(3, T3);
            pst.setString(4, T4);
            pst.setString(5, T5);
            pst.setString(6, T6);
            pst.setString(7, T7);
            pst.setString(8, T8);
            
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

            String sql = "update Show set Show_id=?, Show_name=?, Show_episode=?,Show_topic=?, Show_type=?,Director_id=?,Producer_id=?,Duration=? where Show= " + t1.getText();
            PreparedStatement pst = con.prepareStatement(sql);
            
            String T1 = t1.getText();
            String T2 = t2.getText();
            String T3 = t3.getText();
            String T4 = t4.getText();
            String T5 = t5.getText();
            String T6 = t6.getText();
            String T7 = t7.getText();
            String T8 = t8.getText();
            //String sql = "insert into Programs(Program_id,Program_name,Program_type,Date,Start_time,Finish_time,Telecast_type,Executor_id,Viewers,TRP) values(?,?,?,?,?,?,?,?,?,?)";
            //PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, T1);
            pst.setString(2, T2);
            pst.setString(3, T3);
            pst.setString(4, T4);
            pst.setString(5, T5);
            pst.setString(6, T6);
            pst.setString(7, T7);
            pst.setString(8, T8);
            
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
            String sql = "delete from Show where Show_id = " + t1.getText();
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
        String sql = "SELECT * FROM Show";
        List<String> listOfSomething = new ArrayList<>();
        List<List<String>> resultList = new ArrayList<>();
        try {
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                List<String> row = new ArrayList<>();

                listOfSomething.add(rs.getString("Show_id"));
                row.add(rs.getString("Show_id"));
                row.add(rs.getString("Show_name"));
                row.add(rs.getString("Show_episode"));
                //row.add(rs.getString("MAX_SALARY"));
                row.add(rs.getString("Show_topic"));
                row.add(rs.getString("Show_type"));
                row.add(rs.getString("Director_id"));
                row.add(rs.getString("Producer_id"));
                row.add(rs.getString("Duration"));
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
            data.add(new Show(row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7)));
        }

        c1.setCellValueFactory(new PropertyValueFactory<>("Show_id"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Show_name"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Show_episode"));
        
        c4.setCellValueFactory(new PropertyValueFactory<>("Show_topic"));
        c5.setCellValueFactory(new PropertyValueFactory<>("Show_type"));
        c6.setCellValueFactory(new PropertyValueFactory<>("Director_id"));
        c7.setCellValueFactory(new PropertyValueFactory<>("Producer_id"));
        c8.setCellValueFactory(new PropertyValueFactory<>("Duration"));
        tableView.setEditable(true);
        tableView.setItems(data);
        ((TableColumn) (tableView.getColumns().get(0))).setVisible(true);
    }

    @FXML
    void refreshOnAction(ActionEvent event) throws SQLException, IOException {
        data = FXCollections.observableArrayList();

        List<List<String>> userDataList = getAllUsers();
        for (List<String> row : userDataList) {
            data.add(new Show(row.get(0), row.get(1), row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7)));
        }

        c1.setCellValueFactory(new PropertyValueFactory<>("Show_id"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Show_name"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Show_episode"));
        
        c4.setCellValueFactory(new PropertyValueFactory<>("Show_topic"));
        c5.setCellValueFactory(new PropertyValueFactory<>("Show_type"));
        c6.setCellValueFactory(new PropertyValueFactory<>("Director_id"));
        c7.setCellValueFactory(new PropertyValueFactory<>("Producer_id"));
        c8.setCellValueFactory(new PropertyValueFactory<>("Duration"));
        t1.clear();
        t2.clear();
        t3.clear();
        t4.clear();
        t5.clear();
        t6.clear();
        t7.clear();
        t8.clear();
        //max_salary.setCellValueFactory(new PropertyValueFactory<>("max_salary"));
        tableView.setEditable(true);
        tableView.setItems(data);
        ((TableColumn) (tableView.getColumns().get(0))).setVisible(true);
        label.setText("Refreshed!");
        label.setFont(Font.font("Verdana",20));

    }
}
