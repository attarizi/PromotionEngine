package shop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectIntegrationTest {

	@Test
	public void scenarioA_test() {
		Parser parser = new Parser("ABC");
		Calculator calculator = new Calculator(parser.getCountOfA(), parser.getCountOfB(), parser.getCountOfC(),
				parser.getCountOfD());
		assertEquals(calculator.calc(), 100);
	}

	@Test
	public void scenarioB_test() {
		Parser parser = new Parser("AAAAABBBBBC");
		Calculator calculator = new Calculator(parser.getCountOfA(), parser.getCountOfB(), parser.getCountOfC(),
				parser.getCountOfD());
		assertEquals(calculator.calc(), 370);
	}

	@Test
	public void scenarioC_test() {
		Parser parser = new Parser("AAABBBBBCD");
		Calculator calculator = new Calculator(parser.getCountOfA(), parser.getCountOfB(), parser.getCountOfC(),
				parser.getCountOfD());
		assertEquals(calculator.calc(), 280);
	}

}
