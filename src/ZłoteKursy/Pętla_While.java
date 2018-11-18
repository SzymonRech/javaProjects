package ZłoteKursy;

    import java.util.Scanner;

    class Petla_While {

        public static void main (String[] args) {

            Scanner skanuj = new Scanner(System.in);

            int suma = 0;
            int licznik = 0;
            // pętle nie policzalne używamy wtedy gdy nie wiemy ile razy nasz nasz program ma się uruchomić
            do { // uruchomi się przynajmniej raz nawet jeśli warunek pętli nie jest spełniony
                System.out.print("Wpisz jak�� cyfr� (zero aby przesta�): ");
                licznik = skanuj.nextInt();
                suma = suma + licznik;
            } while (licznik != 0);// uruchomi się tylko wtedy jeśli warunek pętli jest spełniony

            System.out.println("��czna suma: " + suma);


            skanuj.close();
        }

    }

