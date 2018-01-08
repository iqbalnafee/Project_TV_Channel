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
public class Jobs_history {
    String employee_id,start_date,end_date,job_id,department_id;

    public Jobs_history(String employee_id, String start_date, String end_date, String job_id, String department_id) {
        this.employee_id = employee_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.job_id = job_id;
        this.department_id = department_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getJob_id() {
        return job_id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    @Override
    public String toString() {
        return employee_id + " " + start_date + " " + end_date + " " + job_id + " " + department_id;
    }
    
}
