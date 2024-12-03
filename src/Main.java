import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        {

            // Definindo as variáveis para os números
            System.out.print("Digite o primeiro número: ");
            double numero1 = entrada.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = entrada.nextDouble();

            // Pede ao usuário para escolher uma operação
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int operacao = entrada.nextInt();

            // Variável para armazenar o resultado da operação
            double resultado = 0;
        }
    }
}