/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Balloon {
    
    private String Color;
    private int numOfBalloon;
    private int HeliumOrNot;
    

    public Balloon() {
    }

    public Balloon(int numOfBallon, String Color,int HeliumOrNot) {
        this.numOfBalloon = numOfBallon;
        this.Color = Color;
        this.HeliumOrNot=HeliumOrNot;
    }

    
    public void setNumOfBalloon(int numOfBallon) {
        this.numOfBalloon = numOfBallon;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setHeliumOrNot(int HeliumOrNot) {
        this.HeliumOrNot = HeliumOrNot;
    }

    public int getHeliumOrNot() {
        return HeliumOrNot;
    }

    public int getNumOfBalloon() {
        return numOfBalloon;
    }

    public String getColor() {
        return Color;
    }
    
    
    public double thepriceDiteals(){
        double price=0;
        switch(HeliumOrNot){
            
            //if the balloon with helium
            case 1:
                price=10*numOfBalloon;
                System.out.println("\nyou orderd "+numOfBalloon+" "+Color+" ballons full of helium so the price become "+10*numOfBalloon);
                break;
                
            //if the balloon with out helium
            case 2:
                price=3*numOfBalloon;
                System.out.println("\nyou orderd "+numOfBalloon+" "+Color+" ballons with out helium so the price become "+3*numOfBalloon);
                break;
        }
        return price;
    }
    
    //this method to calculate the price of balloon
     public double thePrice(){
        double price=0;
        switch(HeliumOrNot){
            case 1:
                price=10*numOfBalloon;
                break;
            case 2:
                price=3*numOfBalloon;
                break;
        }
        return price;
    }
    
     
    public String HeliumOrNot() {
        String s="";
        if(HeliumOrNot==1){
            s="with helium";
        }
        if(HeliumOrNot==2){
            s="with out helium";
        }
        return s;
    }
    
    @Override
    public String toString() {
        return   "\n"+numOfBalloon +" "+Color+ " balloons "+HeliumOrNot() ;
    }

}
