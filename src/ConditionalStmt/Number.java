package ConditionalStmt;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else if(num<0)
		{
			System.out.println("Number is negetive");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}

}
