package com.facade_34;

/**
 * Created by Daniel_D'AGE on 17.11.2018.
 */
public class BankSystem {

    public float checkTheAccountBankomat(long cardNumber) {
        if (cardNumber == 1234567890) {
            return 356.78f;
        } else {
            return 0.00f;
        }
    }

    public String cashWithdrawal(int amount) {
        return " Z konta wypłacono: " + amount + " PLN ";
    }

    public String activeTheCard(long cardNumber) {
        return "Karta numer: " + cardNumber + "aktywna";
    }

    public void webPayment() {
        //płatność przez internet
    }

    public void internetPayment() {
        // płatność kartą przez internet
    }

    public void makeAtransfer(long fromAccount, long onAccount, float amount) {
        //przelej pieniądze

    }

    public void loanMoney(){
        // pozycz pieniądze
    }
}
