import java.util.Arrays;
import java.util.Scanner;

public class ConstanteDeKaprekar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int veces = in.nextInt();
        if (veces<=0) return;
        for (int j = 0; j < veces; j++) {
            int n = in.nextInt();

            if (n > 9999 || n < 0) continue;

            if (n == 6174) {
                System.out.println(0);
                continue;
            }

            String num = String.format("%04d", n);
            char[] dig = num.toCharArray();

            if (iguales(dig)) {
                System.out.println(8);
            } else {
                int resp = 0;
                while (n != 6174) {
                    num = String.format("%04d", n);
                    dig = num.toCharArray();
                    Arrays.sort(dig);
                    String asc = new String(dig);
                    String desc = new StringBuilder(asc).reverse().toString();
                    int numAsc = Integer.parseInt(asc);
                    int numDesc = Integer.parseInt(desc);
                    n = numDesc - numAsc;
                    resp++;
                }
                System.out.println(resp);
            }

        }
    }

    public static boolean iguales(char[] arr) {
        char primerChar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != primerChar) {
                return false; // Si encontramos un elemento diferente, retornamos false
            }
        }
        return true;
    }
}
