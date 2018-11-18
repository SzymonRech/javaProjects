public class Tablice {

// Zadanie 1
//            1 1 1 1 1
//            1 0 0 0 1
//            1 0 0 0 1
//            1 0 0 0 1
//            1 1 1 1 1


    public static void main(String[] args) {


        int[][] board = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i >= 0 && j == 0) || (i >= 0 && j == 4) || (i == 4 && j >= 0) || (i == 0 && j <= 4)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}



class Tabela3 {

    public static void main(String[] args) {

        double[] data = {1.22, 2.34, 4.45, 5.63, 6.73};
        double suma = 0.0;

        for (int i = 0; i < data.length; i++) {
            suma = suma + data[i];
            /*pierwszy obrót pętli: suma = 0 + data = 1.22(indeks i 0)
             * drugi obrót pętli: suma= 1.22 + data= 2.34(indeks i = 1)
             * trzeci obrót pętli: suma = 3.56 + data = 4.45(indeks i = 2)*/
        }
        System.out.println("średnia: " + suma / data.length);

    }
}

class Tabela4 {

    public static void main(String[] args) {

        double[] data = {1.22, 2.34, 4.45, 5.63, 6.73};

		/*
		for ( int i = 0; i < data.length; i++) {// pierwsza metoda wyswietlenia elementów tabeli
			System.out.println(data[i]);
		}
		*/

        for (double a : data)
            System.out.print(a + " ");

        //System.out.println(data[0],data[1],data[2],data[3],data[4]); // 3 sposób niezalecany
    }
}