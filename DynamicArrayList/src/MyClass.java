/**
 * Created by i81113 on 9/2/2016.
 */
import java.util.ArrayList;
public class MyClass {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>(5);
        MyList.add(1);
        MyList.add(2);
        MyList.add(3);
        MyList.add(4);
        MyList.add(5);

        for (Integer x: MyList)
            System.out.println(x);

        //Size of the Array is resized depending upon the use.
        System.out.println("size = "+ MyList.size());
        MyList.remove(2);
        //After removing array size would change
        for (Integer x: MyList)
            System.out.println(x);

        //Size of the Array is resized depending upon the use.
        System.out.println("size = "+ MyList.size());
    }
}
