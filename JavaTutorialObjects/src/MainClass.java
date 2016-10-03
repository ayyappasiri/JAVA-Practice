/**
 * Created by i81113 on 8/31/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Obj janaki = new Obj();
        //janaki.id = 435;
        //janaki.name = "Janaki";
        //janaki.age = 29;

        janaki.setId(1);
        janaki.setName("Janaki");
        janaki.setAge(29);

        System.out.println(janaki.getName()+ " is "+janaki.getAge(), + " years");

    }

}
