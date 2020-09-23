package shop;

public class Calculator {
	private int countOfA;
	private int countOfB;
	private int countOfC;
	private int countOfD;

	public Calculator(int countOfA, int countOfB, int countOfC, int countOfD) {
		this.countOfA = countOfA;
		this.countOfB = countOfB;
		this.countOfC = countOfC;
		this.countOfD = countOfD;
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
}
