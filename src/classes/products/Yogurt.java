package classes.products;

import classes.misc.Price;
import classes.misc.Weight;
import interfaces.intEmployee;
import interfaces.intProduct;

import java.util.Date;

/*
*   Product: Yogurt
 */
public class Yogurt implements intProduct {

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
    public Yogurt(){
        this.price.setPrice(3.99);
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
    public Yogurt(double price, Date expiryDate, double weight) {
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
    public String lookat(){
        if (expiryDate.before(new Date())){
            return "Yogurt is spoiled";
        } else {
            return "Yogurt is OK";
        }
    }
}
