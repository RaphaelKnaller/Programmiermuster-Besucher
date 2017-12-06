package main;

import classes.employees.DateEmployee;
import classes.employees.ValueEmployee;
import classes.products.*;
import interfaces.intEmployee;
import interfaces.intProduct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        ArrayList<intProduct> warehouse = new ArrayList<intProduct>();
        warehouse.add(new BottledWater());
        warehouse.add(new Cantaloupe());
        warehouse.add(new Meat());
        warehouse.add(new Rice());
        warehouse.add(new Yogurt());

        intEmployee valueEmployee = new ValueEmployee();
        for (intProduct product: warehouse) {
            product.accept(valueEmployee);
        }

        intEmployee dateEmployee = new DateEmployee();
        for (intProduct product: warehouse) {
            product.accept(dateEmployee);
        }
    }
}
