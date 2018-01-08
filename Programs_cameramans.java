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
public class Programs_cameramans {
    String Program_id,Cameraman_id;

    public Programs_cameramans(String Program_id, String Cameraman_id) {
        this.Program_id = Program_id;
        this.Cameraman_id = Cameraman_id;
    }

    public String getProgram_id() {
        return Program_id;
    }

    public String getCameraman_id() {
        return Cameraman_id;
    }

    public void setProgram_id(String Program_id) {
        this.Program_id = Program_id;
    }

    public void setCameraman_id(String Cameraman_id) {
        this.Cameraman_id = Cameraman_id;
    }

    @Override
    public String toString() {
        return "Programs_cameramans{" + "Program_id=" + Program_id + ", Cameraman_id=" + Cameraman_id + '}';
    }
    
    
}
