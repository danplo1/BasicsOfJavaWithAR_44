package com.Network_36;

import java.net.InetAddress;

/**
 * Created by Daniel_D'AGE on 19.11.2018.
 * Wstęp do sieci: Admission to Network: InetAddress - klasa która umozliwia nam odczytywanie adresów IP interesujących nas domen
 *
 */
public class Network {
    public static void main(String[] args) throws Exception{

        InetAddress address = InetAddress.getLocalHost(); //metoda statyczna
        System.out.println(address);

        address = InetAddress.getByName("interia.pl");
        System.out.println(address);
        System.out.println(" ");

        InetAddress address1[] = InetAddress.getAllByName("amazon.com"); // jedna domena z przypisanymi wieloma adresami IP
        for (int i = 0; i <address1.length ; i++) {
            System.out.println(address1[i]);
        }

        address = InetAddress.getLoopbackAddress(); // zwrot
        System.out.println(address);

    }


}
