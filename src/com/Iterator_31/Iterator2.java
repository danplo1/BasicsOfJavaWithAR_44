package com.Iterator_31;

import java.util.*;

/**
 * Created by Daniel_D'AGE on 15.11.2018.
 */
public class Iterator2 {
    public static void main(String[] args) {


        Set<String> colSet = new HashSet<>();
        colSet.add("string 1");
        colSet.add("string 2");
        colSet.add("string 3");
        colSet.add("string 4");



        java.util.Iterator it = colSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
