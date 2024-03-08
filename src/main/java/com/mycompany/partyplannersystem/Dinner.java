/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Dinner {

    
    private int typeOfDish;
    private int numOfDishe;

    public Dinner() {
    }

    public Dinner( int typeOfDish, int numOfDishe) {
        this.typeOfDish = typeOfDish;
        this.numOfDishe = numOfDishe;
    }

    public void setTypeOfDish(int typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public void setNumOfDishe(int numOfDishe) {
        this.numOfDishe = numOfDishe;
    }

    public int getTypeOfDish() {
        return typeOfDish;
    }

    public int getNumOfDishe() {
        return numOfDishe;
    }

     public double thepriceDiteals(){
        double price=0;
        switch(typeOfDish){
            case 1:
                price=30*numOfDishe;
                System.out.println("\nthe dish is appetizer this is 30 SAR ");                
                System.out.println("you orderd "+numOfDishe+" dishes of appetizer so the price become "+30*numOfDishe);
                break;
            case 2:
                price=20*numOfDishe;
                System.out.println("\nthe dish is burger this is 20 SAR ");                
                System.out.println("you orderd "+numOfDishe+" burgers so the price become "+20*numOfDishe);
                break;
            case 3:
                price=25*numOfDishe;
                System.out.println("\nthe dish is pasta this is 25 SAR ");                
                System.out.println("you orderd "+numOfDishe+" dishes of pasta so the price become "+25*numOfDishe);
                break;
            case 4:
                price=30*numOfDishe;
                System.out.println("\nthe dish is pizza this is 30 SAR ");                
                System.out.println("you orderd "+numOfDishe+" pizzas so the price become "+30*numOfDishe);
                break;
            case 5:
                price=15*numOfDishe;
                System.out.println("\nthe dish is salad this is 15 SAR ");                
                System.out.println("you orderd "+numOfDishe+" salads so the price become "+15*numOfDishe);
                break;
            case 6:
                price=35*numOfDishe;
                System.out.println("\nthe dish is meat balls this is 35 SAR ");                
                System.out.println("you orderd "+numOfDishe+" dishes of meat balls so the price become "+35*numOfDishe);
                break;
            case 7:
                price=25*numOfDishe;
                System.out.println("\nthe dish is potato balls this is 25 SAR ");                
                System.out.println("you orderd "+numOfDishe+" dishes of potato balls so the price become "+25*numOfDishe);
                break;
            case 8:
                price=15*numOfDishe;
                System.out.println("\nthe dish is rice this is 15 SAR ");                
                System.out.println("you orderd "+numOfDishe+" dishes of rice so the price become "+15*numOfDishe);
                break;
            case 9:
                price=45*numOfDishe;
                System.out.println("\nthe dish is steak this is 45 SAR ");                
                System.out.println("you orderd "+numOfDishe+" dishes of steak so the price become "+45*numOfDishe);
                break;
            case 10:
                price=10*numOfDishe;
                System.out.println("\nthe dish is fried potatoes this is 10 SAR ");                
                System.out.println("you orderd "+numOfDishe+" dishes of fried potatoes so the price become "+10*numOfDishe);
                break;
        }
        return price;
    }
     
    //this method to calculate the price of dinner
     public double thePrice(){
        double price=0;
        
        switch(typeOfDish){
            case 1:
                price=30*numOfDishe;
                break;
            case 2:
                price=20*numOfDishe;
                break;
            case 3:
                price=25*numOfDishe;
                break;
            case 4:
                price=30*numOfDishe;
                break;
            case 5:
                price=15*numOfDishe;
                break;
            case 6:
                price=35*numOfDishe;
                break;
            case 7:
                price=25*numOfDishe;
                break;
            case 8:
                price=15*numOfDishe;
                break;
            case 9:
                price=45*numOfDishe;
                break;
            case 10:
                price=10*numOfDishe;
                break;
        }
        return price;
    }

      public String typeOfDish() {
        String s=null;
        if(typeOfDish==1){
            s="appetizer";
        }
        if(typeOfDish==2){
            s="burger";
        }
        if(typeOfDish==3){
            s="pasta";
        }
        if(typeOfDish==4){
            s="pizza";
        }
        if(typeOfDish==5){
            s=" salad";
        }
        if(typeOfDish==6){
            s="meat Balls";
        }
        if(typeOfDish==7){
            s="potato Balls";
        }
        if(typeOfDish==8){
            s="rice";
        }
        if(typeOfDish==9){
            s="steak";
        }
        if(typeOfDish==10){
            s="fried Potatoes";
        }
        return s;
    }
     
    @Override
    public String toString() {
        return  "\n"+numOfDishe +  "  Dishes of "+ typeOfDish();
    }
    
}