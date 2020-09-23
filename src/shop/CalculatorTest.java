package shop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void create_calculator_test() {
		Calculator calculator = new Calculator(5, 5, 5, 5);
		assertNotNull(calculator);
	}

	@Test
	public void calculator_combos_test() {
		Calculator calculator = new Calculator(1, 2, 3, 4);
		assertEquals(calculator.getCountOfA(), 1);
		assertEquals(calculator.getCountOfB(), 2);
		assertEquals(calculator.getCountOfC(), 3);
		assertEquals(calculator.getCountOfD(), 4);
	}

}
