package Collection_ArrayList;

import java.util.ArrayList;

public class NonGenericArrayList
{
	ArrayList al1;
	ArrayList al2;
	NonGenericArrayList()
	{
		al1=new ArrayList();
		al2=new ArrayList();
		System.out.println("AL1 :"+al1);
		System.out.println("AL2 :"+al2);
	}
	public void makeList()
	{
		al1.add(12);
		al1.add(23);
		al1.add(34);
		al2.add("ABC");
		al2.add("PQR");
		al2.add("XYZ");
		System.out.println("AL1 List :"+al1);
		System.out.println("AL2 List :"+al2);
	}
	public static void main(String[] args)
	{
		NonGenericArrayList n=new NonGenericArrayList();
		n.makeList();
	}

}
