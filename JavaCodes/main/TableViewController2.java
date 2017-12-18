/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author user2
 */
public class TableViewController2 {
    
    private Main main;
    private String s;
    @FXML
    private TableView tableView;

    ObservableList<Ad_during_program> data;
    
    @FXML
    private TableColumn<Ad_during_program,Integer> Product;
    @FXML
    private TableColumn<Ad_during_program,Integer> Program;

    @FXML
    private Button button;

    private boolean init = true;

    
    
    private void initializeColumns()
    {
        
    }
    
    public void load() throws IOException
    {
        if (init)
        {
            initializeColumns();
            init = false;
        }

        data = FXCollections.observableArrayList();

        List<List<Integer>> userDataList = new Users().getAllUsers();
        for (List<Integer> row : userDataList)
        {
            data.add(new Ad_during_program(row.get(1), row.get(0)));
            //System.out.println(row.get(0));
        }

        Product.setCellValueFactory(new PropertyValueFactory<>("Product"));
        Program.setCellValueFactory(new PropertyValueFactory<>("Program"));
        tableView.setEditable(true);
        tableView.setItems(data);
        ((TableColumn) (tableView.getColumns().get(0))).setVisible(true);
    
    
    

    }
    
    
    
}
