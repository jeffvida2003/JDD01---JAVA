import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double valor =0;
        do{
            System.out.println("Digite a opção 1 - deposito, 2 - Saque, 3 - Consultar Saldo , 4 - Sair: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    valor = valor + sc.nextDouble();
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    valor = valor - sc.nextDouble();
                    break;
                case 3:
                    System.out.println("Saldo: " + valor);
                    break;
                case 4:
                    System.out.println("Saindo do Sistema!");
                    break;
                }
            }while (opcao != 4);
    }
}
