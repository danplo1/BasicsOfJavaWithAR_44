package com.observer_38;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 20.11.2018.
 * Obserwator to taki wzorzec projektowy, który ustala relacje pomiędzy dwoma obiektami, gdzie jeden obiekt jest obserwujący
 * a drugi jest obserwowanym np stacja pogodowa: czujnik temp -->(obserwator) --> stacja pogodowa --> (obserwator)--> wyswietalacze
 * stacja pogodowa jest obiektem obserwującym i obserwowanym. Obiekty obserwujące działaja niezalęznie od siebie, mozna
 * kazdy z nich usunąć i nie bedzie miało to wpływu na pozostałe
 * */

public class Observer {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(24);

        TempReader tr1 =  new TempReader(1);
        weatherStation.addRecipient(tr1);
        //weatherStation.setTemperature(27);

        System.out.println("========<<<<>>>>========");

        TempReader tr2 = new TempReader(2);
        weatherStation.addRecipient(tr2);

        //weatherStation.setTemperature(30);
        //weatherStation.setTemperature(22);

       // weatherStation.delRecipient(tr1); //usunięcie jednego z czytników pomiarów
       // weatherStation.setTemperature(25);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę: ");
        int a = scanner.nextInt();

        weatherStation.setTemperature(a);

        main(null);
    }
}
