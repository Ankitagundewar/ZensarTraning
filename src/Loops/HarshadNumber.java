package Loops;

import java.util.Scanner;

/*WAP to find given number is Harshad/Niven number or not
An harshad number is an integer number divisible by sum of its digit 
Eg 18 sum=9  and 18 is divisible by 9
123 sum=6 and 123 is divisible by 6// if 123%6==0 then harshad number
*/
public class HarshadNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int no=num,sum=0;
		while(num!=0)
		{
			sum+=(num%10);
			num/=10;
		}
		if(no%sum==0)
		{
			System.out.println(no+" is Harshad Number");
		}
		else
		{
			System.out.println(no+" is not Harshad Number");
		}
	}

}
