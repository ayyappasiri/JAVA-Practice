/**
 * Created by i81113 on 8/30/2016.
 */
import java.util.Scanner;
public class JavaTutorialMethods {
    public static void main(String[] args)
    {
        greeting();
        PriceList();
        YourOrder();
    }
    static void greeting()
    {
        System.out.println("***************************");
        System.out.println("Welcome to our Burger House");
    }
    static void PriceList()
    {
        System.out.println("***************************");
        System.out.println("Price List");
        System.out.println("*************");
        System.out.println("Chicken Berger : $" +2.4);
        System.out.println("Veg Berger : $" +2);
        System.out.println("Ham Berger : $" +2.3);
        System.out.println("***************************");
    }

    static double YourOrder() {

        Scanner in = new Scanner(System.in);
        int CBurger;
        System.out.println("How many Chicken Berger would you like?");
        CBurger = in.nextInt();
        int VBurger;
        System.out.println("How many Veg Berger would you like?");
        VBurger = in.nextInt();
        int HBurger;
        System.out.println("How many Ham Berger would you like?");
        HBurger = in.nextInt();
        double TotalPrice;
        TotalPrice = (CBurger*2.4 + VBurger*2 + HBurger*2.3);
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("Your Total Bill comes to: $" +TotalPrice);
        System.out.println("*******************************");
        return TotalPrice;
    }

}
