import java.util.Scanner;
/**
 * Metodo que pregunta el nombre del usuario y lo despliega con un amigable saludo
 */
public class Main {
    public static void main(String[] args) {

        String name = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola!!, Cual es tu nombre?");
        name = teclado.nextLine();
        System.out.println("¡Hola " + name + "! Que tengas un gran día perro :)");
    }
}