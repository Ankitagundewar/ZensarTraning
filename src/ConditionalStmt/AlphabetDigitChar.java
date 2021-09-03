package ConditionalStmt;

import java.util.Scanner;

public class AlphabetDigitChar
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if ((c >= 'a' && c <='z') || (c >= 'A' && c <= 'Z'))
		{
			System.out.println("Alphabet");
		} 
		else if (c >= 48 && c < 58)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("special character");
		}
	}

}
