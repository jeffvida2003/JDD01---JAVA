import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os números podem formar um triângulo.");
        } else {
            System.out.println("Os números não podem formar um triângulo.");
        }
    }
}
