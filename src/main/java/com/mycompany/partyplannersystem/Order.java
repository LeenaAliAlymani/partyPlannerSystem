/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author linasmacbook
 */
public class Order {

    
    private Party[] party;
    private Client client;
    private Time timeOfOrder;
    private Date dateOfOrder;

    public Order() {
    }

    public Order(Party[] party, Client client, Time timeOfOrder, Date dateOfOrder) {
        this.party = party;
        this.client = client;
        this.timeOfOrder = timeOfOrder;
        this.dateOfOrder = dateOfOrder;
    }

    public Party[] getParty() {
        return party;
    }

    public void setParty(Party[] party) {
        this.party = party;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setTimeOfOrder(Time timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Time getTimeOfOrder() {
        return timeOfOrder;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }
    
    //this method calculate all the prices in the order
    public void Calculateprice() {
        double price = 0;
        for (int i = 0; i < party.length; i++) {
            price += party[i].CalculatepriceWithDiteals();
        }
        System.out.println("\n------------------------------------------------------------------------------------- ");
        System.out.println("\n-------------**** The total payment of the order is: " + price + " ****---------------");
        double priceWithTax=(0.15*price)+price;
        System.out.println("----------**** The total of the order with 15% tax is: " + priceWithTax + " ****-------------");
    }
    
    //this method to display all the elements in the party array
public String partyDisplaying(){
        String s="";
        for (int i = 0; i < party.length; i++){
           s+=party[i].toString(); 
        }
        return s;
    }

    @Override
    public String toString() {
        return "----------------------------- your Order -------------------------"
                +"\n"+ client  
                +"\n"+"\nthe time Of the Order : " + timeOfOrder 
                +"\n"+"\nthe date Of the Order : " + dateOfOrder  
                + "\n" + "\n-----------------------------* The Partys *--------------------------- " + partyDisplaying()
                +"\n--------------------------------------------------------------";
    }
  

}
