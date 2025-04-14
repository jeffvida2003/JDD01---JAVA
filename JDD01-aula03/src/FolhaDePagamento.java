import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de horas extras trabalhadas nos dias uteis: ");
        int horasExtras = sc.nextInt();
        System.out.println("Informe a quantidade de horas extras trabalhadas nos feriados e domingos : ");
        int horasExtrasFeriado = sc.nextInt();
        System.out.println("Informe o seu salário:");
        double seuSalario = sc.nextDouble();
        System.out.println("Informe o valor da pensão alimentícia se houver: ");
        double pensao = sc.nextDouble();
        System.out.println("Informe a quantidade de dependentes: ");
        double dependentes = sc.nextInt() * 189.59;
        double calcHorasExtras = horasExtras * 1.50;
        double calcHorasExtrasFeriado = horasExtrasFeriado * 2;
        double inss = 0;
        String inssAliquota = "";
        if (seuSalario <= 1302.01) {
            inss = seuSalario * 0.075;
            inssAliquota = "7.5%";
        } else if (seuSalario <= 2571.29) {
            inss = (1302*0.075) +
                    ((seuSalario-1302) * 0.09);
            inssAliquota = "9.0%";
        } else if (seuSalario <= 3856.94) {
            inss = (1302*0.075) +
                    ((2571.29-1302) * 0.09) +
                    ((seuSalario-2571.29) * 0.12);
            inssAliquota = "12.0%";
        } else if (seuSalario <= 7507.49) {
            inss = (1302*0.075) +
                    ((2571.29-1302) * 0.09) +
                    ((3856.94-2571.29) * 0.12) +
                    (seuSalario-3856.94) * 0.14;
            inssAliquota = "14.0%";
        }else if (seuSalario > 7507.49) {
            inss = 877.24;
            inssAliquota = "877.24";
        }
        double baseCalculo = seuSalario - inss - pensao - dependentes ;

        double irpf = 0;
        String irpfAliquota = "";
        if (baseCalculo <= 1903.98) {
            irpf = 0;
        } else if(baseCalculo < 2826.65){
            irpf = (baseCalculo * 0.075) - 142.80;
            irpfAliquota = "7.5%";
        } else if (baseCalculo <= 3751.05) {
            irpf = (baseCalculo * 0.15) - 354.80;
            irpfAliquota = "15.0%";
        } else if (baseCalculo <= 4664.68) {
            irpf = (baseCalculo * 0.225) - 636.13;
            irpfAliquota = "22.5%";
        } else if (baseCalculo > 4664.68) {
            irpf = (baseCalculo * 0.275) - 869.36;
            irpfAliquota = "27.5%";
        }
        System.out.println("Salario Bruto: " + seuSalario);
        System.out.println("INSS Aliquota: " + inssAliquota + " Desconto: " + inss);
        System.out.println("IRPF Aliquota: " + irpfAliquota + " Desconto: " + irpf);
        System.out.println("Outros descontos: " + (pensao));
        System.out.println("Horas extras: " + (calcHorasExtras + calcHorasExtrasFeriado));
        System.out.println("Total Proventos: "+ seuSalario + " Desconto: "+ (irpf+inss+pensao));
        System.out.println("Resultado: "+ (seuSalario + (calcHorasExtras + calcHorasExtrasFeriado) - (irpf+inss+pensao)));
    }
}
