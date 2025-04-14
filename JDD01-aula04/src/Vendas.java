import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] venda = new double[5];
        double soma = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite a venda do vendedor " + (i + 1) + ":");
            venda[i] = sc.nextDouble();
            soma += venda[i];
        }
        System.out.println("Total da venda: " + soma + "");
    }
}
