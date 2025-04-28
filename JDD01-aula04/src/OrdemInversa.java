import java.util.ArrayList;
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        int[] numerosInvertidos = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length - 1 - i];
        }

        for (int num : numerosInvertidos) {
            System.out.println("Numeros invertidos: " + num);
        }

    }
}
