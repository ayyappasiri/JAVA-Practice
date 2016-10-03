/**
 * Created by i81113 on 8/30/2016.
 */
import java.util.Scanner;
public class javaTutorial3Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height;
        int age;
        System.out.println("How tall are you in inches?");
        height = in.nextInt();
        System.out.println("What is your age in years?");
        age = in.nextInt();

        if((height >= 52) && (age >= 9))
            System.out.println("You can ride!");
        else
            System.out.println("You can't ride!");
    }

}
