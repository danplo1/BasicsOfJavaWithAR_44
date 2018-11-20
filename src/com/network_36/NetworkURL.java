package com.network_36;

import java.net.URL;

/**
 * Created by Daniel_D'AGE on 19.11.2018.
 * , URL - klasa publiczna finalna, dziedziczenie po tej klasie jest niemożliwe, url musi przyjąc protokół po którym sie
 * łączymy -> http://, https:// etc.

 */
public class NetworkURL {

    public static void main(String[] args) throws Exception{

        URL url = new URL("http://interia.pl/");

        System.out.println("Protokół: " + url.getProtocol());
        System.out.println("Komputer: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Plik:" + url.getFile());
        System.out.println("Całość / Full: " + url.toExternalForm()); // pełny adres



    }

}
