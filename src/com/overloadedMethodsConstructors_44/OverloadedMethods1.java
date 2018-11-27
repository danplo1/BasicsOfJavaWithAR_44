package com.overloadedMethodsConstructors_44;

/**
 * Created by Daniel_D'AGE on 27.11.2018.
 *Przeciążanie konstruktorów, w jednej klasie może być wiele przeciązonych konstruktorów.
 *
 */
public class OverloadedMethods1 {


    private int a;
    private int b;
    private double c;


    public OverloadedMethods1(){
        this.a = a;

    }

    public OverloadedMethods1(int a){ //konstruktor jednoargumentowy

    }

    public OverloadedMethods1(int a, int b){ //konstruktor dwuargumentowy
        this.a = a;
        this.b = b;

    }

    public OverloadedMethods1(int a, double c){
        this.a = a;
        this.c = c;

    }

    public OverloadedMethods1( double c, int a){
        this.a =a;
        this.c = c;

    }

    //public OverloadedMethods1( double c, int a, int b, String x, double d, int f, double g){
      //  this.a = a;
      //  this.c = c; -> builder

    //}

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
