import java.util.Scanner;

public class BombonesDeAdviento {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            long primero = in.nextLong();
            if (primero == 0) break;  // fin total

            long anterior = primero;
            long maxSuma = -1;
            boolean primerPar = true;

            while (true) {
                long actual = in.nextLong();
                if (actual == 0) break; // fin del caso

                long suma = anterior + actual;
                if (primerPar || suma > maxSuma) {
                    maxSuma = suma;
                    primerPar = false;
                }
                anterior = actual;
            }

            // Si solo había un día, maxSuma sigue -1, entonces lo imprimimos
            if (primerPar) {
                System.out.println(primero);
            } else {
                System.out.println(maxSuma);
            }
        }

        in.close();
    }
}
