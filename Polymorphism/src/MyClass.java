/**
 * Created by i81113 on 9/1/2016.
 */
public class MyClass
{
    public static void main(String[] args)
    {
        Bank abc = new Bank_ABC();
        //reference of BANK class pointing to the object of child class Bank_ABC
        Bank def = new Bank_DEF();
        Bank xyz = new Bank_XYZ();
        //perfect examples of Overriding
        //Changing the implementation of method
        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());
    }
}
