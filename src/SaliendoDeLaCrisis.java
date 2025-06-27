import java.util.Arrays;
import java.util.Scanner;

public class SaliendoDeLaCrisis {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numDatos = in.nextInt();
        in.nextLine();
        while (numDatos > 0) {
            int[] datos=new int[numDatos];
            for (int i =0; i<numDatos; i++) {
                datos[i] = in.nextInt();
            }
            in.nextLine();
            boolean mejora = true;
            for (int i = 1; i < numDatos && mejora; i++) {
                if (datos[i - 1] >= datos[i]) {



                    mejora = false;
                }
            }
            if (mejora) System.out.println("SI");
            else System.out.println("NO");
            numDatos = in.nextInt();
            in.nextLine();
        }

    }

}
