import java.util.Scanner;

public class RetoDePolvorones {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String linea = in.nextLine();
        String[] datos = linea.split(" ");
        int max = Integer.parseInt(datos[0]);
        int tipos = Integer.parseInt(datos[1]);
        while (max != 0 || tipos != 0) {
            String maxTipos = in.nextLine();
            String numBandeja = in.nextLine();
            int[] maxPolvoronesPorTipos = rellenarArrayDeInt(maxTipos.split(" "));
            int[] numPolvoronesBandeja = rellenarArrayDeInt(numBandeja.split(" "));
            boolean puede = true;
            int sumaPolvoronesBandeja = 0;
            for (int i = 0; i < tipos; i++) {
                sumaPolvoronesBandeja += numPolvoronesBandeja[i];
                if (numPolvoronesBandeja[i] > maxPolvoronesPorTipos[i]) {
                    puede = false;
                }
            }
            if (sumaPolvoronesBandeja > max) puede = false;
            if (puede) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            linea = in.nextLine();
            datos = linea.split(" ");
            max = Integer.parseInt(datos[0]);
            tipos = Integer.parseInt(datos[1]);
        }


    }

    private static int[] rellenarArrayDeInt(String[] s) {
        int length=s.length;
        int[] resp=new int[length];
        for (int i=0; i<length; i++) {
            resp[i]=Integer.parseInt(s[i]);
        }
        return resp;
    }

}
