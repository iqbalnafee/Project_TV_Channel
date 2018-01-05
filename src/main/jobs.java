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
public class jobs {
    
    String job_id,job_title,min_salary,max_salary;

    public jobs(String job_id,String job_title,String min_salary,String max_salary) {
        this.job_id = job_id;
        this.job_title = job_title;
        this.min_salary=min_salary;
        this.max_salary=max_salary;
    }

    public String getJob_id() {
        return job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getMin_salary() {
        return min_salary;
    }

    public String getMax_salary() {
        return max_salary;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setMin_salary(String min_salary) {
        this.min_salary = min_salary;
    }

    public void setMax_salary(String max_salary) {
        this.max_salary = max_salary;
    }
    

   
    @Override
    public String toString() {
        return  job_id + " " + job_title+" "+min_salary+" "+max_salary ;
    }
    
}
