import java.util.Scanner;

public class ExSwitch05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um caractere:");
        char input = sc.next().charAt(0);

        switch (input) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vogal minúscula");
            case 'A', 'E', 'I', 'O', 'U' -> System.out.println("Vogal maiúscula");
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("Dígito");
            default -> {
                if (input >= 'a' && input <= 'z') {
                    System.out.println("Consoante minúscula");
                } else if (input >= 'A' && input <= 'Z') {
                    System.out.println("Consoante maiúscula");
                } else {
                    System.out.println("Caractere especial");
                }
            }
        }
    }
}
