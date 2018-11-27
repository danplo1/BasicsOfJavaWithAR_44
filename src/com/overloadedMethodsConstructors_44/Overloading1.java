package com.overloadedMethodsConstructors_44;

/**
 * Created by Daniel_D'AGE on 27.11.2018.
 */
public class Overloading1 {
    public static void main(String[] args) {

        OverloadedMethods1 om1 = new OverloadedMethods1();

        OverloadedMethods1 om2 = new OverloadedMethods1(2);

        OverloadedMethods1 om3 = new OverloadedMethods1(2, 4);

        System.out.println(om2.getA()  + " " + om2.getB());


        OverloadedMethods1 om4 = new OverloadedMethods1(2,2.456);

        om3 = new OverloadedMethods1(2.37, 5);

        System.out.println(om4.getA() + " " + om4.getB());
        System.out.println(om4.getA() + " " + om4.getC());
        System.out.println(om3.getC() + " " + om3.getA());

    }


}
