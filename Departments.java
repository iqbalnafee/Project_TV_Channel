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
public class Departments {
    String Department_id,Department_name,manager_id;

    public Departments(String Department_id, String Department_name, String manager_id) {
        this.Department_id = Department_id;
        this.Department_name = Department_name;
        this.manager_id = manager_id;
    }

    public String getDepartment_id() {
        return Department_id;
    }

    public String getDepartment_name() {
        return Department_name;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setDepartment_id(String Department_id) {
        this.Department_id = Department_id;
    }

    public void setDepartment_name(String Department_name) {
        this.Department_name = Department_name;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    @Override
    public String toString() {
        return Department_id + " " + Department_name + " " + manager_id ;
    }
    
    
}
