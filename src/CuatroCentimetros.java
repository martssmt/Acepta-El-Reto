import java.util.Scanner;

public class CuatroCentimetros {

    public static void main(String[] args) {

        int cmAnio = 4;
        Scanner in = new Scanner(System.in);
        int veces = in.nextInt();
        in.nextLine();
        for (int i = 0; i < veces; i++) {
            int anios = in.nextInt();
            in.nextLine();
            System.out.println(anios * cmAnio);
        }

    }

}
