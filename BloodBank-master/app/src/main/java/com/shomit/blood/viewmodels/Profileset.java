package com.shomit.blood.viewmodels;

import java.io.Serializable;

/***
 Project: BloodBank
 Date: 05/19
 Developer: shomit
 Email: shomitcse@outlook.com
 ***/

public class Profileset implements Serializable {
   private String Address, Division, Contact,Details;
   private String Name, BloodGroup, Quantity;
   private String Time, Date;


   public Profileset() {

    }

    public Profileset(String address,String details,String quantity, String division, String contact, String name, String bloodGroup, String time, String date) {
        Address = address;
        Division = division;
        Contact = contact;
        Name = name;
        BloodGroup = bloodGroup;
        Time = time;
        Date = date;
        Details=details;
        Quantity=quantity;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        this.Division = division;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        this.Contact = contact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
       this.Name = name;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.BloodGroup = bloodGroup;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getdetails() {

        return Details;
    }

    public String getQuantity() {
        return Quantity;
    }
}
