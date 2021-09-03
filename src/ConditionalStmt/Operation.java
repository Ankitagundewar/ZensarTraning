package ConditionalStmt;

/*WAP in java using switch case for following: 
 * Area of a circle
 *  Area of a square 
 *  Area of a right angled triangle 
 *  Area of a rectangle 
 *  Circumference of a circle 
 *  Perimeter of a square 
 *  Accept inputs like radius,side,etc through keyboard.*/
import java.util.Scanner;

public class Operation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice, r,a,b,l,w;
		double res;
		System.out.println("1.Area of a circle 2.Area of a square 3.Area of a right angled triangle 4.Area of a rectangle "
				+ "5.Circumference of a circle 6.Perimeter of a square");
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		switch (choice)
        {
            case 1:
            	System.out.println("Enter radius:");
        		r=sc.nextInt();
            	res=3.14*r*r;//r is radius
                System.out.println("Area Of Circle:"+res);
                break;
            case 2:
            	System.out.println("Enter side:");
            	a=sc.nextInt();
            	res=a*a;
                System.out.println("Area of a square:"+res);
                break;
            case 3:
            	System.out.println("Enter two side:");
        		a=sc.nextInt();
        		b=sc.nextInt();
            	res=a*b/2;  //a and b are side
                System.out.println("Area of a right angled triangle"+res);
                break;
            case 4:
            	System.out.println("Enter length and width:");
        		l=sc.nextInt(); 
        		w=sc.nextInt();
            	res=l*w;//l=length w=width
                System.out.println("Area of a rectangle"+res);
                break;
            case 5:
            	System.out.println("Enter radius:");
        		r=sc.nextInt();
            	res=2*3.14*r;//r is radius
                System.out.println("Circumference of a circle"+res);
                break;
            case 6:
            	System.out.println("Enter side:");
            	a=sc.nextInt();
            	res=4*a;//a is side
                System.out.println("Perimeter of a square"+res);
                break;
            default:
                System.out.println("Invalid input");
        }
	}

}
