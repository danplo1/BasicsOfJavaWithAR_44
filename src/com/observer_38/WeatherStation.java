package com.observer_38;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Daniel_D'AGE on 20.11.2018.
 */
public class WeatherStation implements com.observer_Interfaces_38.WeatherStation {

    ArrayList<TempReader> recipient;
    int temperature;

    public WeatherStation(int temperature) {
        recipient = new ArrayList<>();
        this.recipient = recipient;
    }


    @Override
    public void addRecipient(TempReader tempReader) {
        recipient.add(tempReader);
    }

    @Override
    public void delRecipient(TempReader tempReader) {
        recipient.remove(tempReader);

    }

    @Override
    public void notifyRecpien() {
        Iterator<TempReader> iterator = recipient.iterator(); // do iteratora najelpsza funkcja while
        while (iterator.hasNext()) {
            TempReader tempReader = iterator.next();
            tempReader.update(temperature);
        }
    }

    //metoda, która zasymuluje nam czujnik temperatury, ustawia nam wartośc zmiennej

    public void setTemperature (int newTemperature){

        System.out.println(" Nowa wartość pomiaru " + newTemperature + " ℃");
        temperature = newTemperature;
        notifyRecpien();

    }

}
