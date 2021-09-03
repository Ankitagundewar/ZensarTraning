package ConditionalStmt;

import java.util.Scanner;

public class StringType {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter Character:");
		c=sc.next().charAt(0);
		switch (c)
        {
            case 'a':
                System.out.println("In 1st case");
                break;
            case 'b':
                System.out.println("In 2nd case");
                break;
            case 'c':
                System.out.println("In 3rd case");
                break;
            case 'd':
                System.out.println("In 4th case");
                break;
            case 'e':
                System.out.println("In 5th case");
                break;
            default:
                System.out.println("Invalid input");
        }
	}

}
