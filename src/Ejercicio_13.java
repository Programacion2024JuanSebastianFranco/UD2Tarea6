import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total;

        System.out.println("Ingresa un numero: ");
        int numero = scan.nextInt();

        for (int numero2 = 10; numero2 >= 1; numero2--){
            total = numero * numero2;
            System.out.println(numero + " x " + numero2 + " = " + total);
        }
    }
}                                                                                   