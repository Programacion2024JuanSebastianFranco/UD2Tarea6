import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int suma = 0;
        int producto = 1;


        System.out.println("Ingresa un numero n: ");
        int numero = scan.nextInt();

        for (int cont = 1; cont <= numero; cont++) {
            suma = suma + cont;
            producto = producto * cont;
            }
        System.out.println("resultado: " + suma);
        System.out.println("resultado producto: " + producto);
    }
}                       