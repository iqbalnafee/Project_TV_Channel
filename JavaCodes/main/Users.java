/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nayeem
 */
public class Users
{
    private static Users instance; 
    private Main main=new Main();
    private InsertAndQuery i=new InsertAndQuery();
    
//    private Users()
//    {
//    }
    
//    public static Users getInstance()
//    {
//        if (instance == null)
//        {
//            instance = new Users();
//        }
//        return instance;
//    }
    public boolean validateLogin(String userName, String password)
    {
        boolean success = false;
        String sql = "SELECT * FROM USER_DATABASE WHERE USERNAME = ? AND PASSWORD= ? ";
        
        try{
  
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, userName);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next())
            {
                success = true;
            }
            pst.close();
            
            con.close();
        }
        catch(Exception e)
        {
            
        }
        return success;
    }
    public List<List<Integer>> getAllUsers() throws IOException
    {
        String sql = i.retString();
        System.out.println("S: "+sql);
        List<List<Integer>> resultList = new ArrayList<>();
        try{
            Connection con = new OracleDBMS().getConnection();
            //System.out.println("Cmain.Users.getAllUsers()");
            PreparedStatement pst = con.prepareStatement(sql);
            //System.out.println("pst"+pst);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            //System.out.println(rsmd);
            //System.out.println(rs.next());
            
            while (rs.next())
            {
                List<Integer> row = new ArrayList<>();
                row.add(rs.getInt("PRODUCT_ID"));
                row.add(rs.getInt("PROGRAM_ID"));
                //System.out.println("main.Users.getAllUsers()");
                //System.out.println(rs.getInt("PRODUCT_ID"));
               
                resultList.add(row);
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
        return resultList;
    }
    
    
    /*public pl_sql throws IOException
    {
        String sql = i.retString();
        System.out.println("S: "+sql);
        List<List<Integer>> resultList = new ArrayList<>();
        try{
            Connection con = new OracleDBMS().getConnection();
            //System.out.println("Cmain.Users.getAllUsers()");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            //System.out.println(rsmd);
            //System.out.println(rs.next());
            
            while (rs.next())
            {
                List<Integer> row = new ArrayList<>();
                row.add(rs.getInt("PRODUCT_ID"));
                row.add(rs.getInt("PROGRAM_ID"));
                //System.out.println("main.Users.getAllUsers()");
                //System.out.println(rs.getInt("PRODUCT_ID"));
               
                resultList.add(row);
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
        return resultList;
    }*/
    
}

