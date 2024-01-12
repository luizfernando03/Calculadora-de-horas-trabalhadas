import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo à central de pagamentos!");

        // Instancia a calculadora
        CalculadoraSalario calculadora = new CalculadoraSalario();

        // Obtém os dados do usuário e realiza os cálculos
        calculadora.obterDados(sc);
        calculadora.calcularSalario();

        // Exibe o recibo
        calculadora.exibirRecibo();

        // Fecha o scanner
        sc.close();

    }
}