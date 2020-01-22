import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 
 * @author Kwaku Ofosu-Agyeman and Leslie Nartey Kodjoe
 * This class identifies the criteria that an item
 * should have and also how the item can be 
 * manipulated
 */
public class Item
{
    
    public String name;
    public int quantity;
    public double price;

    /**
     * 
     * @param name
     * @param quantity
     * @param price
     */
    public Item(String name,int quantity,double price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public Item()
    {
        name="";
        quantity=0;
        price=0;
    }
    public String getName()
    {
        return name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double price()
    {
        return price;
    }
    /**
     * 
     * @param k
     * @return int
     */
    public int increaseQuantity(int k)
    {
        quantity=quantity + k;
        return quantity;
    }
    /**
     * 
     * @param j
     * @return int
     */
    public int decreaseQuantity(int j)
    {
        quantity=quantity-j;
        return quantity;
    }
    /**
     * 
     * @param m
     * @return String
     */
    public String setName(String m)
    {
        name=m;
        return m;
    }

    public double getPrice()
    {
        return price;
    }
    public int setQuantity(int k)
    {
        quantity=k;
        return k;
    }
    public double setPrice(double m)
    {
        price=m;
        return m;
    }
    public void printAll()
    {
        System.out.println("The item is "+getName() +"\nThe quantity is "+getQuantity()+"\nThe price is "+getPrice());
    }
    public double changePrice(double k)
    {
        k=price;
        return k;
    }
    /**
     * This method takes in writes the data given into a file 
     * and a backup file.
     */
    public void writingTextToFile() {
  		    
        PrintWriter printWriter = null;
        PrintWriter backup = null;
        Item k=new Item(name,quantity,price);
        
        try {
            printWriter = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
        }catch(FileNotFoundException fnfe) {
            fnfe.getMessage();
        }
        printWriter.print(name+" "+quantity+" GHc"+ price);
        printWriter.println();
        try {
            backup = new PrintWriter(new FileOutputStream("backup_essentials_stock.txt",true));
        }catch(FileNotFoundException e) {
            e.getMessage();
        }
        backup.print(name+" "+ quantity+" "+" GHC"+price);
        backup.println();
          //Close Writer
          printWriter.close();
          backup.close();
          
  }

}