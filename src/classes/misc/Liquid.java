package classes.misc;

/*
*   Business logic for liquits
 */
public class Liquid {

    /*
    *   liquid units
     */
    private double units;

    /*
    *   unit of mesurement for liquits
     */
    private String UoM = "l";

    /*
    *   Constructor if the UoM is in liters(l)
    *
    *   @param units units of liquid in liters(l)
     */
    public Liquid(double units){
        setUnits(units);
    }

    /*
    * Constructor if the UoM is something else than liters(l)
    *
    * @param units units of liquid in choosen UoM
    * @param uom Uom of the liquid
     */
    public Liquid(double units, String uom){
        setUnits(units);
        setUoM(uom);
    }

    /*
    *   Getter for unit value
    *
    *   @return units units of liquid
     */
    public double getUnits() {
        return units;
    }

    /*
    *   Setter for units. Does not go below, instaid sets it to 0
    *
    *   @param units units of liquid
     */
    public void setUnits(double units) {
        if(units > 0){
            this.units = units;
        } else {
            this.units = 0;
        }
    }

    /*
    *   Getter for UoM
    *
    *   @return uom UoM of that type of liquid
     */
    public String getUoM() {
        return UoM;
    }

    /*
    * Setter for UoM
    *
    * @param uom UoM of that type of liquid
     */
    public void setUoM(String uom) {
        UoM = uom;
    }

    /*
    * toString methode
    *
    * @return string "units UoM"
     */
    @Override
    public String toString() {
        return getUnits() + " " + getUoM();
    }
}
