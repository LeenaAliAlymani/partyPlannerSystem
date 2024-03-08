/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Client {

    private Name nameOfClient;
    private long numberOfClient;
    private Address addressOfClient;

    public Client(){
    }

    public Client(Name nameOfClient, long numberOfClient, Address addressOfClient) {
        this.nameOfClient = nameOfClient;
        this.numberOfClient = numberOfClient;
        this.addressOfClient = addressOfClient;
    }

    public Name getNameOfClient() {
        return nameOfClient;
    }

    public void setNameOfClient(Name nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public long getNumberOfClient() {
        return numberOfClient;
    }

    public void setNumberOfClient(long numberOfClient) {
        this.numberOfClient = numberOfClient;
    }

    public Address getAddressOfClient() {
        return addressOfClient;
    }

    public void setAddressOfClient(Address addressOfClient) {
        this.addressOfClient = addressOfClient;
    }

    
    @Override
    public String toString() {
        return "Clinet information: \n"
                + "\n" + "Name: " + nameOfClient
                + "\n" + "Phone Number: " + numberOfClient
                + "\n" + "Address: " + addressOfClient;
    }

    public boolean equals(Name n) {
        return this.getNameOfClient().equals(n);
    }
}
