package myPackage;

public class Definicje {

    public static void main(String[] args) {

        // typy całkowite zmiennych

        byte w = 127; // byte - liczba składa się z 8 bitów -128 do 127
        short y = 129; // od -32 tys do 32 tys 16 bit
        int imie = 53; // intiger - liczba całkowita zajmuje 4 bajty (32 bity)
        long r = 439439029443434L; // - 2^63 do 2^63 64 bity

        // znakowe zmienne

        char urre = 1; // charakter - jej wartość może być tylko jednoznakowa
        String pala; //- ciąg znaków

        // typy zmiennoprzecinkowe zmiennych

        float eelel;  //- 32 bity
        double ekdk; //- 64 bity



    /*
          OPERATORY - to znaki służące do operowania na zmiennych

           OPERATORY ARYTMETYCZNE
               +   dodawanie liczb oraz łączenie string'ów
               -   odejmowanie
               *   mnożenie
               /   dzielenie

               =   przypisanie wartości
               +=
               -=
               /=
               *=
               %=

               %   reszta z dzielenia (dzielenie modulo)
               5%2 = 1
               10%6 =4
               5689%100 = 89


               ++   inkrementacja - powiększ o 1
               --   dekrementacja - zmniejsz o 1

               y++ - POST INKREMENTACJA // najpierw wypisz dana wartość potem powiększ przy kolejnym jej użyciu
               y-- - POST dekrementacja

               ++y - PRE INKREMENTACJA // najpierw powiększ o 1 potem wypisz
               --y - PRE dekrementacja

         */

    /*
            OPERATOR RELACYJNY (PORÓWNANIA)

            == - porównanie
            != - porównanie czy są różne od siebie
            > - większe od
            < - mniejsze od
            >= - większe bądź równe
            <= - mniejsze bądź rowne
        */



    /*
            Operatory Logiczne

            true false

            ! - negacji

            !(true) - false
            !(false) - true

            && - koniunkcja - "I" - W TYM SAMYM MOMENCIE

            true true - true
            true false - false
            false true - false
            false false - false

            KONIUNKCJA JEST PRAWDZIWA WTEDY I TYLKO WTEDY GDY OBA WYRAZENIA SA PRAWDZIWE

            || - alternatywa - "lub" - to lub też to

            true true - true
            true false - true
            false true - true
            false false - false

            ALTERNATYWA JEST FAŁSZYWA TYLKO GDY  OBA WYRAZENIA SA FALSZYWE

        */

        int a = 5,
                b = 5,
                c = 7;

        if (a != b || c > 12)
            System.out.println("tak");


        /*
          true false
          INSTRUKCJE WARUNKOWE

            if (WYRAŻENIE)
                instrukcja;
            else
                instrukcja;
        */
        int rt = 2,
                tr = 5;

        if (rt > tr)
            System.out.println("rt > tr");// jeśli prawdziwa wykonaj instrukcje
        else if (rt < b) // w innym wypadku wykonaj daną instrukcje jeśli ten pierwszy warunek nie został spełniony
        {
            System.out.println("rt < tr");
            System.out.println("tak to działa");
        } else // Gdy nie zostały spełnione powyższe instrukcje
        {
            System.out.println("rt == tr");
            System.out.println("lala");
        }



        /* TABLICE !!!!!!
        Int[] tab
            -----------------------------------
             tab[0] tab[1] tab[2] tab[3] tab[4] // Jednowymiarowa tablica i jej elementy

            ----------------------------------

        */

        int[] tab = new int[5];

        // tab = new int[5];

        tab[0] = 20;
        tab[1] = 7;
        tab[2] = 27;
        tab[3] = 15;
        tab[4] = 77;

        System.out.println(tab[0]);

        int[] tab2 = {4, 14, 4, 412, 1254, 512};// [] w klamre możemy wpisać dowolną liczbę i zmienić jej wartość w kolumnie
         tab2 [3] = 45;// 3 indeks czyli 412 zamienimy na 45 (-> kolumna) (w dół wiersz)
        System.out.println(tab2[tab2.length - 1]);// odwołanie się do ostatniego elementu w tablicy
        // System.out.println(tab[tab.length]);// oblicza wielkość tablicy (składową tzn z ilu elementów się składa


        /* Wielowymiarowa tablica

            ------------------------------------
               [0][0]   |  [0][1] |   [0][2]   |
            ------------------------------------
            ------------------------------------
               [1][0]   |  [1][1] |   [1][2]   |
            ------------------------------------
            ------------------------------------
               [2][0]   |  [2][1] |   [2][2]   |
            ------------------------------------
            ------------------------------------
               [3][0]   |  [3][1] |   [3][2]   |
            ------------------------------------


        */

        int[][] tablica = new int[4][3];// wiersze 4 , 3 kolumny

        tablica[0][0] = 25;
        tablica[3][2] = 70;

        System.out.println(tablica[3][2]);

        int[][] tablica2 =
                {
                        {4, 15, 17},
                        {5, 12, 125},
                        {651, 1256, -24},
                        {6555, 2, -2444}
                };
        // Tablice indeksujemy od wierszy potem kolumny
        System.out.println(tablica2[3][0]);// wynik to 6555
        System.out.println(tablica2[2][1]);// 1256
        System.out.println(tablica2[3][2]);// - 2444

        String[] kursyProgramowania =
                {
                        "Java",
                        "Java Aplikacje",
                        "Java Strumienie",
                        "Java Aspekty Zaawansowane",
                        "Java Android",
                        "C#",
                        "C# Tworzenie Aplikacji",
                        "C# LINQ",
                        "Pascal"
                };
        int i = 0;
        while (i < kursyProgramowania.length) {
            System.out.println(kursyProgramowania[i]);

            i++;
        }
      /*
        i = 1;
        do
        {
           System.out.println(kursyProgramowania[i]);

            i++;
       }while(i < kursyProgramowania.length);
              */




    }
}

