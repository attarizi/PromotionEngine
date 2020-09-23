package shop;

public class ShopMainClass {

	public static void main(String[] args) {
		Parser parser = new Parser(args[0]);
		Calculator calculator = new Calculator(parser.getCountOfA(), parser.getCountOfB(), parser.getCountOfC(),
				parser.getCountOfD());
		System.out.println(calculator.printResult());

	}

}
