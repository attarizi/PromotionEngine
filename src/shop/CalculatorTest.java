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
	public void calculator_counter_test() {
		Calculator calculator = new Calculator(1, 2, 3, 4);
		assertEquals(calculator.getCountOfA(), 1);
		assertEquals(calculator.getCountOfB(), 2);
		assertEquals(calculator.getCountOfC(), 3);
		assertEquals(calculator.getCountOfD(), 4);
	}

	@Test
	public void calculator_combos_test() {
		Calculator calculator = new Calculator(7, 5, 3, 4);
		assertEquals(calculator.getCountOf2B(), 2);
		assertEquals(calculator.getCountOf3A(), 2);
		assertEquals(calculator.getCountOfCandD(), 3);
	}

	@Test
	public void calculator_Alone_test() {
		Calculator calculator = new Calculator(7, 5, 3, 4);
		assertEquals(calculator.getCountOfAloneA(), 1);
		assertEquals(calculator.getCountOfAloneB(), 1);
		assertEquals(calculator.getCountOfAloneC(), 0);
		assertEquals(calculator.getCountOfAloneD(), 1);
	}

	@Test
	public void calculator_calc_test_scenarioA() {
		Calculator calculator = new Calculator(1, 1, 1, 0);
		assertEquals(calculator.calc(), 100);
	}

	@Test
	public void calculator_calc_test_scenarioB() {
		Calculator calculator = new Calculator(5, 5, 1, 0);
		assertEquals(calculator.calc(), 370);
	}

	@Test
	public void calculator_calc_test_scenarioC() {
		Calculator calculator = new Calculator(3, 5, 1, 1);
		assertEquals(calculator.calc(), 280);
	}

	@Test
	public void calculator_calc_test_print() {
		Calculator calculator = new Calculator(3, 5, 1, 1);
		assertEquals(calculator.printResult(), "");
	}
}
