import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Kwaku Ofosu-Agyeman and Leslie Nartey Kodjoe
 * This class is used to test the Item class which is used 
 * to take inventory
*/
public class ItemStock
{
    /**
     * The main method takes the user's input using the 
     * Scanner class and instatites the Item class inserting 
     * the input into its respective positon in the class. 
     * The for loop makes the code run for the number of times specified
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner itemN=new Scanner(System.in);
        System.out.println("Enter the number of different items you would like to update");
        int num=itemN.nextInt();

        for(int i=0;i<num;i++)
        {
            Scanner item=new Scanner(System.in);
            System.out.println("Enter the item name");
            String name=item.nextLine();
            Scanner quantity=new Scanner(System.in);
            System.out.println("Enter the quantity");
            int quant=quantity.nextInt();
            Scanner price=new Scanner(System.in);
            System.out.println("Enter the item price");
            double price1=item.nextDouble();

            Item k=new Item(name, quant, price1);
            k.printAll();
            k.writingTextToFile();
        }
        itemN.close();
    }
} 