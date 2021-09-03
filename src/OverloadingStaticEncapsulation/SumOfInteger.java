package OverloadingStaticEncapsulation;

public class SumOfInteger
{
	int sum;
	void sum()
	{
		System.out.println("Sum is Zero");
	}
	void sum(int i)
	{
		System.out.println("Sum is "+i);
	}
	void sum(int i,int j)
	{
		sum=i+j;
		System.out.println("Sum is "+sum);
	}
	void sum(int i,int j,int k)
	{
		sum=i+j+k;
		System.out.println("Sum is "+sum);
	}
	void sum(int i,int j,int k,int l)
	{
		System.out.println("Sum is "+(i+j+k+l));
	}
	public static void main(String[] args)
	{
		SumOfInteger s=new SumOfInteger();
		s.sum();
		s.sum(20);
		s.sum(20,10, 12);
		s.sum(22,31);
		s.sum(12, 6, 18, 23);
	}

}
