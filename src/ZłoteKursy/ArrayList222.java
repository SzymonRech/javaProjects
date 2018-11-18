package ZłoteKursy;

import java.util.ArrayList;

public class ArrayList222 {

        public static void main (String[] args) {

            ArrayList list = new ArrayList();

            for ( int i = 1; i <= 5; i++) {
                list .add(i); // dodajemy 1,2,3,4,5
            }

            System.out. println ( list . toString () ); // Wydrukuje: [1, 2, 3, 4, 5]

            list .add(2,99); // dodaje 99 na pozycji 2

            System.out. println ( list . toString () ); // Wydrukuje: [1, 2, 99, 3, 4, 5]

            list .remove(1); // usunie pozycj� 1, czyli 2

            System.out. println ( list . toString () ); // Wydrukuje: [1, 99, 3, 4, 5]

            System.out. println ("Size : " + list.size ()); // Rozmiar: 5

            int first = (Integer) list.get (0); // we� element na pozycji 0

            System.out. println ("Element na pozycji 0 to: " + first );
        }
    }


class ArrayList2 {

    public static void main (String[] args) {
        // Genaeryczny rodzaj tabeli rodzaj Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Dodajemy 1,2,3,4,5
        for ( int i = 1; i <= 5; i++)
            list.add(i);

        //Drukujemy listę od tyłu
        for ( int i = list.size()-1; i >=0; i--) {
            int n = list.get(i);
            System.out. print (" " + n);
        }

    }}