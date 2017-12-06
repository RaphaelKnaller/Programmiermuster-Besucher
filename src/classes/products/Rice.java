package classes.products;

import classes.misc.Price;
import classes.misc.Weight;
import interfaces.intEmployee;
import interfaces.intProduct;

import java.util.Date;

/*
*   Product: Rice
 */
public class Rice implements intProduct {

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
    *   weight of the product
     */
    private Weight weight = new Weight(0.0);

    /*
    * Constructor with premade values
     */
    public Rice(){
        this.price.setPrice(12.99);
        this.expiryDate = new Date(2017,06,04);
        this.weight.setWeight(1);
    }

    /*
    * Constructor for custom values
    *
    *   @param price price of the product
    *   @param expiryDate expiryDate of the product
    *   @param weight units of the product
     */
    public Rice(double price, Date expiryDate, double weight) {
        this.price.setPrice(price);
        this.expiryDate = expiryDate;
        this.weight.setWeight(weight);
    }

    /*
    *   Gets the value of the product
    *
    *   @return price value of the product
     */
    public Price getValue(){
        return new Price(price.getPrice() * weight.getWeight());
    }

    /*
    *   checks for the expiryDate
    *
    *   @return string tells if its spoiled or not
     */
    public String lookat() {
        if (expiryDate.before(new Date())) {
            return "Rice is spoiled";
        } else {
            return "Rice is OK";
        }
    }
}
