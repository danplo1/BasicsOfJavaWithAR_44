package com.static_final_32;

/**
 * Created by Daniel_D'AGE on 15.11.2018.
 */
public class Example {

    private static int quantity = 0; //wspólna zmienna, jest własnością klady, bo jest statyczna

    public Example() {
         quantity++;
    }

    public  int getQuantity(){
        return quantity;
    }

    public final String giveString(){
        return "FINAL";

    }
}
