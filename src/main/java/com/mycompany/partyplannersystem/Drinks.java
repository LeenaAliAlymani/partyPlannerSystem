/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Drinks {

    private int typeofdrinks;
    private int numofCubs;

    public Drinks() {
    }

    public Drinks(int typeofdrinks, int numofCubs) {
        this.typeofdrinks = typeofdrinks;
        this.numofCubs = numofCubs;
    }

    public void setTypeofdrinks(int typeofdrinks) {
        this.typeofdrinks = typeofdrinks;
    }

    public void setNumofCubs(int numofCubs) {
        this.numofCubs = numofCubs;
    }


    public int getTypeofdrinks() {
        return typeofdrinks;
    }

    public int getNumofCubs() {
        return numofCubs;
    }
    
    public double thepriceDiteals(){
        double price=0;
        switch(typeofdrinks){
            
            //if the drink is tea
            case 1:
                price=3*numofCubs;
                System.out.println("\nthe drink is tea this is 3 SAR ");                
                System.out.println("you orderd "+numofCubs+" cubs of tea so the price become "+3*numofCubs);
                break;
                
            //if the drink is cooffee
            case 2:
                price=7*numofCubs;
                System.out.println("\nthe drink is cooffee this is 7 SAR ");                
                System.out.println("you orderd "+numofCubs+" cubs of cooffee so the price become "+7*numofCubs);
                break;
                
            //if the drink is juice    
            case 3:
                price=4*numofCubs;
                System.out.println("\nthe drink is juice this is 4 SAR ");                
                System.out.println("you orderd "+numofCubs+" cubs of juice so the price become "+4*numofCubs);
                break;
                
            //if the drink is soft drink    
            case 4:
                price=3*numofCubs;
                System.out.println("\nthe drink is soft drink this is 3 SAR ");                
                System.out.println("you orderd "+numofCubs+" cubs of soft drink so the price become "+3*numofCubs);
                break;
        }
        return price;
    }
    
    //this method to calculate the price of drinks
    public double thePrice(){
        double price=0;
        switch(typeofdrinks){
            case 1:
                price=3*numofCubs;
                break;
            case 2:
                price=7*numofCubs;
                break;
            case 3:
                price=4*numofCubs;
                break;
            case 4:
                price=3*numofCubs;
                break;
        }
        return price;
    }
    
    public String typeofdrinks() {
        String s="";
        if(typeofdrinks==1){
            s="tea";
        }
        if(typeofdrinks==2){
            s="coffee";
        }
        if(typeofdrinks==3){
            s="juice";
        }
        if(typeofdrinks==4){
            s="soft drinks";
        }
        return s;
    }

    @Override
    public String toString() {
        return  "\n"+numofCubs +  " cubs of "+ typeofdrinks();
    }

}
