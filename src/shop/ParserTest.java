package shop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ParserTest {

	@Test
	public void create_test() {
		Parser parser = new Parser("");
		assertNotNull(parser);
	}

	@Test
	public void parser_counter_test() {
		Parser parser = new Parser("AAABBBCD");

		assertEquals(parser.getCountOfA(), 3);
		assertEquals(parser.getCountOfB(), 3);
		assertEquals(parser.getCountOfC(), 1);
		assertEquals(parser.getCountOfD(), 1);
	}

}
