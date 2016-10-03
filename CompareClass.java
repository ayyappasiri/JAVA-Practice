/**
 * Created by i81113 on 8/30/2016.
 */
import java.util.Scanner;
public class CompareClass {
    public static void main(String[] args) {
        //int a = 24, b = 25;
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println("This program compares two numbers and tells you what the difference between the number is");
        System.out.println("Please Enter the first number");
        a = in.nextInt();
        System.out.println("Please Enter the second number");
        b = in.nextInt();
        if(a == b)
            System.out.println("Both are equal");
        else if (a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }


    }
}
