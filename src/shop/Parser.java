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
		for (char a : input.toCharArray()) {
			switch (a) {
			case 'A':
				countOfA++;
				break;
			case 'B':
				countOfB++;
				break;
			case 'C':
				countOfC++;
				break;
			case 'D':
				countOfD++;
				break;
			}
		}
	}
}
