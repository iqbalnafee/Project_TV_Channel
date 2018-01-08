/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author user2
 */
public class Ad_during_program {
    int product,program;

    public Ad_during_program(int program, int product) {
        this.product = product;
        this.program = program;
    }
    

    public int getProgram() {
        return program;
    }

    public void setProgram(int program) {
        this.program = program;
    }

    public void setProduct(int product) {
        this.product = product;
    }


    public int getProduct() {
        return product;
    }
    @Override
    public String toString() {
        return  product + " " + program ;
    }
    
    
}
