package com.factory_33;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 16.11.2018.
 * Wzorzec projektowy Factory - fabryka - związany jest  polimrofizmem i dziedziczeniem, pozwala nam w procesie
 * decyzyjnym utworzyć włąsciwy typ obiektu, który nas interesuje.
 */
public class Factory {
    public static void main(String[] args) {

        Factory factory = new Factory();
        System.out.println("Podaj markę: ");
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String mark = factory.giveCar(string).getMark();
        String clas = factory.giveCar(string).getClass().getName();

        System.out.println(mark);
        System.out.println(clas);
    }

    public Cars giveCar(String mark) {
        Cars car;

        if (mark.equalsIgnoreCase("Volvo")) {
            car = new Volvo();
        } else if (mark.equalsIgnoreCase("Renault")) {
            car = new Renault();
        } else if (mark.equalsIgnoreCase("Saab")) {
            car = new Saab();
        } else {
            car = new Cars();
        }
        return car;
    }

}
