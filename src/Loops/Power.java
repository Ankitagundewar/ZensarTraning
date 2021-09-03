package Loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int base=sc.nextInt();
		int b=base;
		int index=sc.nextInt();
		System.out.print("base:"+base+" and index:"+index+" is:");
		for(int i=1;i<index;i++)
			base*=b;
		System.out.print(base);
	}

}
