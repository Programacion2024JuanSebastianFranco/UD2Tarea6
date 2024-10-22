import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int total;

        //Imprimir Preguntas de Datos al Usuario
        System.out.println("Ingresa un numero: ");
        int numero = scan.nextInt();

        //Operacion Algoritmica
        for (int numero2 = 1; numero2 <= 10; numero2++){
            total = numero * numero2;
            System.out.println(numero + " x " + numero2 + " = " + total);
         }
    }
}