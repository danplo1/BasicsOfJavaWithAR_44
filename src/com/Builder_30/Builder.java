package com.Builder_30;

/**
 * Created by Daniel_D'AGE on 13.11.2018.
 * Builder  - wzorzec projektowy, pozwala łatwo tworzyć obiekty, prz czym pozwlaa nam przekazywać wszytskie parametry
 *do tego konstruktora, badz te które znamy, wówczas automatycznie je zastąpi nullami. Builder gwarantuje ze obiekt zostanie
 * poprawnie utworzony, bez podawania wszytskich parametrów i pilnowania ich kolejności, wówczas zastapi je nullami.
 */
public class Builder {

    public static void main(String[] args) {

       Vehicle veh = new Vehicle.Builder()
               .id(1)
               .mark("Volvo V50")
               .registration("AB 123456")
               .maxSpeed(260)
               .airbags(6)
               .wheels(4)
               .build();

        System.out.println(veh.getId());
        System.out.println(veh.getMark());
        System.out.println(veh.getRegistration());
        System.out.println(veh.getMaxSpeed());
        System.out.println(veh.getAirbags());
        System.out.println(veh.getWheels());

        System.out.println("--------------------");

        Vehicle veh1 = new Vehicle.Builder()
                .id(2)
                .mark("Renault Megane")
                .registration("ACB 654321")
                .maxSpeed(200)
                .airbags(4)
                .wheels(4)
                .build();

        System.out.println(veh1.getId());
        System.out.println(veh1.getMark());
        System.out.println(veh1.getRegistration());
        System.out.println(veh1.getMaxSpeed());
        System.out.println(veh1.getAirbags());
        System.out.println(veh1.getWheels());
    }

}
