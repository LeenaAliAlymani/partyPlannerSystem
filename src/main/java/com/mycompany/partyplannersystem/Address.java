/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Address {

    private String Country;
    private String City;
    private String Street;
    private String District;

    public Address() {
    }

    public Address(String Country, String City, String Street, String District) {
        this.Country = Country;
        this.City = City;
        this.Street = Street;
        this.District = District;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    @Override
    public String toString() {
        return   Country + " - " + City + " - " + Street + " - " + District;
    }

}
