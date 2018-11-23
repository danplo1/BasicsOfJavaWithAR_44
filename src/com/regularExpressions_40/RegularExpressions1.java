package com.regularExpressions_40;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Daniel_D'AGE on 23.11.2018.
 * <p>
 * walidacja adresów email, sprawdzenie prawidłowości adresów email, ale nie pod katem tego czy istnieja
 */
public class RegularExpressions1 {

    public static void main(String[] args) {

        String[] string = {"test@google.com",
                "test.test@google.com",
                "test.test@google.com.pl",
                "test123@google.com",
                "test_test@google.com.pl",
                "123test.test@google.com",
                "123test.test@google.com.p",
                "_@google.com",
                "!@google.com",
                "!aaa_@google.com",
        };

        //"^[\\w]+(\\.[\\w]+)*@[\\w-]+(\\.[a-z]+)$"

        Pattern patt = Pattern.compile("^[a-zA-Z0-9]+[\\._a-zA-Z0-9]*@[a-zA-Z0-9]+\\.[a-z]{2,}[\\.a-z]*$");
        Matcher m = null;

        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i] + ": ");
            m = patt.matcher(string[i]);
            System.out.println(m.matches());

        }

    }
}
