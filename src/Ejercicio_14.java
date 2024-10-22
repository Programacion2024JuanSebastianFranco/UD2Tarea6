import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int total;

        //Imprimir preguntas al usuario
        System.out.println("Ingresa un numero: ");
        int numero = scan.nextInt();

        //Operacion Algoritmetica
        for (int numero2 = 10; numero2 >= 1; numero2 -= 2) {
            total = numero * numero2;
            System.out.println(numero + " x " + numero2 + " = " + total);
        }
    }
}                                                                                   