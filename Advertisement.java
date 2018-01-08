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
public class Advertisement {
    String Advertisement_id,program_id,product_id;

    

    public Advertisement(String Advertisement_id, String program_id, String product_id) {
        this.Advertisement_id = Advertisement_id;
        this.program_id = program_id;
        this.product_id = product_id;
    }
    
    public String getAdvertisement_id() {
        return Advertisement_id;
    }

    public String getProgram_id() {
        return program_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setAdvertisement_id(String Advertisement_id) {
        this.Advertisement_id = Advertisement_id;
    }

    public void setProgram_id(String program_id) {
        this.program_id = program_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return  Advertisement_id + " " + program_id + " " + product_id;
    }
    
    
}
