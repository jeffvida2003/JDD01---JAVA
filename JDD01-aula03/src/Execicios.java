import java.util.Scanner;

public class Execicios {
    public static void main(String[] args) {
       /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Este numero é par");
        }else
            System.out.println(" Este numero é impar");

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o numero 2: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o numero 3: ");
        int num3 = sc.nextInt();

        // Check if num1 is greater than num2, if so, swap them
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Check if num1 is greater than num3, if so, swap them
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // Check if num2 is greater than num3, if so, swap them
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Os números ordenados são: " + num1 + ", " + num2 + ", " + num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os três números são iguais.");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("Todos os números são diferentes.");
        } else {
            System.out.println("Dois dos três números são iguais.");
        }
            


    }
}
