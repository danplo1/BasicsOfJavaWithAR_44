package com.Facade_34;

import FacadeInterfaces_34.BankomatFacadeInterfaces;

/**
 * Created by Daniel_D'AGE on 17.11.2018.
 *
 * Fasada bankamtu
 */
public class BankomatFacade implements BankomatFacadeInterfaces{
    private BankSystem bankSystem;
    private BankLogin bankLogin;

    public BankomatFacade (){
        bankSystem = new BankSystem();
        bankLogin = new BankLogin();
    }
    @Override
    public boolean identification (long cardNumber, int pin){
        boolean correct = false;
        correct = bankLogin.identification(cardNumber,pin);
        return correct;
    }
    @Override
    public float checkTheAccountBankomat (long cardNumber){
        float accountBalance = 0.00f;
        accountBalance = bankSystem.checkTheAccountBankomat(cardNumber);
        return accountBalance;
    }
    @Override
    public String cashWithdrawal (int amount){
        return bankSystem.cashWithdrawal(amount);
    }
    @Override
    public String loanMoney (int loan){

        return null;

    }


}
