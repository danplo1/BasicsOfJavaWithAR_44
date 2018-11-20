package com.observer_38;

/**
 * Created by Daniel_D'AGE on 20.11.2018.
 *wyświetlacz temperatury
 */
public class TempReader {

    private int nextNumber;

    public TempReader (int nextNumber){
        this.nextNumber = nextNumber;
    }


    public void update (int temperature){
        System.out.println(" Czytnik nr: " + nextNumber + " odczytał kolejny pomiar temperatury: "
                + temperature + "℃");
    }
}
