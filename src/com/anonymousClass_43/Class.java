package com.anonymousClass_43;

/**
 * Created by Daniel_D'AGE on 27.11.2018.
 * Klasa anonimowa to taka klasa, której nie nadajemy żadnej nazwy, a Java sama ją nazywa
 * w specyficzny sposób, poniewaz musi wiedzieć do czego się odwoływać. Klasy anonimowe
 * nie są instancjami interfejsówi tworzą jedną i tylko jedną swoja instancje
 * Klasy anonimowe są zawsze wewnętrzne mogą posiadac zmienne, nie dotyczy metod, których możemy mięć, więcej
 * niż deklaruje interface
 */
public class Class {

    private static int aa = 40;


    public static void main(String[] args) {

        int b = 100;// dla klasy anonimowej to zmienna globalana

        MyInterface myInterface = new MyInterface() {

            int a = 10;

            @Override
            public void showText(String pString) {
                System.out.println(pString);
                System.out.println(a);
                System.out.println(b);
                System.out.println(aa);

            }
        }; // średnik - dla Javy to jest jedna linia instrukcji do wykonania


        myInterface.showText("Cześć!");
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.x); // zmienna z interfejsu, poprzez referencje myInterface


        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void showText(String pString) {
                System.out.println(pString);

            }
        };
        System.out.println(myInterface1.getClass()); // nazwa klasy nadana przez javę po znaku$

    }
}
