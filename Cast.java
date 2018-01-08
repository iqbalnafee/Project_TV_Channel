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
public class Cast {
    String Cast_id,program_id;

    public Cast(String Cast_id, String program_id) {
        this.Cast_id = Cast_id;
        this.program_id = program_id;
    }

    public String getCast_id() {
        return Cast_id;
    }

    public String getProgram_id() {
        return program_id;
    }

    public void setCast_id(String Cast_id) {
        this.Cast_id = Cast_id;
    }

    public void setProgram_id(String program_id) {
        this.program_id = program_id;
    }

    @Override
    public String toString() {
        return "Cast{" + "Cast_id=" + Cast_id + ", program_id=" + program_id + '}';
    }
    
    
}
