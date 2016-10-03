/**
 * Created by i81113 on 8/30/2016.
 */
import java.util.*;
public class RandomNumberGen {
    public static void main(String[] args) {
        Random random = new Random();
        int a;
        int b = 5;
        while (b >= 0)
        {
            a = random.nextInt(3) +1;
            System.out.println("Random number is " + a);
            b--;
        }
    }
}
