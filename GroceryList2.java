import java.util.*;

public class GroceryList2 {

    private ArrayList<GroceryItemOrder> grocerylist;


    public GroceryList2() {
        grocerylist = new ArrayList<GroceryItemOrder>(10);
    }

    public void addGroceryItemOrder(GroceryItemOrder item) {
        grocerylist.add(item);
    }

    private  void deleteGroceryItemOrder(GroceryItemOrder item) {
        grocerylist.remove(item);
    }

    public double getTotalCost() {
        double sum = 0;

        for (GroceryItemOrder temp: grocerylist)
        {
            sum += temp.getPrice();
        }

        return sum;
    }

    @Override
    public String toString() {
        return "GroceryList2{" +
                "grocery list: " + grocerylist +
                '}';
    }
}
