import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {

        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int total = 1;

        //Imprimir Preguntas Usuario
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        System.out.println("Introduce a que valor potenciarlo: ");
        int pot = scan.nextInt();

        //Operacion ALgoritmica
        for (int cont = 1; cont <= pot; cont++ ){
            total *= num;
        }
        System.out.println("El resultado es: " + total);
    }
}
