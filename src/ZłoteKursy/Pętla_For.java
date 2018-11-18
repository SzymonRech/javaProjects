package ZłoteKursy;

public class Pętla_For {



        public static void main (String[] args) {

            int suma = 0;

            for (int i = 10; i > 0; i = i - 2){// zmienna i żyje tylko wenątrz pętli nie można jej zainicjować po za nią
                suma = suma + i;
            }


            System.out.println(suma);

        }
    }




