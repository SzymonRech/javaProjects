package myPackage;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.HashMap;

public class Main {
}

/*4. Drukuj
Napisz program o nazwie Drukuj.java który wyświetli zdanie Wiedza to potęga!
        a. Na jednej linii
b. W trzech różnych liniach, gdzie każde słowo jest na osobnej linii
c. Wewnątrz prostokąta, który składa się ze znaków „=” oraz „|”
*/
class Drukuj {
    public static void main(String[] args) {


        System.out.println("Wiedza to potęga");
        System.out.println("Wiedza" + "\n" + "to" + "\n" + "potęga!");
        System.out.println("|===========|" + "\n" + '|' + "\t" + "Wiedza" + "\t" + '|' + "\n" + '|' + "\t" + "to" + "\t"
                + "\t" + '|' + "\n" + '|' + "\t" + "potęga!" + "\t" + '|' + "\n" + "|===========|");
    }
}

        /*5. Cytat
        Napisz program o nazwie Cytat.java który wczytuje jakiś tekst używając klasy Scanner,
        tak abyś Ty wpisał ten tekst dopiero po tym jak program się uruchomi.
        Potem program musi wziąć ten tekst, który wpisałeś i go wyświetlić między cytatami.
        Na przykład, gdy uruchomisz program to może to wyglądać mniej więcej tak:
        Napisz jakiś tekst: Chciałbym mieć tatuaż.
                Między cytatami: „Chciałbym mieć tatuaż.*/

class Cytat {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.print("Napisz jakiś tekst:");
        String hej = skan.nextLine();
        System.out.println("Między cytatami:" + "\"" + hej + "\"" + "\n" + "\n");
    }
}


/*  6. Sekundy
Napisz program o nazwie Sekundy.java który wczytuje trzy liczby całkowite (
reprezentujące godziny, minuty i sekundy) i potem konwertuje podany czas na sekundy. Np.
 1 godzina, 28 minut i 42 sekund to to samo, co 5322 sekund. Uruchomienie programu może wyglądać tak:
  Godziny: 1
  Minuty: 28
  Sekundy: 42
  Łączna liczba sekund: 5322
*/
class seknundy {
    public static void main(String[] args) {


        Scanner skan2 = new Scanner(System.in);
        System.out.println("Wpisz czas:" + "\n");
        System.out.println("Godziny:");
        int godziny = skan2.nextInt();
        System.out.println("minuty:");
        int minuty = skan2.nextInt();
        System.out.println("sekundy:");
        int sekundy = skan2.nextInt();
        System.out.println("Łączna suma sekund:");
        int wynik = godziny * 3600 + minuty * 60 + sekundy;
        System.out.println(wynik);
    }
}

        


        /*7. BMI
        Stwórz program BMI.java który będzie obliczał BMI (Body Mass Index) danej osoby.
        Program ma wczytać dane podane przez użytkownika (wzrost i wagę) i potem zaprezentować odpowiedź.
        BMI wylicza się tak, że dzieli się wagę przez wzrost podniesiony do kwadratu [waga/(wzrost^2)].
        Waga jest podawana w kilogramach a wzrost w metach. Program może wyglądać tak:
        Podaj swoją długość w metrach: 1,83
        Podaj swoją wagę w kilogramach: 83
        Twoje BMI to: 25
        Zakresy wartości BMI:

mniej niż 16 - wygłodzenie
16 - 16.99 - wychudzenie
17 - 18.49 - niedowaga
18.5 - 24.99 - wartość prawidłowa
25 - 29.99 - nadwaga
30 - 34.99 - I stopień otyłości
35 - 39.99 - II stopień otyłości
powyżej 40 - otyłość skrajna*/

class BMI {
    public static void main(String[] args) {


        Scanner skan3 = new Scanner(System.in);
        System.out.println("Podaj swoją długość w metrach:");
        double metry = skan3.nextDouble();
        System.out.println("Podaj swoją wagę w kilogramach:");//rozszerz program o przedziały BMI,
        double kilogramy = skan3.nextDouble();
        double BMI = (double) (kilogramy / (Math.pow(metry, 2)));
        HashMap przedziały = new HashMap();
        ArrayList waga = new ArrayList <Double>();
        DecimalFormat mojFormat = new DecimalFormat("0.##");
        String trzyDziesietne = mojFormat.format(BMI);
        System.out.println("Twoje BMI wynosi:");

        System.out.println(trzyDziesietne);
    }
}



        /*8. Czas
        Napisz program Czas.java który bierze liczbę sekund podaną przez użytkownika i wyświetla ten sam czas
        tylko że w formie godzin, minut i sekund. Program może wyglądać następująco:
        Podaj liczbę sekund: 9999
        To tyle samo co: 2 godziny, 46 minut i 39 sekund.*/

//Tego niestety nie zrobiłem:(
class Czas {
    public static void main(String[] args) {


        Scanner skan4 = new Scanner(System.in);

        System.out.print("Napisz ilosc sekund:");
        int sekundy = skan4.nextInt();

        int godziny = sekundy / 3600;

        sekundy = sekundy % 3600;

        int minuty = sekundy / 60;

        sekundy = sekundy % 60;

        System.out.print("To będą " + godziny + " godziny : " + minuty + " minut : " + sekundy + " sekund.");
    }
}


/* 9. Suma trzech cyfr
 Napisz program o nazwie SumaTrzy.java który zapyta się użytkownika o wprowadzenie
 jakiejkolwiek trzy cyfrowej liczby. Program ma potem policzyć sumę tych trzech cyfr. Na przykład:
 Podaj jakąś trzy cyfrową liczbę: 483
 Suma tych cyfr to: 15
 Jak widzisz program wziął cyfrę 483, i dodał ze sobą 4 + 8 + 3 i potem wyświetlił wynik, czyli 15.
 Napisz program, który potrafi to zrobić.
*/
class SumaTrzy {
    public static void main(String[] args) {


        Scanner trala = new Scanner(System.in);
        System.out.println("Podaj jakąś trzy cyfrową liczbę:");
        int liczba = trala.nextInt();
        int pierwszaCyfra = liczba / 100; // pokaże pierwszy indeks liczby (np. 543 wyciągnie 5)
        int drugaCyfra = ((liczba / 10) % 10); // pokaże drugi indeks liczby (np. 543 wyciągnie 4)
        int trzeciaCyfra = liczba % 10; // pokaże trzeci indeks liczby (np. 543 wyciągnie 3)
        System.out.println("Suma tych cyfr to:");
        System.out.println(pierwszaCyfra + drugaCyfra + trzeciaCyfra);
    }
}


        /*10.     Skonwertuj Fahrenheit na Celsjusz
                 W USA zamiast Celsjusza używa się innej skali, która nazywa się Fahrenheit.
                Stwórz program, który potrafi konwertować temperaturę w skali Fahrenheit na skalę Celsjusza.
                Formuła, która służy do tej konwersji wygląda następująco:
                Celsjusz = (Fahrenheit - 32) * 5 / 9
                Twój program o nazwie Konwertowac.java ma poprosić użytkownika o podanie temperatury w skali Fahrenheit.
                Potem program ma to przerobić na skalę Celsjusza.
                Następnie program ma wyświetlić wynik z jednym miejscem po przecinku.
*/

// Mój program zaokrągla bez żadnych miejsc po przecinku:(
class Konwertować {
    public static void main(String[] args) {


        Scanner kura = new Scanner(System.in);
        System.out.println("Podaj temperaturę w skali Fahrenheit:");
        double fahrenheit = kura.nextDouble();
        double celsjusz;
        System.out.println("Przelicz na stopnie Celsjusza:");
        System.out.println(celsjusz = (fahrenheit - 32) * 5 / 9);
        DecimalFormat lala = new DecimalFormat("0.#");
        String trzyDziesietne = lala.format(celsjusz);
        System.out.println("Stopnie Celsjusza po zaokrągleniu:" + " " + trzyDziesietne);
    }
}


/* 11. Krótkie Imię
 Stwórz program KrotkieImie.java który wczyta imię i nazwisko (tak więc są to dwa osobne ciągi znaków).
 Potem program ma wyświetlić tylko pierwszą literę z imienia, potem kropkę, potem spację i na samym końcu
 cztery pierwsze litery z nazwiska. Przykład:
 Imię: Anakin
 Nazwisko: Skywalker
 Krótkie imię: A. Skyw
 Uwaga: Co się stanie jeśli wpiszemy nazwisko, które jest krótsze niż 4 znaki? Jak to rozwiązać?
*/
class KrotkieImie {
    public static void main(String[] args) {

        String tnij2;
        Scanner name = new Scanner(System.in);
        System.out.println("Wpisz imię:");
        String imie = name.nextLine();
        System.out.println("Wpisz nazwisko:");
        String nazwisko = name.nextLine();
        String tnij = imie.substring(0, 1); // wycinamy pierwszą literę String imie
        //nazwisko = nazwisko + "    "; // jeśli nazwisko jest krotsze niz 4 litery, zastępuje spacją
        //String tnij2 = nazwisko.substring(0, 4); // wycinamy pierwsze 4 litery
        try {
            tnij2 = nazwisko.substring(0, 4);
        } catch (Exception wyjątek) {
            tnij2 = nazwisko.substring(0, 3);
        }
        System.out.println("Krótkie imię:");
        System.out.println(tnij + '.' + tnij2);
    }
}


        /*12. Numer telefonu
        Stwórz program NumerTelefonu.java który generuje i wyświetla losowy numer telefonu.
        Ten numer ma wyglądać wg. Takiego schematu: 0XXX – ZXXXXX.
         Tak więc na początku mamy numer kierunkowy, który zaczyna się od zera. Następnie mamy trzy wylosowane cyfry (X)
        Potem mamy drugą część numeru, jej początek nie może się zaczynać od zera (Z). Następnie mamy pięć jakichkolwiek
        wylosowanych cyfr (X). Aby to zrobić będziesz musiał użyć klasy Random.
*/

class NumerTelefonu {
    public static void main(String[] args) {


        Random areaCode = new Random();
        final int prefix = 0;
        int x = areaCode.nextInt(9);
        int x2 = areaCode.nextInt(9);
        int x3 = areaCode.nextInt(9);
        int x4 = areaCode.nextInt(9);
        if (x4 == 0) ++x4;
        int x5 = areaCode.nextInt(9);
        int x6 = areaCode.nextInt(9);
        int x7 = areaCode.nextInt(9);
        int x8 = areaCode.nextInt(9);

        //int y = 1 + areaCode.nextInt(9); // nie moze byc 0

        System.out.print("Losowy numer telefonu:" + " " + prefix + x + x2 + x3 + "-" + x4 + x5 + x6 + x7 + x8);
    }
}


        /*13. Odległość między dwiema koordynatami
        Napisz program Dystans.java który weźmie dwa koordynaty (x1, y1) i (x2, y2) oraz następnie obliczy
        odległość pomiędzy tymi dwiema punktami wg. Tej formuły:
        Dystans = Math.sqrt(x1 - x2)^2 + (y1 - y2)^2;
         Koordynaty muszą być podane przez użytkownika programu.
        Odpowiedź musi być zaprezentowana z trzema miejscami po przecinku. Użyj do tego klasy java.util.Math
*/

class Dystans {
    public static void main(String[] args) {


        Scanner abc = new Scanner(System.in);

        System.out.print("Napisz koordynat x1:");
        int x1 = abc.nextInt();

        System.out.print("Napisz koordynat y1:");
        int y1 = abc.nextInt();

        System.out.print("Napisz koordynat x2:");
        int x2 = abc.nextInt();

        System.out.print("Napisz koordynat y2:");
        int y2 = abc.nextInt();

        double dystans = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        // wyciągamy pierwiastek z 2 potęgi różnicy koordynant podanych w nawiasie

        DecimalFormat trzyMiejscaPoPrzecinku = new DecimalFormat("0.###");
        String rezultat = trzyMiejscaPoPrzecinku.format(dystans);

        System.out.println("Dystans pomiedzy tymi dwiema punktami to: " + rezultat);
    }
}


/* 14. Temperatura
 Kiedy wieje wiatr, to na pewno masz wrażenie, że temperatura jest niższa niż ta, która pokazuje termometr.
 Stwórz program Wiatr.java który użyje formuły Oszevskis’ego i Bluesteins’a aby obliczyć tą prawdziwą temperaturę,
 którą odczuwa człowiek. Formuła ta wygląda tak:
 Prawdziwa temperatura = 13.126667 + 0.6215 * T – 13.924748 * V*0.16 + 0.4875195 * T * V*0.16
 „V” oznacza szybkość wiatru, „T” oznacza temperaturę pokazywaną przez termometr. Program może wyglądać tak:
 Podaj temperaturę: -14
 Podaj szybkość wiatru: 16
 Prawdziwa temperatura: -28 stopni Celsjusza
*/
class Wiatr {
    public static void main(String[] args) {


        Scanner pogoda = new Scanner(System.in);
        System.out.println("Podaj temperaturę:");
        double temperatura = pogoda.nextDouble();
        System.out.println("Podaj prędkość wiatru:");
        double prędkośćWiatru = pogoda.nextDouble();
        double wynik = 13.126667 + 0.6215 * temperatura - 13.924748 * Math.pow(prędkośćWiatru, 0.16) + 0.4875195
                * temperatura * Math.pow(prędkośćWiatru, 0.16);
        DecimalFormat trzyMiejscaPoPrzecinku = new DecimalFormat("0.#");
        String rezultat = trzyMiejscaPoPrzecinku.format(wynik);
        System.out.println("Odczuwalna temperatura:" + rezultat);
    }
}





