import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 1;

        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        System.out.println("Introduce a que valor potenciarlo: ");
        int pot = scan.nextInt();

        for (int cont = 1; cont <= pot; cont++ ){
            total *= num;
        }
        System.out.println("El resultado es: " + total);
    }
}
