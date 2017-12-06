package classes.employees;

import classes.products.*;
import interfaces.intEmployee;

/*
*   ValueEmployee checks the value of the product
 */
public class ValueEmployee implements intEmployee {
    /*
    *   Checks the rice value
    *
    *   @param rice rice or other rice products
     */
    @Override
    public void visit(Rice rice) {
        System.out.println(rice.getValue());
    }

    /*
    *   Checks the yogurt value
    *
    *   @param yogurt yogurt or other yogurt products
     */
    @Override
    public void visit(Yogurt yogurt) {
        System.out.println(yogurt.getValue());
    }

    /*
    *   Checks the bottledWater value
    *
    *   @param bottledWater bottledWater or other water products
     */
    @Override
    public void visit(BottledWater bottledWater) {
        System.out.println(bottledWater.getValue());
    }

    /*
    *   Checks the meat value
    *
    *   @param meat meat or other meat products
     */
    @Override
    public void visit(Meat meat) {
        System.out.println(meat.getValue());
    }

    /*
    *   Checks the cantaloupe value
    *
    *   @param cantaloupe cantaloupe or other cantaloupe products
     */
    @Override
    public void visit(Cantaloupe cantaloupe) {
        System.out.println(cantaloupe.getValue());
    }
}
