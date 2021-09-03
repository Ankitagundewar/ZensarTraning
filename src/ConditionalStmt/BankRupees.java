package ConditionalStmt;

import java.util.Scanner;

public class BankRupees {

	public static void main(String[] args) {
		int amt, r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0, count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Amount in Rupees : \n\n");
		amt = sc.nextInt();

		while (amt >= 2000) {
			r1 = amt / 2000;
			amt = amt % 2000;
			System.out.print("\nTotal Number Of 2000 Rupees Notes :" + r1);
			break;
		}
		while (amt >= 500) {
			r2 = amt / 500;
			amt = amt % 500;
			System.out.print("\nTotal Number Of 500 Rupees Notes : " + r2);
			break;
		}
		while (amt >= 100) {
			r3 = amt / 100;
			amt = amt % 100;
			System.out.print("\nTotal Number Of 100 Rupees Notes : " + r3);
			break;
		}
		while (amt >= 50) {
			r4 = amt / 50;
			amt = amt % 50;
			System.out.print("\nTotal Number Of 50 Rupees Notes : " + r4);
			break;
		}
		while (amt >= 20) {
			r5 = amt / 20;
			amt = amt % 20;
			System.out.print("\nTotal Number Of 20 Rupees Notes : " + r5);
			break;
		}
		while (amt >= 10) {
			r6 = amt / 10;
			amt = amt % 10;
			System.out.print("\nTotal Number Of 10 Rupees Notes Or Coin : " + r6);
			break;
		}
		while (amt >= 5) {
			r7 = amt / 5;
			amt = amt % 5;
			System.out.print("\nTotal Number Of 5 Rupees Notes Or Coin : " + r7);
			break;
		}
		while (amt >= 1) {
			r8= amt / 1;
			amt = amt % 1;
			System.out.print("\nTotal Number Of 1 Rupees Note Or Coin : " + r8);
			break;
		}
		count = r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 ;
		System.out.print("\n\nTotal Number Of Notes Require : \n\n" + count);
	}

}
