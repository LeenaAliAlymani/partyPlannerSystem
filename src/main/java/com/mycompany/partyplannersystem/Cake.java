/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Cake {

    private int height;
    private String flaver;
    private int numOfLevels;
    private String word;
    private int numOfCandles;

    public Cake() {
    }

    public Cake(int height, String flaver,  int numOfLevels, String word, int numOfCandles) {
        this.height = height;
        this.flaver = flaver;
        this.numOfLevels = numOfLevels;
        this.word = word;
        this.numOfCandles = numOfCandles;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFlaver(String flaver) {
        this.flaver = flaver;
    }

    public void setNumOfLevels(int numOfLevels) {
        this.numOfLevels = numOfLevels;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setNumOfCandles(int numOfCandles) {
        this.numOfCandles = numOfCandles;
    }

    public double getHeight() {
        return height;
    }

    public String getFlaver() {
        return flaver;
    }

    public int getNumOfLevels() {
        return numOfLevels;
    }

    public String getWord() {
        return word;
    }

    public int getNumOfCandles() {
        return numOfCandles;
    }
    
    //هذي الميثود لحساب سعر الكيك مع تفاصيله
    public double thePrice(){
        double price=0;
        System.out.println("\n------------ price of cake ------------");
        switch(height){
            //the higth is 6 inch
            case 1:
                price=(150*numOfLevels)+(2*numOfCandles);
                System.out.println("\nthe hight of the cake is 6 inchs that is 150 SAR ");                
                System.out.println("the number of levels is "+numOfLevels+" so the price become "+150*numOfLevels);
                System.out.println("the number of Candles is "+numOfCandles+" so the price of it is "+2*numOfCandles);
                break;
            //the higth is 8 inch    
            case 2:
                price=(200*numOfLevels)+(2*numOfCandles);
                System.out.println("\nthe hight of the cake is 8 inchs that is 150 SAR ");                
                System.out.println("the number of levels is "+numOfLevels+" so the price become "+200*numOfLevels);
                System.out.println("the number of Candles is "+numOfCandles+" so the price of it is "+2*numOfCandles);
                break;
        }
        return price;       
    }
    
    public String height() {
        String s="";
        if(height==1){
            s="6 inch";
        }
        if(height==2){
            s="8 inch";
        }
        return s;
    }

    @Override
    public String toString() {
        return    "\nthe height is : " + height()  
                + "\nthe cake flaver is : " + flaver 
                + "\nthe number of Levels is : " + numOfLevels 
                + "\nthe sentence you want to write in your cake is : " + word 
                + "\nthe number of Candles is : " + numOfCandles ;
    }

}
