package com.observer_Interfaces_38;

/**
 * Created by Daniel_D'AGE on 20.11.2018.
 */
import com.observer_38.TempReader;

public interface WeatherStation {

    //trzy metody
    void addRecipient (TempReader tempReader); //dodaj odbiorcę
    void delRecipient (TempReader tempReader); //usuń odbiorcęt
    void notifyRecpien (); // powiadom odbiorcę


}
