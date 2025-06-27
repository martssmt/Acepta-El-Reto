import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int repeticiones=teclado.nextInt();
        for (int i=0; i<repeticiones; i++) {
            System.out.println("Hola mundo.");
        }
    }
}
