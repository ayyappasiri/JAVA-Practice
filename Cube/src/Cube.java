/**
 * Created by i81113 on 9/1/2016.
 */
public class Cube {
    int length;
    int breadth;
    int height;
    public int getCubeVolume()
    {
        return (length * breadth * height);
    }

    Cube ()
    {
        System.out.println("We are in Constructor");
        length = 10;
        breadth = 20;
        height =  30;
    }
    Cube (int l, int b, int h)
    {
        System.out.println("We are in Constructor");
        length = l;
        breadth = b;
        height =  h;
    }
}
