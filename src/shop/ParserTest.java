package shop;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ParserTest {

	@Test
	public void create_test() {
		Parser parser = new Parser();
		assertNotNull(parser);
	}

}
