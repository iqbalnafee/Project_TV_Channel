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
public class Employees {
    String Employee_id,First_name,Last_name,Email,Phone_number,Hire_date,Job_id,Salary,Manager_id,Department_id,Location_id;

    public Employees(String Employee_id, String First_name, String Last_name, String Email, String Phone_number, String Hire_date, String Job_id, String Salary, String Manager_id, String Department_id, String Location_id) {
        this.Employee_id = Employee_id;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Email = Email;
        this.Phone_number = Phone_number;
        this.Hire_date = Hire_date;
        this.Job_id = Job_id;
        this.Salary = Salary;
        this.Manager_id = Manager_id;
        this.Department_id = Department_id;
        this.Location_id = Location_id;
    }

    public String getEmployee_id() {
        return Employee_id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public String getHire_date() {
        return Hire_date;
    }

    public String getJob_id() {
        return Job_id;
    }

    public String getSalary() {
        return Salary;
    }

    public String getManager_id() {
        return Manager_id;
    }

    public String getDepartment_id() {
        return Department_id;
    }

    public String getLocation_id() {
        return Location_id;
    }

    public void setEmployee_id(String Employee_id) {
        this.Employee_id = Employee_id;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public void setHire_date(String Hire_date) {
        this.Hire_date = Hire_date;
    }

    public void setJob_id(String Job_id) {
        this.Job_id = Job_id;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public void setManager_id(String Manager_id) {
        this.Manager_id = Manager_id;
    }

    public void setDepartment_id(String Department_id) {
        this.Department_id = Department_id;
    }

    public void setLocation_id(String Location_id) {
        this.Location_id = Location_id;
    }

    @Override
    public String toString() {
        return  Employee_id + " " + First_name + " " + Last_name + " " + Email + " " + Phone_number + " " + Hire_date + " " + Job_id + " " + Salary + " " + Manager_id + " " + Department_id + " " + Location_id;
    }
    
}
