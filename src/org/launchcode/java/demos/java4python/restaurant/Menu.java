package org.launchcode.java.demos.java4python.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menu;
    private Date dateUpdated;

    public Menu(ArrayList<MenuItem> menu, Date dateUpdated){
        this.menu = menu;
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getMenu(){
        return menu;
    }


}
