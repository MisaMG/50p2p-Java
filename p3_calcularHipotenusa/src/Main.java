import java.util.Scanner;

public class Main {
    /**
     * Este programa calcula la hipotenusa mediante los catetos de un triangulo rectangulo
     * dado por el usuario mediente consola.
     * @param args
     */
    public static void main(String[] args) {
        int cateto1 = 0;
        int cateto2 = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor del primer cateto:");
        cateto1 = teclado.nextInt();

        System.out.println("Ingresa el valor del segundo cateto: ");
        cateto2 = teclado.nextInt();

        /*
        calcular la hipotenusa con los balores dados por el usuario
         */
        double sumaCatetos = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        double hipotenusa = Math.sqrt(sumaCatetos);

        System.out.println("Su hipotenusa es: " + hipotenusa);
    }
}