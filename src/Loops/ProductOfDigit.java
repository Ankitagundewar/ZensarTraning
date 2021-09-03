package Loops;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), count = 0,no,res=1;
		while (num != 0) 
		{
			no=num%10;
			num /= 10;
			res*=no;
		}
		System.out.println("count number of digits is:"+res);
	}

}
