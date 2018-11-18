package ZłoteKursy;
import java.util.Scanner;
public class OperatorSwitch {


    public static void main (String[] args) {

        Scanner skanuj = new Scanner(System.in);

        System.out.println("Wpisz numer ksi��ki kt�r� chcesz wypo�yczy�: ");

        int numerKsiazki = skanuj.nextInt();

        String ksiazka;
        switch (numerKsiazki) {
            case 1:
                ksiazka = "W�adca Pier�cieni";
                break;
            case 2:
                ksiazka = "Jak schudn�� w 2 tygodnie";
                break;
            default:
                ksiazka = "Nic nie wypo�yczy�e�";
                break;
        }

        System.out.println("Wypo�yczy�e�: " + ksiazka);

        skanuj.close();

    }
}
