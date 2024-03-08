/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

import java.util.Objects;

/**
 *
 * @author linasmacbook
 */
public class Name {

    private String FirstName;
    private String MidName;
    private String LastName;

    public Name() {
    }

    public Name(String FirstName, String MidName, String LastName) {
        this.FirstName = FirstName;
        this.MidName = MidName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMidName() {
        return MidName;
    }

    public void setMidName(String MidName) {
        this.MidName = MidName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public boolean equals(Object obj) {
        
        Name other = (Name) obj;
        
        if (!Objects.equals(this.FirstName, other.FirstName)) {
           return false;
        }
        if (!Objects.equals(this.MidName, other.MidName)) {
            return false;
        }
        return Objects.equals(this.LastName, other.LastName);
    }
    
    @Override
    public String toString() {
        return   FirstName + " " + MidName + " " + LastName;
    }

}
