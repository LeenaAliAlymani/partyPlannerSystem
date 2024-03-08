/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Birthday extends Party{

    public Birthday(int numOfPepole, Cake cake ,Date date) {
        super(numOfPepole, cake,date);
    }

    public Birthday(int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink, Balloon[] ballon,Date date) {
        super(numOfPepole, dinner, cake, drink, ballon ,date);
    }

    public Birthday(int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink,Date date) {
        super(numOfPepole, dinner, cake, drink ,date);
    }
    
    public Birthday(int numOfPepole, Cake cake, Drinks[] drink,Date date) {
        super(numOfPepole, cake, drink ,date);
    }

    public void  musicList(){
        for(int i=30 ,j=1; i<40 ;i++,j++){
            System.out.println(j+"-"+music[i]);
        }
    }
    
    @Override
    public double CalculatepriceWithDiteals() {
        double dinnerPrice=0;
        double drinksPrice=0;
        double ballonsPrice=0;
        double cakePrice=0;
        
        double price = 0;
        
        System.out.println("\n------------------------ [ price of Birthday party ] ------------------------");

        double cakeprice=this.getCake().thePrice();
        price+=cakeprice;
        System.out.println("\nthe total price of the cake is : "+cakeprice);
        
        System.out.println("\n------------ price of dinner ------------");
        for (int i = 0; i < this.getDinner().length; i++){
            price += this.getDinner()[i].thePrice();
            dinnerPrice += this.getDinner()[i].thepriceDiteals();
        }
        System.out.println("\nthe total price of the dinner is : "+dinnerPrice);
        
        System.out.println("\n------------ price of drinks ------------");
        for (int i = 0; i < this.getDrink().length; i++){
            price += this.getDrink()[i].thePrice();
            drinksPrice += this.getDrink()[i].thepriceDiteals();
        }
        System.out.println("\nthe total price of the drinks is : "+drinksPrice);
        
        System.out.println("\n------------ price of balloons ------------");
        for (int i = 0; i < getBallon().length; i++){
            price += getBallon()[i].thePrice();
            ballonsPrice += getBallon()[i].thepriceDiteals();
        }
        System.out.println("\nthe total price of the balloons is : "+ballonsPrice);
        
        
        System.out.println("\n------------------------------------------------------------- ");
        System.out.println("the total price of all requests in this party is : "+price);
        
        return price;
    }
    
    @Override
    public String toString() {
        return "\n\n---------------- Birthday party --------------- "
                + "\n" + "The number of invitees: " + getNumOfPepole()
                + "\n" + "The date of the party: " + getDate()
                + "\n" + "------------The cake-----------" + getCake()
                + "\n" + "------------The dinner---------" + dinnerDisplaying()
                + "\n" + "------------The drinks---------" + drinksDisplaying()
                + "\n" + "------------The ballons--------" + balloonDisplaying();

    }
    
    
    
}
