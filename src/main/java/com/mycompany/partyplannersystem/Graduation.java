/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Graduation extends Party{

    public Graduation(int numOfPepole, Cake cake , Date date ) {
        super(numOfPepole, cake,date);
    }
    
    public Graduation(int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink, Balloon[] ballon, Date date) {
        super(numOfPepole, dinner, cake, drink, ballon ,date);
    }

    public Graduation(int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink, Date date) {
        super(numOfPepole, dinner, cake, drink ,date);
    }
    
    public Graduation(int numOfPepole, Cake cake, Drinks[] drink, Date date) {
        super(numOfPepole, cake, drink ,date);
    }
    
    public void musicList(){
        for(int i=40 ,j=1; i<50 ;i++,j++){
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
        
        System.out.println("\n------------------------ [ price of Graduation party ] ------------------------");
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
        for (int i = 0; i < this.getBallon().length; i++){
            price += this.getBallon()[i].thePrice();
            ballonsPrice += this.getBallon()[i].thepriceDiteals();
        }
        System.out.println("\nthe total price of the balloons is : "+ballonsPrice);
        
        
        System.out.println("\n------------------------------------------------------------------------------------- ");
        System.out.println("the total price of all requests in this party is : "+price);
        
        return price;
    }
    

    @Override
    public String toString() {
        return "\n\n---------------- Graduation party --------------- "
                + "\n" + "The number of invitees: " + getNumOfPepole()
                + "\n" + "The date of the party: " + getDate()
                + "\n" + "------------The cake-----------" + getCake()
                + "\n" + "------------The dinner---------" + dinnerDisplaying()
                + "\n" + "------------The drinks---------" + drinksDisplaying()
                + "\n" + "------------The ballons--------" + balloonDisplaying();

    }
    
}
