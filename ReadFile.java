import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFile {
    public void readGroceries(GroceryList list)
    {
        File file = new File("groceries.csv");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                String[] item = nextLine.split(",");
                list.addOrder(new GroceryItemOrder(item[0],
                        Integer.parseInt(item[1]),
                        Double.parseDouble(item[2]))
                );
            }

            scanner.close();
        }

        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }
    }

    public void readGroceries(GroceryList2 list)
    {
        File file = new File("groceries.csv");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                String[] item = nextLine.split(",");
                list.addGroceryItemOrder(new GroceryItemOrder(item[0],
                        Integer.parseInt(item[1]),
                        Double.parseDouble(item[2]))
                );
            }

            scanner.close();
        }

        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }
    }
}
