package classes.employees;

import classes.products.*;
import interfaces.intEmployee;
/*
*   DateEmployee checks the products date
 */
public class DateEmployee implements intEmployee {
    /*
    *   Checks the rice date
    *
    *   @param rice ricebag or other rice product
     */
    @Override
    public void visit(Rice rice) {
        System.out.println(rice.lookat());
    }

    /*
    *   Checks the yogurt date
    *
    *   @param yogurt yogurt or other yogurt products
     */
    @Override
    public void visit(Yogurt yogurt) {
        System.out.println(yogurt.lookat());
    }

    /*
    *   Checks the bottled water date
    *
    *   @param bottledWater bottledWater or other water products
     */
    @Override
    public void visit(BottledWater bottledWater) {
        System.out.println(bottledWater.lookatexpiryDate());
    }

    /*
    *   Checks the meat date
    *
    *   @param meat meat or other meat products
     */
    @Override
    public void visit(Meat meat) {
        System.out.println(meat.lookat());
    }

    /*
    *   Checks the cantaloupe date
    *
    *   @param cantaloup cantaloupe or orther cantaloupe products
     */
    @Override
    public void visit(Cantaloupe cantaloupe) {
        System.out.println(cantaloupe.smell());
    }
}
