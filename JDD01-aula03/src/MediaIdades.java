import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade1, idade2, idade3, idade4, idade5, media;
        System.out.println("Digite a idade do 1º aluno: ");
        idade1 = leitor.nextInt();
        System.out.println("Digite a idade do 2º aluno: ");
        idade2 = leitor.nextInt();
        System.out.println("Digite a idade do 3º aluno: ");
        idade3 = leitor.nextInt();
        System.out.println("Digite a idade do 4º aluno: ");
        idade4 = leitor.nextInt();
        System.out.println("Digite a idade do 5º aluno: ");
        idade5 = leitor.nextInt();
        media = (idade1 + idade2 + idade3 + idade4 + idade5)/5;
        System.out.println("A média de idade dos alunos da escola é: " + media);
    }

}





