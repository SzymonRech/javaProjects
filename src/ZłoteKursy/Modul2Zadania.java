package ZłoteKursy;

import myPackage.Char;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.SQLOutput;

public class Modul2Zadania {

}

/* Zadanie 1
Napisz program PoliczA.java który wczyta tekst napisany przez użytkownika i następnie policzy ile jest małych „a”
oraz dużych „A” w tekście. Uruchomienie programu może wyglądać następująco:
Wpisz jakiś tekst: Anna nie lubi pływać.
Ilość a: 2
Ilość A: 1*/
class LiczA {
    public static void main(String[] args) {
        Scanner liczydło = new Scanner(System.in);
        System.out.println("Wpisz jakiś tekst:");
        String tekst = liczydło.nextLine();
        char duzy = 'A';
        char mały = 'a';
        int liczęMałe = 0;
        int liczęDuże = 0;
        for (int i = 0; i < tekst.length(); i++) {
            char litera = tekst.charAt(i);

            if (litera == duzy) {
                liczęDuże++;

            }
            if (litera == mały) {
                liczęMałe++;

            }
        } // dopracuj program o liczenie samogłosek i spółgłosek

        System.out.println("Ilość A:" + " " + liczęDuże);
        System.out.println("Ilość a:" + " " + liczęMałe);

    }
}


/*   Zadanie 2
Stwórz program NajwiekszeK.java który dla jakiejś pozytywnej liczby całkowitej N
  (która będzie wpisana przez użytkownika) obliczy największą wartość cyfry K. Przykład:
Wpisz pozytywną liczbę całkowitą: 25
Największe K to: 8
W tym przykładzie program wykonał coś takiego:
  0 + 2 + 4 + 6 + 8 = 20
Program zatrzymał się przy 8 ponieważ gdyby dodał 10 to suma tych cyfr byłaby 30.
A 30 jest większe ni 25 (czyli cyfra którą podał użytkownik).
Dlatego też naszym K, którego szukamy jest 8. Napisz program który potrafi taką operację zrobić.
*/
class NajwiekszeK {
    public static void main(String[] args) {
        Scanner przelicznik = new Scanner(System.in);
        System.out.println("Wypisz pozytywną liczbę całkowitą:");
        int faja = przelicznik.nextInt();
    }

}
/* Zadanie 3
        Napisz program OdTylu.java który weźmie jakiś tekst podany przez użytkownika i go wyświetli od tyłu.
        Może to wyglądać o tak:
        Wpisz jakiś tekst: Anakin Skywalker
        Od tyłu: reklawykS nikanA*/
class OdTyłu {
    public static void main(String[] args) {
        Scanner tyłek = new Scanner(System.in);
        System.out.println("\"Wpisz jakiś tekst:\"");
        String text = tyłek.nextLine();
        StringBuilder reverseText = new StringBuilder();
        for (int i = 1; i <= text.length(); i++) {
            char dupa = text.charAt(text.length() - i);// wyciągamy długość tekstu, zaczynając od ostatniego indeksu
            reverseText.append(dupa);// do StrinBuildera dodajemy char "dupa"
        }
        System.out.println();
        System.out.println("Od tyłu:");
        String toPrint = reverseText.toString();// żeby wydrukować StringBuildera konwertujemy go na string
        System.out.println(toPrint);// drukowanie

    }
}



/* Zadanie 4
    Napisz program WysokoNisko.java który stworzy grę – zgadywankę High and Low.
    Komputer ma wylosować jakąś cyfrę między 1 a 100. Następnie użytkownik ma zgadnąć co komputer wylosował.
    Po każdej próbie zgadnięcia ma się pokazywać wskazówka „wyżej” lub „niżej”. Może to wyglądać następująco:
    Próba 1: 67
    Wskazówka: wyżej
    Próba 2: 82
    Wskazówka: niżej
    Próba 3: 77
    Prawidłowa odpowiedź
    Program ma zakończyć grę, gdy użytkownik wykona 10 nieudanych prób wraz z informacją,
    że użytkownikowi nie udało się zgadnąć, jaka to cyfra. */

class WysokoNisko {
    public static void main(String[] args) {
        Scanner los = new Scanner(System.in);
        Random zigzag = new Random();
        int elo = zigzag.nextInt(99);
        System.out.println();
        System.out.println("Wypisz cyfre między 1 a 100:");
        int zgaduje = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Próba" + " " + i + ':');
            zgaduje = los.nextInt();

            if (elo > zgaduje) {
                System.out.println("Wskazówka: wyżej");
            } else if (elo < zgaduje) {
                System.out.println("Wskazówka: niżej");
            } else if (zgaduje == elo) {
                System.out.println("Prawidłowa odpowiedź!!!");
                break;
            }

            if (i == 10) {
                System.out.println("Prawdiłowa liczba to:" + elo);
            }
        }


    }
}


/*  Zadanie 5
Stwórz program Trojkat.java który weźmie podaną przez użytkownika nieparzystą liczbę całkowitą i na podstawie
tej cyfry zbuduje dwa trójkąty. Np.
Wpisz jakąś nieparzystą liczbę całkowitą: 7
Trójkąt prostokątny:
 *
 **
 ***
 ****
 *****
 ******
 *******
Trójkąt równoramienny: * *** ***** *******
Zauważ że ta wartość którą wpisuje użytkownik decyduje jak duża ma być „baza” trójkąta.
Gdyby użytkownik wpisał pozytywną cyfrę to program ma pokazać wiadomość że została wprowadzona niepoprawna wartość.
*/
class Trojkat {
    public static void main(String[] args) {
        Scanner kącik = new Scanner(System.in);
        System.out.println("Podaj nieparzystą liczbę całkowitą:");
        int baza = kącik.nextInt();
        if (baza % 2 == 0) {
            System.out.println("Została wprowadzona niepoprawna wartość!!!");
            System.exit(0);
        }
        System.out.println(" ");
        System.out.println("trójkąt prostokątny:");
        String gwiazdka = "*";
        for (int i = 1; i <= baza; i++) {
            System.out.println(gwiazdka);
            gwiazdka = gwiazdka + "*";
        }

        System.out.println();
        System.out.println("Trójkąt równoramienny:");
        StringBuilder x = new StringBuilder(baza);
        for (int i = 1; i <= baza; i++) { // Tworzymy pusty string o dlugosci baza
            x.append(" ");
        }
        int srodkowy_indeks = baza / 2;
        x.setCharAt(srodkowy_indeks, '*'); // Ustaw znak * na srodku czyli index baza/2
        for (int i = 0; i <= baza / 2; i++) {
            x.setCharAt(srodkowy_indeks + i, '*'); // ustawiam * na pozycje o i w prawo od srodka
            x.setCharAt(srodkowy_indeks - i, '*'); // ustawiam * na pozycje o i w lewo od srodka
            String to_print = x.toString();
            System.out.println(to_print);
        }

        System.out.println();
        System.out.println("Figura X:");
        StringBuilder y = new StringBuilder(baza);
        for (int i = 1; i <= baza; i++) { // Tworzymy pusty string o dlugosci baza
            y.append(" ");
        }
        // wstawiam znak x na początek i koniec stringa
        y.setCharAt(0, 'x');
        y.setCharAt(baza - 1, 'x');
        // printuje
        String to_print = y.toString();
        System.out.println(to_print);

        for (int i = 1; i < baza; i++) {
            int poprzedni_lewy_indeks = i - 1;
            int poprzedni_prawy_indeks = baza - i;
            y.setCharAt(poprzedni_lewy_indeks, ' '); // ustwiam pusty znak na pozycji na ktorej ostatnio ustawialem x
            y.setCharAt(poprzedni_prawy_indeks, ' '); // ustwiam pusty znak na pozycji na ktorej ostatnio ustawialem x
            y.setCharAt(i, 'x'); // ustawiam x na nowej pozycji
            y.setCharAt(baza - i - 1, 'x'); // ustawiam x na nowej pozycji
            String to_print2 = y.toString();
            System.out.println(to_print2);
        }
    }
}



/* Zadanie 6
    Stwórz program PrawieNajwiekszy.java który weźmie (podane przez użytkownika) 10 cyfr i wybierze z nich tą prawie
    największą cyfrę. Przykład poniżej:
    Wpisz 10 cyfr:
            67
            -468
            36
            1345
            –7778
            0
            34
            7654
            45
            -666
    Prawie największa cyfra to: 1345
    Program musi być tak napisany aby łatwo dało się zmienić ilość możliwych cyfr do wpisania.
            Uwaga: Nie możesz używać tabel.*/

// pomysł scaner + array lista+ metoda (maxValue -1)

class PrawieNajwiekszy {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Wpisz 10 cyfr:");
        int cyfra = skan.nextInt();
        StringBuilder t = new StringBuilder(cyfra);

        System.out.println("Prawie największa cyfra to:");
    }
}




          /*   Zadanie 7
    Stwórz program PoliczCyfry.java który weźmie pozytywną liczbę całkowitą (wpisaną przez użytkownika)
    i wypisze ile ta cyfra zawiera zer, ile nieparzystych cyfr i ile parzystych cyfr. Na przykład:
    Wpisz jakąś dużą liczbę: 678900
    Zera: 2
    Parzyste: 3 // *2
    Nieparzyste: 2* // % 2*/

class PoliczCyfry {
    public static void main(String[] args) {
        Scanner skanPozytywna = new Scanner(System.in);
        System.out.println("Wpisz jakąś duża całkowitą liczbę:");
        int policzTO = skanPozytywna.nextInt();
        int parzysta = 0;
        int nieparzysta = 0;
        int zero = 0;
        for (int i =0; i<policzTO; i++ ) {
            if (policzTO == zero) {
                zero++;
            }
        }
        System.out.println("Zera:" + zero );
    }
}



/*  Zadanie 8
Napisz program o nazwie ZamienMiejsca.java który:
o Najpierw wyświetli, jakie wartości przechowuje tabela
o Następnie program ma wykonać taką operację, aby ostatni element zamienił się miejscami z tym pierwszym elementem,
ten przed ostatni z tym drugim elementem, itp.
o Na koniec program ma wyświetlić zawartość tej nowej odwróconej tabeli
Weź ten kawałek kodu i go rozbuduj: public class ZamienMiejsca { public static void main(String[] args)
{ char[] text = { 'e','w', 't', 'a', 'ł', ' ', 'a', 'z', ' ', 'o', 'ł', 'y', 'b', ' ', 'o', 'T' }; */

//pomysł string builder + metoda .reverse

class ZamienMiejsca {
    public static void main(String[] args) {
        {
            char[] text = {'e', 'w', 't', 'a', 'ł', ' ', 'a', 'z', ' ', 'o', 'ł', 'y', 'b', ' ', 'o', 'T'};
            int rozmiar = text.length;
            System.out.println("Stara tabela:");
            for (int i = 0; i < text.length; i++) {
                System.out.println(text + " ");
            }


        }
    }
}

/* Zadanie 9
        Napisz program OdwroconaKolejnosc.java który będzie zapisywał do tabeli wpisane przez użytkownika pozytywne
        liczby całkowite. Wpisywanie tych cyfr ma trwać aż użytkownik wpisze negatywną liczbę.
        Następnie program ma wyświetlić te cyfry, które były wpisane przez użytkownika tylko że od tyłu. Przykład:
        Wpisuj pozytywne liczby całkowite. Aby zakończyć wpisz negatywną cyfrę.
            Cyfra 1: 5
            Cyfra 2: 10
            Cyfra 3: 15
            Cyfra 4: 20
            Cyfra 5: -7
            Ilość pozytywnych cyfr: 4
            Od tyłu: 20, 15, 10, 5
        Pamiętaj: Program na początku nie może się pytać użytkownika ile cyfr chce wpisać.*/

/* Zadanie 10
        Stwórz program RzutKostka.java który będzie symulował 6000 rzutów kostką.
        Program ma pamiętać ile razy wyrzucono jedynkę, dwójkę, trójkę, itp. Stwórz tabelę, która będzie zapisywać
        ile razy została wylosowana jedynka, dwójka, i tak dalej. Przykład poniżej:
        Wynik po tym jak rzuciliśmy kostką 6000 razy: 1: 1025 2: 996 3: 980 4: 1006 5: 1035 6: 958*/
