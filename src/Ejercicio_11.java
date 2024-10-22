public class Ejercicio_11 {
    public static void main(String[] args) {

        //Bulce Algoritmico numeros hasta el 8
        for (int num = 1; num <= 8; num++) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        //Bulce Algoritmico numeros hasta el 9 en Impares
        for (int num = 1; num <= 9; num+= 2) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        //Bulce Algoritmico numeros decremento desde el 9
        for (int num = 9; num >= 1; num-= 1) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        //Bulce Algoritmico numeros decremento desde el 9 en Impares
        for (int num = 9; num >= 1; num-= 2) {
            System.out.print(num + " ");
        }

    }
}