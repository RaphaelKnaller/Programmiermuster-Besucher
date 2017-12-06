package classes.products;

import classes.misc.Liquid;
import classes.misc.Price;
import interfaces.intEmployee;
import interfaces.intProduct;

import java.util.Date;

/*
*   Product: bottledWater
 */
public class BottledWater implements intProduct {

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
    *   Expirydate of the product
     */
    private Date expiryDate = new Date();
    /*
    *   Amount of the product
     */
    private Liquid liter = new Liquid(0.0);

    /*
    *   Constructor with preset values
     */
    public BottledWater(){
        this.price.setPrice(2.99);
        this.expiryDate = new Date(117,06,04);
        this.liter.setUnits(1);
    }

    /*
    * Constructor for custom values
    *
    *   @param price price of the product
    *   @param expiryDate expiryDate of the product
    *   @param units units of the product
     */
    public BottledWater(double price, Date expiryDate, double units) {
        this.price.setPrice(price);
        this.expiryDate = expiryDate;
        this.liter.setUnits(units);
    }

    /*
    *   Gets the value of the product
    *
    *   @return price value of the product
     */
    public Price getValue(){
        return new Price(price.getPrice() * liter.getUnits(), price.getCurrency());
    }

    /*
    *   checks for the expiryDate
    *
    *   @return string tells if its spoiled or not
     */
    public String lookatexpiryDate(){
        if (expiryDate.before(new Date())){
            return "Water is spoiled";
        } else {
            return "Water is OK";
        }
    }
}
