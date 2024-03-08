/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public abstract class Party implements DJ{

    private int numOfPepole;
    private Dinner[] dinner;
    private Cake cake;
    private Drinks[] drink;
    private Balloon[] ballon;
    private Date date;

    public Party() {
        ballon = new Balloon[0];
        dinner = new Dinner[0];
        drink = new Drinks[0];
    }
    
    public Party(int numOfPepole, Cake cake ,Date date) {
        this.numOfPepole = numOfPepole;
        this.cake = cake;
        this.date = date;
        ballon = new Balloon[0];
        dinner = new Dinner[0];
        drink = new Drinks[0];


    }

    public Party(int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink, Balloon[] ballon ,Date date) {
        this.numOfPepole = numOfPepole;
        this.dinner = dinner;
        this.cake = cake;
        this.drink = drink;
        this.ballon = ballon;
        this.date = date;
        
    }

    public Party(int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink,Date date) {
        this.numOfPepole = numOfPepole;
        this.dinner = dinner;
        this.cake = cake;
        this.drink = drink;
        this.date = date;
        ballon = new Balloon[0];
    }
    
    public Party(int numOfPepole, Cake cake, Drinks[] drink,Date date) {
        this.numOfPepole = numOfPepole;
        this.cake = cake;
        this.drink = drink;
        this.date = date;
        ballon = new Balloon[0];
        dinner = new Dinner[0];
    }

    public int getNumOfPepole() {
        return numOfPepole;
    }

    public void setNumOfPepole(int numOfPepole) {
        this.numOfPepole = numOfPepole;
    }

    public Dinner[] getDinner() {
        return dinner;
    }

    public void setDinner(Dinner[] dinner) {
        this.dinner = dinner;
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public Drinks[] getDrink() {
        return drink;
    }

    public void setDrink(Drinks[] drink) {
        this.drink = drink;
    }

    public Balloon[] getBallon() {
        return ballon;
    }

    public void setBallon(Balloon[] ballon) {
        this.ballon = ballon;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    //this method calculate all the prices in the party
    public double CalculatepriceWithDiteals() {
        double dinnerPrice=0;
        double drinksPrice=0;
        double ballonsPrice=0;
        double cakePrice=0;
        
        double price = 0;
        
        double cakeprice=cake.thePrice();
        price+=cakeprice;
        System.out.println("\n\nthe total price of the cake is : "+cakeprice);
        
        System.out.println("\n------------ price of dinner ------------");
        for (int i = 0; i < dinner.length; i++){
            price += dinner[i].thePrice();
            dinnerPrice += dinner[i].thepriceDiteals();
        }
        System.out.println("\n\nthe total price of the dinner is : "+dinnerPrice);
        
        System.out.println("\n------------ price of drinks ------------");
        for (int i = 0; i < drink.length; i++){
            price += drink[i].thePrice();
            drinksPrice += drink[i].thepriceDiteals();
        }
        System.out.println("\n\nthe total price of the drinks is : "+drinksPrice);
        
        System.out.println("\n------------ price of balloons ------------");
        for (int i = 0; i < ballon.length; i++){
            price += ballon[i].thePrice();
            ballonsPrice += ballon[i].thepriceDiteals();
        }
        System.out.println("\n\nthe total price of the balloons is : "+ballonsPrice);
        
        
        System.out.println("\n                    ------------                    ");
        System.out.println("the total price of all requests in this party is : "+price);
        
        return price;
    }
    
    
    
    //this method to display all the elements in the dinner array
    public String dinnerDisplaying(){
        String s="";
        for (int i = 0; i < dinner.length; i++){
           s+=dinner[i].toString(); 
        }
        return s;
    }
    
    //this method to display all the elements in the drinks array
    public String drinksDisplaying(){
        String s="";
        for (int i = 0; i < drink.length; i++){
           s+=drink[i].toString(); 
        }
        return s;
    }
    
    //this method to display all the elements in the balloon array
    public String balloonDisplaying(){
        String s="";
        for (int i = 0; i < ballon.length; i++){
           s+=ballon[i].toString(); 
        }
        return s;
    }   

    @Override
    public String toString() {
        return   "\n" + "The number of invitees: " + numOfPepole
                + "\n" + "The date of the party: " + date
                + "\n" + "------------The cake-----------" + cake
                + "\n" + "------------The dinner---------" + dinnerDisplaying()
                + "\n" + "------------The drinks---------" + drinksDisplaying()
                + "\n" + "------------The ballons--------" + balloonDisplaying();
    }

}
