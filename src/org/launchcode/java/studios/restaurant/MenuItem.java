package org.launchcode.java.studios.restaurant;

import java.util.Date;

//TODO declare private fields name, description, category, price, dateAdded, isNew
public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private Date dateAdded;
    private Boolean isNew;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }




//TODO add getters and setters for each field
//initialize dateAdded as current date

}
