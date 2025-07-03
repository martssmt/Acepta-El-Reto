import java.math.BigInteger;
import java.util.Scanner;

public class CompensandoLosExcesos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int jugadas = Integer.parseInt(in.nextLine());

        for (int i = 0; i < jugadas; i++) {

            String[] partes = in.nextLine().trim().split("\\s+");
            int vueltasBernabe = Integer.parseInt(partes[0]);
            int vueltasBelen = Integer.parseInt(partes[1]);

            BigInteger mcd = BigInteger.valueOf(vueltasBelen).gcd(BigInteger.valueOf(vueltasBernabe));
            int result = (vueltasBelen + vueltasBernabe) / mcd.intValue() - 1;

            System.out.println(result);

        }

        in.close();

    }

}
