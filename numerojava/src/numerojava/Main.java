package numerojava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int[] primos = new int[10];
        int indicePrimos = 0;

        int[] noPrimos = new int[10];
        int indiceNoPrimos = 0;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos[indicePrimos++] = numero;
            } else {
                noPrimos[indiceNoPrimos++] = numero;
            }
        }

        int[] resultado = Arrays.copyOf(primos, indicePrimos + indiceNoPrimos);
        System.arraycopy(noPrimos, 0, resultado, indicePrimos, indiceNoPrimos);

        System.out.println("Array original mostrando la posición del array más el valor:");
        mostrarArray(numeros);

        System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
        mostrarArray(resultado);
    }
 
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }

	}

}
