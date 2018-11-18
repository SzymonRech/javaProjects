package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ćwiczenia {
    public static void Borrow(String[] args) {
        System.out.println(Math.pow(2, 5));
        double sex = 69.69;
        double sextet = 69.69;
        float ex = 15;
        sex = sextet;


    }
}

class Hello {
    public static void main(String[] args) {

        double liczba1 = 5;
        double liczba2 = 9;
        System.out.println(liczba1 + liczba2);

        double liczba3, liczba4;
        liczba3 = 5.0;
        liczba3++;
        liczba4 = 3.3;
        System.out.println(liczba3);
        System.out.println(liczba4);

        if (liczba1 > liczba3 || liczba3 < liczba4)
            System.out.println(true);

        else if (liczba1 >= liczba3 || liczba2 > liczba4) ;
        System.out.println(true);


    }
}


class zadanie2 {

/*
        1 0 1 0 1
        0 1 0 1 0
        1 0 1 0 1
        0 1 0 1 0
        1 0 1 0 1*/


    public static void main(String[] args) {


        int x = 5;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else if (j % 2 != 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println("");
        }

    }
}


// Zadanie 1
//            1 1 1 1 1
//            1 0 0 0 1
//            1 0 0 0 1
//            1 0 0 0 1
//            1 1 1 1 1
class zadanie1 {

    public static void main(String[] args) {
        int x = 5;


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == x - 1 || j == x - 1 || i == 0 || j == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("");
        }
    }
}

class zadanie3 {

    public static void main(String[] args) {

        int x = 5;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
            }

            System.out.println("");
        }

    }

}

/*
1.10 Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej.
        Następnie stwórz kilka warunków z różnymi imionami. Jeśli któreś z imion będzie pasowało wyświetl
        "Cześć jakieś_imię", gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".*/

/*class elek {
    public static void main(String[] args) {
        Scanner imie = new Scanner(System.in);
        String[] tab = new String[]{
        tab[0] ="Agnieszka",
        tab[1] ="Szymon",
        tab[2] ="Hanna",};
        System.out.println("Wpisz jakieś imię:");
       String wacław = imie.nextLine();
       for(int i = 0; i< tab;)
        if (wacław == tab.length){
            System.out.println("Cześć");
        }
        else {
            System.out.println("Przykro mi, ale Cię nie znam");
        }
    }
}*/

class zabawaTabelami {
    public static void main(String[] args) {
        int [] tabelka = {1,2,6,9,12};
        int [][] tabelkaDwuwymiarowa = new int[5][5];
        ArrayList mojaLista = new ArrayList<String>();
        System.out.println("Stare tabele:" + tabelka.length +"\t" + tabelkaDwuwymiarowa.length + "\t" + mojaLista.size());
        StringBuilder odyn = new StringBuilder(String.valueOf(tabelkaDwuwymiarowa));
        String hera = odyn.toString();
        System.out.println();
        odyn.append("1,2,4,5,6,7");





    }
}


class mnożymyHej {
    public static void main(String[] args) {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wpisz cyfre:");
        int kał = cyfra.nextInt();
        System.out.println("Tabliczka mnożenia:");
        for (int i = 1; i<=kał; i++){
            for (int j =1;j<=kał; j++) {
                System.out.println("\t" + (i * j));
            }
            System.out.println();
        }

        cyfra.close();
    }
}