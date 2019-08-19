package org.launchcode.java.demos.java4python.restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew ){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew =isNew;
    }

    public double getPrice(){
        return price;
    }
    private void setPrice(double aPrice){
        price = aPrice;
    }

    public String getDescription(){
        return description;
    }

    private void setDescription(String aDescription){
        description = aDescription;
    }

    public String getCategory(){
        return category;
    }

    private void setCategory(String aCategory){
        category = aCategory;
    }
    public boolean getIsNew(){
        return isNew;
    }
    private void setIsNew(boolean aIsNew){
        isNew = aIsNew;
    }


}
