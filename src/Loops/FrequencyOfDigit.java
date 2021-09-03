package Loops;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int digit=sc.nextInt();
		int c=0;
		while(num>0)
		{
			if(num%10==digit)
			{
				c++;
			}
			num/=10;
		}
		System.out.println("Frequency Of Digit "+digit+" is:"+c);
	}

}
