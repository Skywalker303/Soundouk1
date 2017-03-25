package com.ticketBuyer.model;

import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class Buyer {

    private String name;
    private int age;
    private String direction;
    private Date date;
    private String Email;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {this.age = age; }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEmail() {
            return Email;
        }

    public void setEmail(String email) {
          Email = email; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
