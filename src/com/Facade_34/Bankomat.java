package com.Facade_34;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 17.11.2018.
 */
public class Bankomat {

    private BankomatFacade bankomatFacade = new BankomatFacade();
    private static Bankomat bankomat = new Bankomat();

    public static void main(String[] args) {
        bankomat.bankomatStart();

    }

    public void bankomatStart() {
        int pin = 0;
        boolean authorization = false;

        System.out.println("======== WITAJ W BANKOMACIE LICHWIARSKIEGO BANKU ========\n");
        System.out.println("======= Włóż kartę i pod kod PIN =======\n");

        Scanner sc = new Scanner(System.in);
        System.out.println(" kod PIN: ");
        pin = sc.nextInt();

        System.out.println("Autoryzacja danych...\n");

        authorization = bankomatFacade.identification(1234567890, pin);
        if (authorization) {
            bankomat.viewMenu();
        } else {
            System.out.println("Autoryzacja nie powiodła się, karta została zatrzymana... I co nam zrobisz? ;)");
        }
    }

    public void viewMenu() {

        System.out.println("======= <<< M E N U >>> =======");
        System.out.println("1. Stan konta");
        System.out.println("2. Wypłata gotówki");
        System.out.println("3. Pożycz nam kasę");
        System.out.println("4. Koniec\n");

        System.out.println("wybierz: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankomat.showAccountBalance(1234567890);
                break;
            case 2:
                bankomat.payOutTheCash(300);
                break;
            case 3:
                bankomat.loanOfMoney(200);


            case 4:
                bankomat.end();
                break;
            default:
                bankomat.viewMenu();

        }

    }

    public void showAccountBalance(long cardNumber) {
        System.out.println(bankomatFacade.checkTheAccountBankomat(cardNumber));

    }

    public void payOutTheCash(int amount) {
        String payment = bankomatFacade.cashWithdrawal(amount);
        System.out.println(amount);
        System.out.println("Odbierz kartę!");
        bankomat.end();

    }

    public void loanOfMoney(int loan) {

        int lend = 0;
        int lend1 = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile nam pożyczysz ?: ");
        lend = scanner.nextInt();
        System.out.println(lend + " Aż tyle?!! A da radę cos więcej? ");
        Scanner scanner1 = new Scanner(System.in);
        lend1 = scanner1.nextInt();
        if (lend1>lend) {
            System.out.println("Dzięki nasz wielki sponsorze!!");
        }else{
            System.out.println("Szkoda, bierzemy co dajesz! Nara!");

        }
        bankomat.end();
    }


    public void end() {
        System.exit(0);
    }
}

