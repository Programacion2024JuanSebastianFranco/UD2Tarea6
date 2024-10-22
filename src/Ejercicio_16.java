import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {

        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int totalP = 0;
        int totalI = 0;

        //Imprimir Preguntas Usuario
        System.out.println("Introduce el valor de n: ");
        int n = scan.nextInt();
        System.out.println("Introduce el valor de m: ");
        int m = scan.nextInt();

        //Operacion tipo If - For - Else
        if (m > n) {
            for (int cont = n; cont <= m; cont++) {
                if(cont % 2 == 0){
                    totalP += cont;
                } else {
                    totalI += cont;
                }
            }
            System.out.println("Suma Pares: " + totalP);
            System.out.println("Suma Impares: " + totalI);
        }
        else{
            System.out.println("Tu valor m es menor");
        }

    }
}            