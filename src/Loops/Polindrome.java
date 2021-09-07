package Loops;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int no=num,res=0,rem;
		while(num>0)
		{
			rem=num%10;
			res=res*10+rem;
			num/=10;
		}
		if(no==res)
		{
			System.out.println(no+" is Polindrome");
		}
		else
		{
			System.out.println(no+" is not Polindrome");
		}
	}

}
