package Exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundExceptionUsingCatch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		try
		{
		for(int i=0;i<=10;i++)
		{
			a[i]=sc.nextInt();
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index cross the limit.....");
		}
	}

}
