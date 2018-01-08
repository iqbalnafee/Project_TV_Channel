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
public class Casting {
    String Cast_name,Cast_id,Casting_fee;

    public Casting(String Cast_name, String Cast_id, String Casting_fee) {
        this.Cast_name = Cast_name;
        this.Cast_id = Cast_id;
        this.Casting_fee = Casting_fee;
    }

    public String getCast_name() {
        return Cast_name;
    }

    public String getCast_id() {
        return Cast_id;
    }

    public String getCasting_fee() {
        return Casting_fee;
    }

    public void setCast_name(String Cast_name) {
        this.Cast_name = Cast_name;
    }

    public void setCast_id(String Cast_id) {
        this.Cast_id = Cast_id;
    }

    public void setCasting_fee(String Casting_fee) {
        this.Casting_fee = Casting_fee;
    }

    @Override
    public String toString() {
        return "Casting{" + "Cast_name=" + Cast_name + ", Cast_id=" + Cast_id + ", Casting_fee=" + Casting_fee + '}';
    }
    
    
}
