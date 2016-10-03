/**
 * Created by i81113 on 8/30/2016.
 */

import java.util.Scanner;
public class JavaTutorial2Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.println("How old are you?");
        age = in.nextInt();
        if(age >= 21)
            System.out.println("You are old enough to drink alcohol");
        else
            System.out.println("You are not old enough to drink alcohol");
    }

}
