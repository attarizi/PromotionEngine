package shop;

public class Calculator {
	// Avoid magic numbers
	private final int priceOfA = 50;
	private final int priceOf3A = 130;
	private final int priceOfB = 30;
	private final int priceOf2B = 45;
	private final int priceOfC = 20;
	private final int priceOfD = 15;
	private final int priceOfCandD = 30;

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

	public int getCountOfCandD() {
		return Math.min(countOfC, countOfD);
	}

	public int getCountOf3A() {
		return (countOfA / 3);
	}

	public int getCountOf2B() {
		return (countOfB / 2);
	}

	public int getCountOfAloneA() {
		return (countOfA % 3);
	}

	public int getCountOfAloneB() {
		return (countOfB % 2);
	}

	public int getCountOfAloneC() {
		return countOfC - getCountOfCandD();
	}

	public int getCountOfAloneD() {
		return countOfD - getCountOfCandD();
	}

	public int calc() {
		return getCountOfAloneA() * priceOfA + getCountOf3A() * priceOf3A + getCountOfAloneB() * priceOfB
				+ getCountOf2B() * priceOf2B + getCountOfCandD() * priceOfCandD + getCountOfAloneC() * priceOfC
				+ getCountOfAloneD() * priceOfD;
	}

	public String printResult() {
		StringBuilder sb = new StringBuilder("");
		sb.append("(");
		sb.append(priceOf3A);
		sb.append(" * ");
		sb.append(getCountOf3A());
		sb.append(") + (");

		sb.append(priceOfA);
		sb.append(" * ");
		sb.append(getCountOfAloneA());
		sb.append(") + (");

		sb.append(priceOf2B);
		sb.append(" * ");
		sb.append(getCountOf2B());
		sb.append(") + (");

		sb.append(priceOfB);
		sb.append(" * ");
		sb.append(getCountOfAloneB());
		sb.append(") + (");

		sb.append(priceOfCandD);
		sb.append(" * ");
		sb.append(getCountOfCandD());
		sb.append(") + (");

		sb.append(priceOfC);
		sb.append(" * ");
		sb.append(getCountOfAloneC());
		sb.append(") + (");

		sb.append(priceOfD);
		sb.append(" * ");
		sb.append(getCountOfAloneD());
		sb.append(") = ");

		sb.append(calc());

		return sb.toString();

	}
}
