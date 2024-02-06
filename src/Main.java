import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        num1 = scan.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        num2 = scan.nextInt();

        System.out.println("La suma de los dos numeros es: " + (num1 + num2));
        System.out.println("La resta de los dos numeros es: " + (num1 - num2));
        System.out.println("La multiplicacion de los dos numeros es: " + (num1 * num2));
        System.out.println("La division de los dos numeros es: " + (num1 / num2));
    }

}