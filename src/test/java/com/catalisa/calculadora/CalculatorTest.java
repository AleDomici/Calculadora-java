package com.catalisa.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(5, 3);
		assertEquals(8, result, "5 + 3 deve ser 8");
	}

	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
		double result = calculator.subtract(5, 3);
		assertEquals(2, result, "5 - 3 deve ser 2");
	}

	@Test
	void testMultiply() {
		Calculator calculator = new Calculator();
		double result = calculator.multiply(5, 3);
		assertEquals(15, result, "5 * 3 deve ser 15");
	}

	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(6, 3);
		assertEquals(2, result, "6 / 3 deve ser 2");
	}

	@Test
	void testDivideByZero() {
		Calculator calculator = new Calculator();
		assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0), "Divisão por zero deve lançar exceção");
	}
}