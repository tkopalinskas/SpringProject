package it.akademija;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;


public class Products {

    private int id;
    private String name;
    private String image;
    private String discription;
    private double price;

    public Products(){

    }

    public  Products(int id, String name, String image, String discription, double price){
        this.id = id;
        this.name = name;
        this.image = image;
        this.discription = discription;
        this.price = price;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDiscription() {
        return discription;
    }

    public double getPrice() {
        return price;
    }

}
