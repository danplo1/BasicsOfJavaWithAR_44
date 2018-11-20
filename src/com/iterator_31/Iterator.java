package com.iterator_31;


import java.util.*;

/**
 * Created by Daniel_D'AGE on 15.11.2018.
 * <p>
 * Iterator - wzorzec projektowy, który nam pozwala przechodzić po kolejnych elementach kolekcji, bez konieczności znajomości
 * tego co ta kolekcja zawiera, poniewaz Iterator sam się dostosouje do kolekcji na której pracuje. Itearotr może sprawdzić
 * kiedy osiągnął koniec kolekcji, słuzy do tego metoda hashNext(), która sprawdze true lub false
 */
public class Iterator<Interger extends Number> {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("jeden");
        listString.add("dwa");
        listString.add("trzy");
        listString.add("cztery");


        List<Integer> listInt = new ArrayList<>();
        listInt.add(100);
        listInt.add(200);
        listInt.add(300);
        listInt.add(400);

        Set<String> colSet = new HashSet<>();
        colSet.add("string 1");
        colSet.add("string 2");
        colSet.add("string 3");
        colSet.add("string 4");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");
        map.put(4, "cztery");


        //System.out.println("\n ======= String List - w przód, bez Iteratora =======");

        /*for (String s : listString) { //pierwsza opcja pętla for each, która  porusza sie po kolekcji do przodu
            System.out.println(s);
        }*/

        System.out.println("\n ======= String List - w przód, z Iteratorem =======");


        java.util.Iterator i = listString.iterator(); /* tożsamy zapis z zapisem z pętli for each, ale iterator umozliwia
                                                        //poruszanie się po kolekcji do tyłu*/
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        java.util.Iterator ii = listInt.iterator(); /* tożsamy zapis z zapisem z pętli for each, ale iterator umozliwia
                                                        //poruszanie się po kolekcji do tyłu*/
        while (ii.hasNext()) {
            System.out.println(ii.next());
        }


        System.out.println("\n ======= String List - w tył, z Iteratorem =======");



        while (((ListIterator) i).hasPrevious()) { // iterownaie kolekcji od jej końca
            System.out.println(((ListIterator) i).previousIndex() + " : " + ((ListIterator) i).previous());
        }

        while (((ListIterator) ii).hasPrevious()) { // iterownaie kolekcji od jej końca
            System.out.println(((ListIterator) ii).previousIndex() + " : " + ((ListIterator) ii).previous());
        }
    }



}

