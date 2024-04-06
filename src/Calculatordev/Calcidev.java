package Calculatordev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calcidev {

	@Test
	public void calTest() {
		assertEquals(31, Calculatordev.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, Calculatordev.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, Calculatordev.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, Calculatordev.div(30, 5));
	}


}
