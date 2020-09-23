package shop;

public class Parser {
	private int countOfA = 0, countOfB = 0, countOfC = 0, countOfD = 0;

	public Parser(String input) {
		parse(input);
	}

	public int getCountOfA() {
		return countOfA;
	}

	public int getCountOfB() {
		return countOfB;
	}

	public int getCountOfC() {
		return countOfC;
	}

	public int getCountOfD() {
		return countOfD;
	}

	private void parse(String input) {
		countOfA = (int) input.chars().filter(ch -> ch == 'A').count();
		countOfB = (int) input.chars().filter(ch -> ch == 'B').count();
		countOfC = (int) input.chars().filter(ch -> ch == 'C').count();
		countOfD = (int) input.chars().filter(ch -> ch == 'D').count();
	}
}
