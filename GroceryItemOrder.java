/*
The GroceryItemOrder class should have an item name, a quantity, and a price per unit, and it should have a constructor setting all these values,
and one only setting the name(the default quantity should be one). It should have a getCost-method returning the total cost of the item in its given quantity,
 and a toString-method returning a String with the name, quantity, and total cost. All fields should have getter and setter methods.
 */
public class GroceryItemOrder {

    private String name;
    private double price;
    private int quantity;


    public GroceryItemOrder(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double getCost() {
        return (quantity * price);
    }

    @Override
    public String toString() {
        return "GroceryItemOrder{" +
                "name='" + name + '\'' +
                ", total cost=" + price * quantity +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}