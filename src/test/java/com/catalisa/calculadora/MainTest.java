package com.catalisa.calculadora;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testMainAddition() {
        String input = "5\n3\n1\n"; // Simula entrada: 5, 3, operação 1 (soma)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Soma: 8.0"), "A saída deve conter 'Soma: 8.0'");
    }

    @Test
    void testMainSubtraction() {
        String input = "5\n3\n2\n"; // Simula entrada: 5, 3, operação 2 (subtração)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Subtração: 2.0"), "A saída deve conter 'Subtração: 2.0'");
    }

    @Test
    void testMainMultiplication() {
        String input = "5\n3\n3\n"; // Simula entrada: 5, 3, operação 3 (multiplicação)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Multiplicação: 15.0"), "A saída deve conter 'Multiplicação: 15.0'");
    }

    @Test
    void testMainDivision() {
        String input = "6\n3\n4\n"; // Simula entrada: 6, 3, operação 4 (divisão)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Divisão: 2.0"), "A saída deve conter 'Divisão: 2.0'");
    }

    @Test
    void testMainDivisionByZero() {
        String input = "6\n0\n4\n"; // Simula entrada: 6, 0, operação 4 (divisão por zero)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Cannot divide by zero"), "A saída deve conter 'Cannot divide by zero'");
    }

    @Test
    void testMainInvalidOperation() {
        String input = "5\n3\n5\n"; // Simula entrada: 5, 3, operação inválida (5)
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Operação Inválida"), "A saída deve conter 'Operação Inválida'");
    }
}