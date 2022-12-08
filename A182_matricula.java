
import java.util.Scanner;

public class A182_matricula {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String matricula;
        char[] caracter;
        boolean formato = true;

        System.out.println("Introduce la mátricula de tu coche: ");
        matricula = lector.nextLine();
        caracter = matricula.toCharArray();

        if (caracter.length != 8) {
            System.out.println("La mátricula tiene que ser de 8 dígitos.");
        } else {
            for (int i = 0; i < caracter.length; i++) {
                if (i < 4 && (caracter[i] < '0' || caracter[i] > '9')) {
                    formato = false;
                }

                if (i == 4 && caracter[i] != '-') {
                    formato = false;
                }

                if (i > 4 && (caracter[i] < 'B' || caracter[i] > 'Z' || caracter[i] == 'E' || caracter[i] == 'I' || caracter[i] == 'O' || caracter[i] == 'U')) {
                    formato = false;
                }
            }

            /*if (formato) {
                System.out.println("El formato es correcto.");
            } else {
                System.out.println("El formato es incorrecto!!!");
            }*/
        }
    }
}
