/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
import java.time.LocalDate;

public class Date {

    private int day;
    private int month;
    private int year;

    private int dayNow = LocalDate.now().getDayOfMonth();
    private int monthNow = LocalDate.now().getMonthValue();
    private int yearNow = LocalDate.now().getYear();

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //this method compare 2 dates the date that the user input and the date now to know if the user date is not in the past 
    //if the dete is in the past it will throw ArithmeticException
    public void compareTo(Date dateOfParty, Date dateNow) {

        if (dateOfParty.getYear() < dateNow.yearNow ) {
            throw new ArithmeticException("The date is not available!");
        }
        
        if (dateOfParty.getYear() == dateNow.yearNow && dateOfParty.getMonth() < dateNow.monthNow){
                throw new ArithmeticException("The date is not available!");
        }
        
        if (dateOfParty.getYear() == dateNow.yearNow && dateOfParty.getMonth() == dateNow.monthNow && dateOfParty.getDay() < dateNow.dayNow ){
            throw new ArithmeticException("The date is not available!");}
              
    }

    @Override
    public String toString() {
        return day + " / " + month + " / " + year;
    }

}
