package com.another_If_35;

/**
 * Created by Daniel_D'AGE on 18.11.2018.
 * <p>
 * Uproszczona instrukcja If, która sprawdza nam warunki  i zwraca nam wartośc na podstawie teo warunku
 * ten if może byc również używany jako argument dla metody
 */
public class AnotherIf {
    public static void main(String[] args) {

        AnotherIf anotherIf = new AnotherIf();

        int a = 1;

        if (a < 5) {
            System.out.println("a < 5");
        } else {
            System.out.println("a > 5");
        }

        //Opcja zapisu z uproszczoną instrukcja If

        String string = (a < 5) ? "a < 5" : "a > 5"; // true : false
        System.out.println(string);
        //lub
        System.out.println((a < 5) ? "a < 5" : "a > 5");
        //lub
        System.out.println((a<5) ? "a < 5" : " a > 5");

        System.out.println((a<5) ? anotherIf.method1() : anotherIf.method2());


        //lub  if jako argument dla metody

        String string2 = anotherIf.method3((a<5) ?  "a < 5" : "a>5");
        System.out.println(" Metoda3 : " + string2);

        System.out.println(anotherIf.method4(8));

    }

    public String method1(){
        return "a < 5";
    }

    public String method2 () {
        return "a>5";
    }

    // if jako argument dla metody

    public String method3(String string){
        return string;
    }

    public String method4(int a){
        return (a<5) ? "a < 5": "a > 5";
     }
}
