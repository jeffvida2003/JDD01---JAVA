import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para fazermos o fatorial:");
        int num = sc.nextInt();
        int fat = 1;
        for(int i = num; i >= 1; i--)
            fat *= i;
            System.out.println("Fatorial: " + fat );
    }
}
