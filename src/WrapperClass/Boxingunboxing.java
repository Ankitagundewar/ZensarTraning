package WrapperClass;

public class Boxingunboxing {

	public static void main(String[] args) 
	{
		int x=89;
		Integer io=new Integer(x);//Boxing
		x=io;//	Auto Unboxing
		float f=34.12f;
		Float fl=new Float(f);
		Float f1=fl.floatValue();//unboxing
		char c='s';
		Character ch=new Character(c);
		c=ch;
		double d=23.54;
		Double D = new Double(d); 
		d=D;
		boolean b=true;
		Boolean B=new Boolean(b);
		b=B;
		long l=1234;
		Long L=new Long(l);
		l=L;
		short s=12;
		Short S=new Short(s);
		s=S;
		byte by=2;
		Byte BY=new Byte(by);
		by=BY;
	}

}
