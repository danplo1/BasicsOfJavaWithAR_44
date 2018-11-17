package com.Facade_34;

/**
 * Created by Daniel_D'AGE on 17.11.2018.
 * Fasada -  wzorzec projektowy należący do grupy wzorców strukturalnych, tworzymy klasę, której jedynym zadaniem jest
 * wywoływanie odpowiednich metod z innych klas (np. serwisów) czasem w odpowiedniej kolejności
 * lub dodając/modyfikując pewne informacje. Fasada ułatwia dostęp do różnych obiektów i ukrywa szczegóły implementacji.
 */
public class BankLogin {

    public boolean identification(long cardNumber, int pin) {
        if (cardNumber == 1234567890 && pin == 1234) {
            return true;
        } else {
            return false;
        }
    }

    public void identificationWeb(String id, String password) {

    }

    public void identificationMobile() {

    }

}
