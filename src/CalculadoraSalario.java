import java.util.Scanner;

public class CalculadoraSalario {

    private double valorHora;
    private double horasTrabalhadas;
    private double salarioBruto;
    private double valorInss;
    private double valorImpostoDeRenda;
    private double valorSindicato;
    private double salarioLiquido;

    public void obterDados(Scanner sc) {
        System.out.println("Digite o valor da sua hora trabalhada:");
        valorHora = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        horasTrabalhadas = sc.nextDouble();
    }

    public void calcularSalario() {
        salarioBruto = valorHora * horasTrabalhadas;
        valorInss = salarioBruto * 0.09;
        valorImpostoDeRenda = salarioBruto * 0.11;
        valorSindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - valorInss - valorImpostoDeRenda - valorSindicato;
    }

    public void exibirRecibo() {
        System.out.println("Resumo do pagamento:");
        System.out.println("Valor da hora trabalhada: R$" + valorHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Desconto do INSS: R$" + valorInss);
        System.out.println("Desconto do Imposto de Renda: R$" + valorImpostoDeRenda);
        System.out.println("Desconto do Sindicato: R$" + valorSindicato);
        System.out.println("Salário líquido: R$" + salarioLiquido);
    }
}
