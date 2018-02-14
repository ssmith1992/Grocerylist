/*
Make a test class with a main-method that instantiates the GroceryList, fill it with GroceryItemOrder-objects, and print it.
Run what happens if you try to add a grocery item order when the list is filled.
 */
public class Run {
    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();
        GroceryList2 groceryList2 = new GroceryList2();

        ReadFile readFile = new ReadFile();
        readFile.readGroceries(groceryList);
        readFile.readGroceries(groceryList2);

        System.out.println(groceryList);
        System.out.println(groceryList2);
        System.out.println(groceryList.getTotalCost());
        System.out.println(groceryList2.getTotalCost());




    }
}
