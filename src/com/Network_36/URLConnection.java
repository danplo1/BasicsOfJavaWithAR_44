package com.Network_36;

import java.net.URL;
import java.util.Date;

/**
 * Created by Daniel_D'AGE on 19.11.2018.
 * URL Connection  umozliwia nam połącznie już nie do samej strony, ale do serwera
 *
 */
public class URLConnection {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://interia.pl");
        java.net.URLConnection urlConnection = url.openConnection(); //otwiera połaczenia do serwera

        long date = urlConnection.getDate();
        System.out.println(new Date(date));

        System.out.println(" ");

        System.out.println(urlConnection.getContentType());
        System.out.println(" ");

        date = urlConnection.getExpiration();
        System.out.println(new Date(date));

        date = urlConnection.getLastModified();
        System.out.println(new Date(date));
        System.out.println(" ");

        int a = urlConnection.getContentLength(); // długośc zawartości
        System.out.println(a);



    }
}
