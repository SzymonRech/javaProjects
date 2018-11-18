package zadania;


public class Exercises {

    public static void main(String[] args) {

        int tablica[] = new int[10];
        int dupa = 0;
        int liczbastartowa = 10;
        System.out.println(tablica.length);
        do {
            tablica[dupa] = liczbastartowa;
            liczbastartowa = liczbastartowa + 10;
            ++dupa;
        }

        while (dupa < tablica.length);
        dupa = 0;

        do {
            System.out.println(tablica[dupa]);
            ++dupa;
        } while (dupa < tablica.length);

    }

}


class Drukuj {

    public static void main(String[] args) {


        int Wiedza, to, potęga;
        System.out.println("Konrad" + "Ty" + "Pało"); // łaczy ze sobą wyrażenia
        System.out.println("Wiedza, to potęga");// drukuje tak jak jest napisane
        System.out.println("Wiedza\t , to\t potęga\t");// dodaje tabulatory
        System.out.println("Wiedza\n , to\n potęga\n");// wyświetla od nowej linii
        System.out.println("|===========|\n|\tWiedza\t|\n|\tto\t\t|\n|\tpotęga\t|\n|===========|");// narysuje kwadrat
        System.out.println("\'Chciałbym być marynarzem\'");// wyswietla tekst w apostrofie
        System.out.println("\"Chciałbym być marynarzem\""); // wyswietla tekst w cudzysłowie


        int[][] tablica =

                {
                        {34, 12, 678},
                        {54, 9, 23},
                        {65, 89, 890},
                        {-789, 4832, 55}};
        System.out.println(tablica[2][0]);
        System.out.println(tablica[3][1]);

     /*   1. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości.
                Następnie wypisz wartość największej z nich.
    2. Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie (wypisz na ekranie odpowiedni komunikat).
                Użyj google, aby znaleźć sposób na sprawdzenie parzystości wartości.
        3. Sprawdź, czy wartość zmiennej jest większa, mniejsza, czy równa zero (użyj google żeby znaleźć odpowiedź,
        jak obsłużyć więcej niż dwa przypadki w instrukcji warunkowej). 4. Rozwiąż zadanie 1. dla czterech zmiennych.*/





    }
}





