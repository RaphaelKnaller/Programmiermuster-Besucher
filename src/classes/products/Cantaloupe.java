package classes.products;

import classes.misc.Price;
import interfaces.intEmployee;
import interfaces.intProduct;

import java.util.Date;

/*
*   Product: Cantaloupe
 */
public class Cantaloupe implements intProduct {

    /*
    *   Visitor methode
    *
    *   @param employee checks the product by the employees purpose
     */
    @Override
    public void accept(intEmployee employee) {
        employee.visit(this);
    }

    /*
    *   Price of the product
     */
    private Price price = new Price(0.0);
    /*
    *   expiryDate of the product
     */
    private Date expiryDate = new Date();
    /*
    *   Amount of the product
     */
    private int count = 0;

    /*
    * Constructor with premade values
     */
    public Cantaloupe(){
        this.price.setPrice(5.99);
        this.expiryDate = new Date(2017,06,04);
        this.count = 1;
    }

    /*
    * Constructor for custom values
    *
    *   @param price price of the product
    *   @param expiryDate expiryDate of the product
    *   @param count units of the product
     */
    public Cantaloupe(double price, Date expiryDate, int count) {
        this.price.setPrice(price);
        this.expiryDate = expiryDate;
        this.count = count;
    }

    /*
    *   Gets the value of the product
    *
    *   @return price value of the product
     */
    public Price getValue(){
        return new Price(price.getPrice() * count);
    }

    /*
    *   checks for the expiryDate
    *
    *   @return string tells if its spoiled or not
     */
    public String smell(){
        if (expiryDate.before(new Date())){
            return "Cantalope is spoiled";
        } else {
            return "Cantalope is OK";
        }
    }
}
