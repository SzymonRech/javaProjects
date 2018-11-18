package ZłoteKursy;

import java.util.Scanner;

public class OperatorySterujące {
    public static void main(String[] args) {

        int a = 15;

        int b = 10;

        if (a < b) {// logiczne zapytanie co ma program zrobic gdy to wyrażenie będzie true
            System.out.println("B jest wi�ksze");
        } else {// co ma zrobić gdy wyrażenie powyższe jest fałszem
            System.out.println("A jest wi�ksze");
        }

    }
}


class FunkcjaIf2 {

    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        int zaliczone = 50;

        System.out.println("Wpisz ile punkt�w otrzyma� student: ");
        int rezultat = skanuj.nextInt(); // można wpisać cyfre i ta cyfra zostanie przypisana do zmiennej rezultat

        if (rezultat > zaliczone) {
            System.out.println("Student zaliczy� test.");
        } else {
            System.out.println("Student nie zaliczy� testu.");
        }

        skanuj.close();
    }
}

class FunkcjaIf3 {

    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);

        int min = 0;
        int max = 100;
        int trojka = 50;
        int czworka = 75;
        int piatka = 90;

        System.out.println("Wpisz ile punkt�w otrzyma� student: ");
        int rezultat = skanuj.nextInt();

        if (rezultat >= min && rezultat < trojka) {
            System.out.println("Ocena: 2");
        } else if (rezultat >= trojka && rezultat < czworka) {
            System.out.println("Ocena: 3");
        } else if (rezultat >= czworka && rezultat < piatka) {
            System.out.println("Ocena: 4");
        } else if (rezultat >= piatka && rezultat < max) {
            System.out.println("Ocena: 5");
            System.out.println("Ten student jest najlepszy.");
        } else {
            System.out.println("Wpisa�e� nieprawid�ow� liczb�.");
        }

        skanuj.close();
    }

}















