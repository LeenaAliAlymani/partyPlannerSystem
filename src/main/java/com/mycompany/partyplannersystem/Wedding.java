/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Wedding extends Party {

    private String flowersColor;
    private int naturalFlowers;
    private String chairsColor;

    
    public Wedding(String flowersColor, int naturalFlowers, String chairsColor, int numOfPepole, Cake cake , Date date) {
        super(numOfPepole, cake ,date);
        this.flowersColor = flowersColor;
        this.naturalFlowers = naturalFlowers;
        this.chairsColor = chairsColor;
    }


    public Wedding(String flowersColor, int naturalFlowers, String chairsColor, int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink, Balloon[] ballon, Date date) {
        super(numOfPepole, dinner, cake, drink, ballon ,date);
        this.flowersColor = flowersColor;
        this.naturalFlowers = naturalFlowers;
        this.chairsColor = chairsColor;
    }

    public Wedding(String flowersColor, int naturalFlowers, String chairsColor, int numOfPepole, Dinner[] dinner, Cake cake, Drinks[] drink, Date date) {
        super(numOfPepole, dinner, cake, drink ,date);
        this.flowersColor = flowersColor;
        this.naturalFlowers = naturalFlowers;
        this.chairsColor = chairsColor;
    }
    
    public Wedding(String flowersColor, int naturalFlowers, String chairsColor, int numOfPepole, Cake cake, Drinks[] drink, Date date) {
        super(numOfPepole, cake, drink ,date);
        this.flowersColor = flowersColor;
        this.naturalFlowers = naturalFlowers;
        this.chairsColor = chairsColor;
    }


    public String getFlowersColor() {
        return flowersColor;
    }

    public void setFlowersColor(String flowersColor) {
        this.flowersColor = flowersColor;
    }

    public int getNaturalFlowers() {
        return naturalFlowers;
    }

    public void setNaturalFlowers(int naturalFlowers) {
        this.naturalFlowers = naturalFlowers;
    }

    public String getChairsColor() {
        return chairsColor;
    }

    public void setChairsColor(String chairsColor) {
        this.chairsColor = chairsColor;
    }

    
    public void  musicList(){
        for(int i=0 ,j=1; i<10 ;i++,j++){
            System.out.println(j+"-"+music[i]);
        }

    }
    
    public String naturalFlowers() {
        String s="";
        if(naturalFlowers==1){
            s="Natural Flowers";
        }
        if(naturalFlowers==2){
            s="industrial Flowers";
        }
        return s;
    }
    
    
    @Override
    public double CalculatepriceWithDiteals() {
        double dinnerPrice = 0;
        double drinksPrice = 0;
        double ballonsPrice = 0;
        double cakePrice = 0;

        double price = 0;

        System.out.println("\n------------------------ [ price of Wedding party ] ------------------------");
        double cakeprice = this.getCake().thePrice();
        price += cakeprice;
        System.out.println("\nthe total price of the cake is : " + cakeprice);

        System.out.println("\n------------ price of dinner ------------");
        for (int i = 0; i < this.getDinner().length; i++) {
            price += this.getDinner()[i].thePrice();
            dinnerPrice += this.getDinner()[i].thepriceDiteals();
        }
        System.out.println("\nthe total price of the dinner is : " + dinnerPrice);

        System.out.println("\n------------ price of drinks ------------");
        for (int i = 0; i < this.getDrink().length; i++) {
            price += this.getDrink()[i].thePrice();
            drinksPrice += this.getDrink()[i].thepriceDiteals();
        }
        System.out.println("\nthe total price of the drinks is : " + drinksPrice);

        System.out.println("\n------------ price of balloons ------------");
        for (int i = 0; i < getBallon().length; i++) {
            price += getBallon()[i].thePrice();
            ballonsPrice += getBallon()[i].thepriceDiteals();
        }
        System.out.println("\nthe total price of the balloons is : " + ballonsPrice);

        System.out.println("\n------------ price of Flowers ------------\n");
        price +=WeddingPriceDiteals();
        
        System.out.println("\n------------------------------------------------------------------------------------- ");
        System.out.println("the total price of all requests in this party is : " + price);
        
        return price;
    }
    
    public double WeddingPriceDiteals(){
        double price =0;
        switch(naturalFlowers){
            case 1:
                price=500;
                System.out.println("the the type of floers is Natural Flowers so the price of it is : 500 ");
                break;
            case 2:
                price=350;
                System.out.println("the the type of floers is industrial Flowers so the price of it is : 350 ");
                break;
        }
        return price;            
    }

    
    @Override
    public String toString() {
        return "\n\n---------------- Wedding party --------------- "
                + "\n" + "The number of invitees: " + getNumOfPepole()
                + "\n" + "The date of the party: " + getDate()
                + "\n" + "------------The cake-----------" + getCake()
                + "\n" + "------------The dinner---------" + dinnerDisplaying()
                + "\n" + "------------The drinks---------" + drinksDisplaying()
                + "\n" + "------------The ballons--------" + balloonDisplaying()
                + "\n" + "-------------Flowers-----------"
                + "\n" + "The type of the flowers is " + naturalFlowers()
                + "\n" + "The color of the flowers is " + flowersColor
                + "\n" + "The color of the chairs is " + chairsColor;

    }

}
