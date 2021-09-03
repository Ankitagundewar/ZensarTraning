package ConditionalStmt;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("Character "+c+" is vowel");
		}
		else
		{
			System.out.println("Character "+c+" is consonant");
		}
	}

}

