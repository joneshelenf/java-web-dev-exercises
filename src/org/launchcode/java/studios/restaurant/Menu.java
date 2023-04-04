package org.launchcode.java.studios.restaurant;


import java.util.ArrayList;
import java.util.Date;

//TODO declare menuItems (ArrayList<menuItem>) and lastUpdated date, isNew boolean
public class Menu {
    private ArrayList<MenuItem> MenuItem = new ArrayList<MenuItem>();
    private Date lastUpdated;
    private Boolean isNew;
    public ArrayList<org.launchcode.java.studios.restaurant.MenuItem> getMenuItem() {
        return MenuItem;
    }

    public void setMenuItem(ArrayList<org.launchcode.java.studios.restaurant.MenuItem> menuItem) {
        MenuItem = menuItem;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }



}
