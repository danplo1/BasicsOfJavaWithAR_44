package FacadeInterfaces_34;

/**
 * Created by Daniel_D'AGE on 17.11.2018.
 */
public interface BankomatFacadeInterfaces {
    boolean identification (long cardNumber, int pin);
    float checkTheAccountBankomat (long cardNumber);
    String cashWithdrawal (int amount);
    String loanMoney (int loan);
}
