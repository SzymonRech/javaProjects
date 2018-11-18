package ZłoteKursy;

import java.util.Scanner;

public class Pętla_W_Pętli {

        public static void main (String[] args) {

            Scanner skanuj = new Scanner (System.in);

            System.out.println("Wpisz cyfrę: ");
            int n = skanuj.nextInt();

            System.out.println("***** Tabliczka Mnożenia *****");
            for (int i = 1; i <= n; i++){//najpierw wykonuje sie jeden obrót pętli
                for (int j = 1; j <= n; j++) {/* potem wykonuja sie obroty petli w środku do czasu aż warunek
                nie zostanie złamany*/
                    System.out.print("\t" + (i * j));
                }
                System.out.println();
            }

            skanuj.close();
        }


    }






