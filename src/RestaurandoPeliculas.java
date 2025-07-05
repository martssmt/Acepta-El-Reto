import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RestaurandoPeliculas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int fotogramas = in.nextInt();
        int copias = in.nextInt();
        in.nextLine();

        while (fotogramas != 0) {

            int fotogramasRecuperados = 0;
            ArrayList<int[]> intervalos = new ArrayList<>();

            for (int i = 0; i < copias; i++) {

                String cachos = in.nextLine();
                String[] partes = cachos.split(" ");
                int numPartes = Integer.parseInt(partes[0]);

                for (int j = 1; j <= numPartes; j++) {

                    String[] intervalo = partes[j].split(",");
                    int ini = Integer.parseInt(intervalo[0]);
                    int fin = Integer.parseInt(intervalo[1]);
                    intervalos.add(new int[]{ini, fin});

                }

            }

            Collections.sort(intervalos, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[0], b[0]);
                }
            });

            int currentEnd = 0;
            boolean cubreTodo = false;

            for (int[] intervalo : intervalos) {
                if (intervalo[0] > currentEnd + 1) {
                    // Hay un hueco entre currentEnd y el siguiente inicio
                    break;
                }

                currentEnd = Math.max(currentEnd, intervalo[1]);

                if (currentEnd >= fotogramas) {
                    cubreTodo = true;
                    break;
                }
            }

            System.out.println(cubreTodo ? "SI" : "NO");

            fotogramas = in.nextInt();
            copias = in.nextInt();
            in.nextLine();

        }

        in.close();

    }

}
