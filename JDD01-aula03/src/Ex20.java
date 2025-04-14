import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os números formam um triângulo.");

            if (a == b && b == c) {
                System.out.println("O triângulo é Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os números não formam um triângulo.");
        }
    }
}
