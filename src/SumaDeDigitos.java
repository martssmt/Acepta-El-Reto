import java.util.Scanner;

public class SumaDeDigitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        while (num > 0) {
            char[] digitos = Integer.toString(num).toCharArray();
            int suma = 0;
            int numDigitos = digitos.length;
            for (int i = 0; i < numDigitos; i++) {
                suma += Integer.parseInt(String.valueOf(digitos[i]));
                if (i != numDigitos - 1) {
                    System.out.print(digitos[i] + " + ");
                } else {
                    System.out.println(digitos[i] + " = " + suma);
                }
            }
            num = sc.nextInt();
            sc.nextLine();
        }
    }

}
