import java.util.Scanner;

public class Procedimento {

    //Declarando um procedimento => Não tem retorno (void)
    //public static void nomeProcedimento(){}
    public static void exibirMenu(){
        System.out.println("Calculadora");
        System.out.println("1 - Entrada de dados");
        System.out.println("2 - Soma");
        System.out.println("3 - Subtração");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Divisão");
        System.out.println("6 - Sair");
        System.out.println("Digite a opção desejada: ");
    }
    //Procedimento que calcule a soma
    public static void somar(int n1, int n2){
        int soma;
        soma = n1 + n2;
        exibirResultado("Soma", soma);
    }

    public static void subtrair(int n1, int n2){
        int subtracao;
        subtracao = n1 - n2;
        exibirResultado("Subtraçao", subtracao);
    }

    public static void multiplicacao(int num1, int num2){
        int multi = num1 * num2;
        exibirResultado("Multiplicação", multi);
    }
    public static void exibirResultado(String mensagem, int resultado){
        System.out.println(mensagem + " = " + resultado);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        int opcao;
        do {
            exibirMenu();
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite um número: ");
                    n1 = leitor.nextInt();
                    System.out.println("Digite segundo número: ");
                    n2 = leitor.nextInt();
                    break;
                case 2:
                    somar(n1, n2);
                    break;
                case 3:
                    subtrair(n1, n2);
                    break;
                case 4:
                    multiplicacao(n1, n2);
                    break;


            }
        }while (opcao != 6);
    }
}
