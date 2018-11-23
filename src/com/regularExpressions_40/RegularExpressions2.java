package com.regularExpressions_40;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Daniel_D'AGE on 23.11.2018.
 * <p>
 * Dopasowania wyprzedzajace to mini warunki, które sa kompilowane, a które maja za zadanie sprawdzic,
 * czy okreslone znaki opisane w tymże warunku w ogóle się znajduja we wzorcu, dopasowania wyprzedzajace ignoruja
 * kolejnośc występowania znaków, zaczyna sie od znaku "?" i "="
 * zapis (?!.*\\s) żaden ze znaków będacy znakiem białym
 */

public class RegularExpressions2 {
    public static void main(String[] args) {

        String[] string = {"start",
                "Start1",
                "start123",
                "Start_12",
                "1234746",
                "123testStart",
                "123test Start",
                "!Start12",
                "!Start129",
                "!Start#99",

        };

        Pattern patt = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\!\\@\\#\\$\\*])(?!.*\\s).{8,12}$");
        Matcher m = null;

        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i] + ": ");
            m = patt.matcher(string[i]);
            System.out.println(m.matches());

        }
    }


}
