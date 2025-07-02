import java.util.Scanner;

public class AhorroInfantil {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {

            int numOperaciones = in.nextInt();
            if (numOperaciones == 0) break;

            int max = 0;
            int balance = 0;

            for (int i = 0; i < numOperaciones; i++) {
                int movimiento = in.nextInt();
                balance += movimiento;
                if (balance > max) {
                    max = balance;
                }
            }

            System.out.println(balance + " " + max);

        }

        in.close();

    }

}
