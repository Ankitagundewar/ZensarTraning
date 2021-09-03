package ConditionalStmt;

import java.util.Scanner;

public class ThreeDigitNum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num>99 &&num<1000)
		{
			System.out.println("number is three digit number");
		}
		else
		{
			System.out.println("Number is not three digit number");
		}
	}

}
