import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


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

        //Realiza a operação escolhida
        if (operacao == 1) {
            resultado = numero1 + numero2;
            System.out.print("Soma: " + resultado);
        } else if (operacao == 2) {
            resultado = numero1 - numero2;
            System.out.print("Subtração: " + resultado);
        } else if (operacao == 3) {
            resultado = numero1 * numero2;
            System.out.print("Multiplicação: " + resultado);
        } else if (operacao == 4) {
            // Verifica se o segundo número é zero para evitar divisão por zero
            if (numero2 == 0) {
                System.out.println("Não é possível dividir por zero.");
            } else {
                resultado = numero1 / numero2;
                System.out.println("Divisão: " + resultado);
            }
        } else {
            //se não for válida
            System.out.println("Operação Inválida");
        }


        entrada.close();
    }
}
