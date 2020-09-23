package shop;

import java.util.Scanner;

public class ShopMainClass {

	public static void main(String[] args) {
		System.out.println("Enter an input: ");
		String input = new Scanner(System.in).nextLine();

		Parser parser = new Parser(input);
		Calculator calculator = new Calculator(parser.getCountOfA(), parser.getCountOfB(), parser.getCountOfC(),
				parser.getCountOfD());
		System.out.println("Result : " + calculator.printResult());

	}
}
