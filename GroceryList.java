/*
The GroceryList class should use an array to store the grocery item groceryItemOrders. Assume that a grocery list will have no more than 10 item groceryItemOrders.
The GroceryList class should have an add-method that will add a given item order to the list if the list has fewer than 10 items,
and a getTotalCost-method that will return the total sum cost of all grocery item groceryItemOrders in this list. It should also have a toString-method.
 */
public class GroceryList {

    private GroceryItemOrder[] groceryItemOrders;
    private int index;

    public GroceryList() {
        this.groceryItemOrders = new GroceryItemOrder[10];
    }

    public void addOrder(GroceryItemOrder itemOrder){
        this.groceryItemOrders[index] = itemOrder;
        index++;
    }

    public double getTotalCost(){
        double totalcost = 0;
        for (int i = 0; i < this.index; i++) {
            totalcost += this.groceryItemOrders[i].getPrice();

        }
        return totalcost;

    }

}
