package myPackage.MarcinLewandowskiCode;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar tabliczki mnożenia");
        int size = scanner.nextInt();

        int[][] board = new int[size][size];

        // wypełnianie przeliczonymi liczbami
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                board[i][j] = (i + 1) * (j + 1);
                System.out.println();// jeśli wpiszemy tablice board[i][j] utrworzyloby ciągiem w dół tabliczke mnożenia
            }
        }
        // jeśli reszte byśmy wycieli utrworzyloby ciągiem w dół tabliczke mnożenia
        // policz największą możliwą wartość w tabeli
        int maxValue = size * size;
        // sprawdź jaką długość (w znakach) ma największa liczba w tabelce
        int maxValueLength = (int) Math.log10(maxValue);

        // drukowanie
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // sprawdź jaką długość (w znakach) ma aktualnie drukowana liczba
                int currentValueLength = (int) Math.log10(board[i][j]);

                for(int k = 0; k < maxValueLength - currentValueLength; k++) {
                    System.out.print(" "); // spacja do wyrównania w kolumnach
                }
                System.out.print(board[i][j]); // wydrukuj liczbę
                System.out.print(" "); // separator kolumn
            }
            System.out.println(); // nowy wiersz
        }
    }
}




class test {
    public static void main(String[] args) {

        int x = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.println("| i=" + i + " j=" + j);

        }
        System.out.println();

    }


}




