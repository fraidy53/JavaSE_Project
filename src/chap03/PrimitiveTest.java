package chap03;

public class PrimitiveTest{
	public static void main(String[] args){
		boolean isMemberOK = true;
		
		isMemberOK = false;
		
		System.out.println( "boolean test : " + isMemberOK );
		
		char ch = '\uAC00';
		
		System.out.println( "ch is  : " + ch );
		 		
		//byte b = 128;
		 
		int i = 30;
		long l = 30L;

		System.out.println( "i is  : " + i );
		System.out.println( "l is  : " + l );	
			
		float f = 3.14f;
		double d = 3.14d;

		System.out.println( "f is  : " + f );
		System.out.println( "d is  : " + d );		
	}
}