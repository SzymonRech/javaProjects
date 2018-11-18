package myPackage;

import java.sql.SQLOutput;

public class SomeClass {


    public static void main(String[] args) {
        int myNumber = 12;
        boolean isTrue = false;
        float animalWeight = 10.566f;
        float someAnotherNumber = 2.357688f;
        char mycharacter = 'a'; //1byte
        byte myCharacter2 = 'b'; //byte

        System.out.println('s' + "3456.56" + "rv");
        int personAge = 33;
        String personName = "Ala";
        System.out.println(personName + personAge + (1 - 34));


        System.out.println(Math.pow(10, 3));


    }


            static class Ewa {


        public static void main(String[] args) {

            char[] text = { 'e','w', 't', 'a', 'ł', ' ', 'a', 'z', ' ', 'o', 'ł', 'y',
                    'b', ' ', 'o', 'T' };

            System.out.print ("Stara tabela: ");

            int rozmiar = text.length;

            for ( int i = 0; i < rozmiar; i++)
                System.out. print (text[ i ]+" ");

            for (int i = 0; i < rozmiar/2; i++) {
            int n = rozmiar - i - 1;
               char ch = text[i];
                text[i] = text[n];
                text[n] = ch;
            }

            System.out. print ("\n\nTabela z odwróconymi znakami: ");
            for ( int i = 0; i < rozmiar; i++) {
                System.out. print (text[ i ]+" ");







        }

    }
}}








