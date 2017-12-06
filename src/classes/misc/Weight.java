package classes.misc;

/*
*   Business logic of for products
 */
public class Weight {

    /*
    * Weight of the Product
     */
    private double weight;

    /*
    * Unit of mesurement of that product
     */
    private String UoM = "kg";

    /*
    *   Constructor if the UoM is kilogram(kg)
    *
    *   @param weight weight of that product in kilogram(kg)
     */
    public Weight(double weight){
        setWeight(weight);
    }

    /*
    *   Constructor if the UoM is not kilogram(kg)
    *
    *   @param weight weight of that product in choosen UoM
    *   @param uom UoM of that product
     */
    public Weight(double weight, String uom){
        setWeight(weight);
        setUoM(uom);
    }

    /*
    *   Getter for weight value
    *
    *   @return weight weight of the product
     */
    public double getWeight() {
        return weight;
    }

    /*
    *   Setter for weight value. If the weight is below 0 its set to 0
    *
    *   @param weight weight of the product
     */
    public void setWeight(double weight) {
        if(weight > 0){
            this.weight = weight;
        } else {
            this.weight = 0;
        }
    }

    /*
    *   Getter for UoM value
    *
    *   @return UoM UoM of that type of weight object
     */
    public String getUoM() {
        return UoM;
    }

    /*
    *   Setter for UoM value
    *
    *   @param uom UoM of that type of weight object
     */
    public void setUoM(String uom) {
        UoM = uom;
    }

    /*
    *   toString methode
    *
    *   @return string "weight UoM"
     */
    @Override
    public String toString() {
        return getWeight() + " " + getUoM();
    }
}
