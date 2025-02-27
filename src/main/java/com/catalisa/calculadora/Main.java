package com.catalisa.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = entrada.nextInt();

        double resultado = 0;

        try {
            switch (operacao) {
                case 1:
                    resultado = calculator.add(numero1, numero2);
                    System.out.println("Soma: " + resultado);
                    break;
                case 2:
                    resultado = calculator.subtract(numero1, numero2);
                    System.out.println("Subtração: " + resultado);
                    break;
                case 3:
                    resultado = calculator.multiply(numero1, numero2);
                    System.out.println("Multiplicação: " + resultado);
                    break;
                case 4:
                    resultado = calculator.divide(numero1, numero2);
                    System.out.println("Divisão: " + resultado);
                    break;
                default:
                    System.out.println("Operação Inválida");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        entrada.close();
    }
}
