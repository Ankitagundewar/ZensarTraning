package Loops;
/*WAP to check given no is automorphic or not
input n=25
output Automorphic
as 25*25=625*/

import java.util.Scanner;

public class Automorphic 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Automorphic as "+num+"*"+num+"="+num*num);
	}

}
