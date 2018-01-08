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
public class Reports {
    String Report_id,Report_name,Report_type,Reporter_id,Cameraman_id,Collection_date;

    public Reports(String Report_id, String Report_name, String Report_type, String Reporter_id, String Cameraman_id, String Collection_date) {
        this.Report_id = Report_id;
        this.Report_name = Report_name;
        this.Report_type = Report_type;
        this.Reporter_id = Reporter_id;
        this.Cameraman_id = Cameraman_id;
        this.Collection_date = Collection_date;
    }

    public String getReport_id() {
        return Report_id;
    }

    public String getReport_name() {
        return Report_name;
    }

    public String getReport_type() {
        return Report_type;
    }

    public String getReporter_id() {
        return Reporter_id;
    }

    public String getCameraman_id() {
        return Cameraman_id;
    }

    public String getCollection_date() {
        return Collection_date;
    }

    public void setReport_id(String Report_id) {
        this.Report_id = Report_id;
    }

    public void setReport_name(String Report_name) {
        this.Report_name = Report_name;
    }

    public void setReport_type(String Report_type) {
        this.Report_type = Report_type;
    }

    public void setReporter_id(String Reporter_id) {
        this.Reporter_id = Reporter_id;
    }

    public void setCameraman_id(String Cameraman_id) {
        this.Cameraman_id = Cameraman_id;
    }

    public void setCollection_date(String Collection_date) {
        this.Collection_date = Collection_date;
    }

    @Override
    public String toString() {
        return  Report_id + " " + Report_name + " " + Report_type + " " + Reporter_id + " " + Cameraman_id + " " + Collection_date ;
    }
    
    
}
