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
public class Locations {
    String Location_id,Address,Postal_code,City,State_province,Country_code,Country_name;

    public Locations(String Location_id, String Address, String Postal_code, String City, String State_province, String Country_code, String Country_name) {
        this.Location_id = Location_id;
        this.Address = Address;
        this.Postal_code = Postal_code;
        this.City = City;
        this.State_province = State_province;
        this.Country_code = Country_code;
        this.Country_name = Country_name;
    }

    public String getLocation_id() {
        return Location_id;
    }

    public String getAddress() {
        return Address;
    }

    public String getPostal_code() {
        return Postal_code;
    }

    public String getCity() {
        return City;
    }

    public String getState_province() {
        return State_province;
    }

    public String getCountry_code() {
        return Country_code;
    }

    public String getCountry_name() {
        return Country_name;
    }

    public void setLocation_id(String Location_id) {
        this.Location_id = Location_id;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPostal_code(String Postal_code) {
        this.Postal_code = Postal_code;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState_province(String State_province) {
        this.State_province = State_province;
    }

    public void setCountry_code(String Country_code) {
        this.Country_code = Country_code;
    }

    public void setCountry_name(String Country_name) {
        this.Country_name = Country_name;
    }

    @Override
    public String toString() {
        return  Location_id + " " + Address + " " + Postal_code + " " + City + " " + State_province + " " + Country_code + " " + Country_name ;
    }
    
}
