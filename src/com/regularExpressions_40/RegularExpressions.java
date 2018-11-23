package com.regularExpressions_40;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Daniel_D'AGE on 23.11.2018.
 * <p>
 * wyrażenia regularne bazuja na tzw. metaznakach, które nalezy pisac i uzywac ostroznie, ponieważ sa sicle okreslony reguły
 * ich stosowania. musza byc one prawidłowo skonstruowane, tak aby kompilator wzorców regularnych, wiedział w jaki sposób ma
 * ten wzorzec utworzyć i czego w łańcuchac znaków ma szukać. Stosuje sie ich do sprawdzenia poprawnośc wprowadzonych przez
 * uzytkownika danych w sensie formatu. Używamy klasy Pattern. M
 */

public class RegularExpressions {
    public static void main(String[] args) {

        Pattern patt = Pattern.compile("Java");
        Matcher match = patt.matcher("Programownie Java");// klasa która słuzy do porównywania danego łańcucha znaków ze skompilowanym wzorcem -porównanie

        System.out.println(match.matches()); // false
        System.out.println(match.find());// metoda find wyszukuje cokolwiek co pasuje do wzorca, wówczas metoda zwróci true

        System.out.println("==============================");

        //^ - poczatek wzorca
        // $ - koniec wzorca
        // / - znak ucieczki

        // [0-9] - nasz łańcuch moze składać się tylko z jednej cyfry z zakresu od 0 do 9
        // [^0-9] = (lub) \d lub \\D - ^ w nawiasach, negacja, nasz łańcuch znaków, może składac sie z jednego znaku, ale nie może to być cyfra
        // [^0-9] - \\d znak ucieczki, dla wyrażenia regularnego
        // [a-zA-Z] =\\w - dowolny znak, ale nie będacy cyfra
        // [^a-zA-Z] =\\W - dowolny znak, tylko nie duże i małe litery
        // \\s - dowolny znak biały - spacja
        // \\S - wszystko tylko nie spacja
        // \\t - może byc tabulator
        // \\T - wszystko tylko nie tabulator
        // \\n - znak nowej linii
        // * - opcja, znak może ale nie musi sie pojawić
        // + - znak musi bezwzględnie wystapic
        // \. - dowolny znak

        // [a]{x} - x wystapień lietry a
        // [a]{1,} = [a] +  - jeden lub więcej razy
        // [a]{x,y} - min x wystapien litery a, ale max y razy
        // [a]{0, } = [a]* - litera a może sie pojawić, ale nie musi
        // [a]? = [a]{0,1} - znak może(ale nie musi) pojawić się więcej niż raz


        //kod pocztowy

        Pattern p = Pattern.compile("^$[0-9]{2}-[0-9]{3}$");
        Matcher m = p.matcher("01-234");
        System.out.println(m.matches());

        //lub

        Pattern p1 = Pattern.compile("^[\\d]{2}-[\\d]{3}$");
        Matcher m1 = p1.matcher("01-234");
        System.out.println(m1.matches());
    }
}


