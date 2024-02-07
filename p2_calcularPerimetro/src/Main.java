import java.util.Scanner;

public class Main {


    /**
     * Calcular el perimetro y área de un rectángulo dada su base y su altura
     * @param args
     */
    public static void main(String[] args) {
        int base = 0;
        int altura = 0;
        /*
            Método que pregunta al usuario la base del triangulo mediante consola
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese al valor de la base: ");
        base = teclado.nextInt();
        /*
            Método que pregunta al usuario la altura del triangulo mediante consola
         */
        System.out.println("Ingrese el valor de la altura: ");
        altura = teclado.nextInt();

        /*
            Operaciones aritmeticas para calcular el perimetro y el area directamente en la
            declaracion de las variables  de perimetro y area
         */
        int perimetro = base*3;
        int area = (base*altura)/2;
        /*
            Muestra los resultados al usuario
         */
        System.out.println("Su perimetro es: " + perimetro);
        System.out.println("Su area es: " + area);

    }
}