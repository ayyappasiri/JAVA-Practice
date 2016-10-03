/**
 * Created by i81113 on 9/1/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Cube cube1 = new Cube();
        //DEFAULT Constructor defining by java
        System.out.println(cube1.getCubeVolume());
        Cube cube2 = new Cube(10,20,30);
        System.out.println(cube2.getCubeVolume());
    }
}