package interfaces;

import classes.products.*;

/*
*   Interface for employees. Every employee should inherent this interface and uses methods of the elements specific for the employees purpose
 */
public interface intEmployee {
    void visit(Rice rice);
    void visit(Yogurt yogurt);
    void visit(BottledWater bottledWater);
    void visit(Meat meat);
    void visit(Cantaloupe cantaloupe);
}
