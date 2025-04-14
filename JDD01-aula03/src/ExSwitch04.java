import java.util.Scanner;

public class ExSwitch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        char operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}
