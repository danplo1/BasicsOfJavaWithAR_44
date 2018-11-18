package com.Another_If_35;

/**
 * Created by Daniel_D'AGE on 18.11.2018.
 */
public class Another_If2 {

    public static void main(String[] args) {

        // nadanie zmiennej wartości początkowej, jezeli nie była ona przekazana w żaden inny sposób

        String string = null;

        String newString = (string!= null) ? "String nie jest null" : " String jest null";
        //lub
        String newString2 = (string != null) ? string : "Java";

        System.out.println(newString);
    }
}
