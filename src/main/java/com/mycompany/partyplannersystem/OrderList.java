/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
import java.util.ArrayList;

public class OrderList {

    //this is an array list of order object 
    ArrayList<Order> orderList = new ArrayList<Order>();

    
    public void AddOrder(Order order) {
        orderList.add(order);
        System.out.println("\n\t\t\tYour order has been added successfully !!");
        System.out.println("\n_______________________________________________________________________________________");

    }

    //this method chiecks if the name is correct and then display all the order requarments  
    public void displayOrder(Name n) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getClient().equals(n)) {
                System.out.println(orderList.get(i));
                System.out.println("\n_______________________________________________________________________________________");

            } else {
                System.out.println("\nThe Entered Name Is Not Available!!!!\n");
            }
        }
    }
    
    //this method chiecks if the name is correct and then display the bill 
    public void PrintBill(Name n) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getClient().equals(n)) {
                System.out.println("\n--------------------------------- Your bill ------------------------------------");
                orderList.get(i).Calculateprice();
                System.out.println("\n_______________________________________________________________________________________");
                
            } else {
                System.out.println("\nThe Entered Name Is Not Available!!!!\n");
            }
        }
    }

    //this method chiecks if the name is correct and then delete the order  
    public void DeletOrder(Name n) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getClient().equals(n)) {
                orderList.remove(i);
                System.out.println("\n_______________________________________________________________________________________");
                System.out.println("\n\t\t\tYour Order Has Been Deleted ");
                System.out.println("\n_______________________________________________________________________________________");

            } else {
                System.out.println("\nThe Entered Name Is Not Available!!\n");
            }
        }
    }

    @Override
    public String toString() {
        return "Orderlist{" + "orderlist=" + orderList + '}';
    }

}
