import java.util.Scanner;

public class CuandoVolvera {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String linea = in.nextLine();
        String[] datos = linea.split(" ");
        int anio = Integer.parseInt(datos[0]);
        int vez = Integer.parseInt(datos[1]);
        while (anio != 0 || vez != 0) {
            int prediccionMenor = anio + vez * 74;
            int prediccionMayor = anio + vez * 79;
            System.out.println("[" + prediccionMenor + " .. " + prediccionMayor + "]");
            linea = in.nextLine();
            datos = linea.split(" ");
            anio = Integer.parseInt(datos[0]);
            vez = Integer.parseInt(datos[1]);
        }

    }

}
