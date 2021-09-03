package Loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int n=num;
		for(int i=1;i<=10;i++)
		{
			System.out.print(num+" ");
			num=num+n;
		}
	}

}
