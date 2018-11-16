package com.Static_final_32;

/**
 * Created by Daniel_D'AGE on 15.11.2018.
 * Składowe statyczne i słowo kluczowe final
 * Składowe statyczne to takie statyczne, najczęściej metody, ale również zmienne, które są własnością klasy a nie jej
 * obiektów. Dzieki temu nie potrzebujemy tworzyć nowych obiektów danej kalsy, wystarczy, że odwołamy się do emtody albo do zmiennej
 * poprzedzając ją nazwą danej klasy, w której ona została zdefiniowana. Ograniczenia: metody (składowe) statyczne nie moga korzystać
 * z metod (składowych) niestatycznych.
 * Słowko Final - to słowo, które określa nam, że coś jest ostateczne, wspólnie ze słowem static, jest wykorzystaywane
 * do określenia jakiejś stałej. Uzywamy tylko duzych literz z podkresleniem. Nie można w procesie dziedzuczenia przesłaniać
 * metod okreslanych jako final, metod finalnych.
 * Po klasach final także nie można dziedziczyć! Nie można jest rozszerzać podczas dziedziczenia.
 */
public class StaticFinal extends Example {


    public static int size = 10;

    public static final double PI = 3.1415;
    public static final int MAX_VALUE = 100;


    public static void main(String[] args) {



//        StaticFinal sf = new StaticFinal();
//
//        System.out.println("Wielkość: " + getSize());
//}
//
//    public static int getSize() {
//        return size;
//    }




//        Example ex = new Example();
//        System.out.println(ex.getQuantity());
//
//        Example ex2 = new Example();
//        System.out.println(ex2.getQuantity());
//
//        Example ex3 = new Example();
//        System.out.println(ex3.getQuantity());
//
//        System.out.println(ex.getQuantity());


        Example e = new Example();
        String string = e.giveString();
        System.out.println(string);

    }


}





