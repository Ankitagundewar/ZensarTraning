package WrapperClass;

public class ValueOfPrimitive {

	public static void main(String[] args)
	{
		Byte B = Byte.valueOf((byte) 213);
        System.out.println(B);              
 
        Short S = Short.valueOf((short) 37);
        System.out.println(S);            
 
        Integer I = Integer.valueOf(39);
        System.out.println(I);            
 
        Long L = Long.valueOf(345);
        System.out.println(L);            
 
        Float F = Float.valueOf(45.7f);
        System.out.println(F);           
 
        Double D = Double.valueOf(23.6d);
        System.out.println(D);           
 
        Boolean BL = Boolean.valueOf(true);
        System.out.println(BL);        
        BL = Boolean.valueOf(false);
        System.out.println(BL);        
 
        Character C = Character.valueOf('g');
        System.out.println(C);
	}

}
