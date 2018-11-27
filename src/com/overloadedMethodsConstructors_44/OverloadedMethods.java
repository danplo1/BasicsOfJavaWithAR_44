package com.overloadedMethodsConstructors_44;

/**
 * Created by Daniel_D'AGE on 27.11.2018.
 * Przeciążanie metod i konstruktorów # - jedyny operator przeciązony w javie to "+",
 * Aby metody były prawidłowo przeciążone, to musza się różnić kolejnością argumentami, ich typami oraz ich ilością,
 */
public class OverloadedMethods {

    //metody przeciążone

    public void giveAnumber() { //ta metoda nie przyjmuje żadnego argumentu

        System.out.println("Brak liczby");
    }

    public static int giveAnumber(int a) { //ta metoda jest przeciążona, bo przyjmuje jakiś argument, java ignoruje typ zwaracany
        return a;
    }

    public static int giveAnumber(double a) {
        return (int) a; //rzutowanie
    }

    public static int giveAnumber(int a, int b) {

        return a + b;
    }

    public static int giveAnumber(int a, double b) {
        return a + (int) b;
    }

    public static int giveAnumber(double b, int a) {
        return a + (int) b;
    }

    public static int giveAnumber(double b, int a, int c) {
        return a + (int) b + c;
    }
}

