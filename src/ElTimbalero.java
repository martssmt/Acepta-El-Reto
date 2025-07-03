import java.util.Scanner;

public class ElTimbalero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            
            int n = sc.nextInt();
            if (n == 0) break;

            int[] inicio = new int[n];
            int[] fin = new int[n];

            // Leer los pasajes (pares de inicio y fin)
            for (int i = 0; i < n; i++) {
                inicio[i] = sc.nextInt();
                fin[i] = sc.nextInt();
            }

            int contador = 0;
            while (true) {
                int compas = sc.nextInt();
                if (compas == 0) break;

                // Busca si compas está dentro de algún pasaje
                if (!estaDentroPasaje(inicio, fin, compas)) {
                    contador++;
                }
            }

            System.out.println(contador);
        }

        sc.close();
    }

    // Búsqueda binaria para saber si compás está dentro de algún pasaje
    private static boolean estaDentroPasaje(int[] inicio, int[] fin, int compas) {
        int left = 0, right = inicio.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (compas < inicio[mid]) {
                right = mid - 1;
            } else if (compas > fin[mid]) {
                left = mid + 1;
            } else {
                // compas está entre inicio[mid] y fin[mid]
                return true;
            }
        }
        return false; // No pertenece a ningún pasaje
    }
}
