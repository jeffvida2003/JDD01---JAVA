import java.util.Scanner;

public class ExSwitch03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String input = scanner.nextLine();

        if (input.length() == 1 && ((input.charAt(0) >= 'a' && input.charAt(0) <= 'z') || (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z'))) {
            char letter = (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') ? (char) (input.charAt(0) + ('a' - 'A')) : input.charAt(0);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("A letra é uma vogal.");
                    break;
                default:
                    System.out.println("A letra é uma consoante.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, insira uma única letra.");
        }
        scanner.close();
    }
}
