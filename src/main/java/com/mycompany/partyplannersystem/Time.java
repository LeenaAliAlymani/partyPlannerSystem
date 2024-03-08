/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute ,int second ) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
    

    @Override
    public String toString() {
        return hour + ":" + minute+":"+second;
    }

}
