package ConditionalStmt;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, no1, no2;
		System.out.println("Enter two number");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		System.out.println("1.Addition 2.Substraction 3.Multipication 4.Division");
		System.out.println("Enter your choice");
		input = sc.nextInt();

		switch (input)
		{
		case 1:
			System.out.println(no1 + no2);
			break;
		case 2:
			System.out.println(no1 - no2);
			break;
		case 3:
			System.out.println(no1 * no2);
			break;
		case 4:
			System.out.println(no1 / no2);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
