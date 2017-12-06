package classes.misc;

/*
*   Business logic for product price
 */
public class Price {

    /*
    *   price value
     */
    private double price;

    /*
    *   Type of Currency
     */
    private char currency = '€';

    /*
    *   Constructor if the price is in euro(€)
    *
    *   @param price price in euro(€)
     */
    public Price(double price){
        setPrice(price);
    }

    /*
    *   Constructor if the price is something else than Euro(€)
    *
    *   @param price price of that product
    *   @param currency currency of that price
     */
    public Price(double price, char currency){
        setPrice(price);
        setCurrency(currency);
    }

    /*
    *   Getter of the price value
    *
    *   @return price price of that product
     */
    public double getPrice() {
        return this.price;
    }

    /*
    *   Setter of the price. If the price is below 0 its 0
    *
    *   @param price price of that product
     */
    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    /*
    *   Getter of the currency
    *
    *   @return curreny curreny of that price
     */
    public char getCurrency() {
        return currency;
    }

    /*
    *   Setter of the currency
    *
    *   @param currency currency of that price
     */
    public void setCurrency(char currency) {
        this.currency = currency;
    }

    /*
    *   toString of that object
    *
    *   @return string "price currency"
     */
    @Override
    public String toString() {
        return getPrice() + " " + getCurrency();
    }
}
