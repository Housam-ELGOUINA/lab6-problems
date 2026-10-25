package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice ;
        int quantity;
        double totalPrice = 0 ;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();

            scan.nextLine() ;
// *** create a new item and add it to the cart

            item =  new Item(itemName , itemPrice , quantity) ;
            cart.add(item) ;

            // *** print the contents of the cart object using println
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();





        }
        while (keepShopping.equals("y"));

        System.out.println(cart) ;


        for ( Item x : cart) {
            totalPrice += x.getPrice()*x.getQuantity() ;
        }

        System.out.println("the total price is : " + totalPrice) ;
    }


}
