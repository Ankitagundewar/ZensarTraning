package Loops;
/*WAP to check given no is Krishnamurthy or not
eg)  153=1!+5!+3!=153*/

import java.util.Scanner;

public class Krishnamurthy {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int no=1,sum=0;
		while(num!=0)
		{
			int j=num%10;
			for(int i=1;i<=j;i++)
			{
				no*=i;
			}
			sum+=no;
			num/=10;
			no=1;
		}
		if(num1==sum)
		{
			System.out.println(num1+" is Krishnamurthy");
		}
		else
		{
			System.out.println(num1+" is not Krishnamurthy");
		}
	}

}
