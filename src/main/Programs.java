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
public class Programs {
    String Program_id,Program_name,Program_type,Date,Start_time,Finish_time,Telecast_type,Executor_id,Viewers,TRP;

    public Programs(String Program_id, String Program_name, String Program_type, String Date, String Start_time, String Finish_time, String Telecast_type, String Executor_id, String Viewers, String TRP) {
        this.Program_id = Program_id;
        this.Program_name = Program_name;
        this.Program_type = Program_type;
        this.Date = Date;
        this.Start_time = Start_time;
        this.Finish_time = Finish_time;
        this.Telecast_type = Telecast_type;
        this.Executor_id = Executor_id;
        this.Viewers = Viewers;
        this.TRP = TRP;
    }

    public String getProgram_id() {
        return Program_id;
    }

    public String getProgram_name() {
        return Program_name;
    }

    public String getProgram_type() {
        return Program_type;
    }

    public String getDate() {
        return Date;
    }

    public String getStart_time() {
        return Start_time;
    }

    public String getFinish_time() {
        return Finish_time;
    }

    public String getTelecast_type() {
        return Telecast_type;
    }

    public String getExecutor_id() {
        return Executor_id;
    }

    public String getViewers() {
        return Viewers;
    }

    public String getTRP() {
        return TRP;
    }

    public void setProgram_id(String Program_id) {
        this.Program_id = Program_id;
    }

    public void setProgram_name(String Program_name) {
        this.Program_name = Program_name;
    }

    public void setProgram_type(String Program_type) {
        this.Program_type = Program_type;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setStart_time(String Start_time) {
        this.Start_time = Start_time;
    }

    public void setFinish_time(String Finish_time) {
        this.Finish_time = Finish_time;
    }

    public void setTelecast_type(String Telecast_type) {
        this.Telecast_type = Telecast_type;
    }

    public void setExecutor_id(String Executor_id) {
        this.Executor_id = Executor_id;
    }

    public void setViewers(String Viewers) {
        this.Viewers = Viewers;
    }

    public void setTRP(String TRP) {
        this.TRP = TRP;
    }

    @Override
    public String toString() {
        return  Program_id + " " + Program_name + " " + Program_type + " " + Date + " " + Start_time + " " + Finish_time + " " + Telecast_type + " " + Executor_id + " " + Viewers + " " + TRP ;
    }
    
    
    
}
