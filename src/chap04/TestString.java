package chap04;

public class TestString {
 
	public static void main( String[] args ) {

		String s1 = "LG CNS";
		String s2 = "LG CNS";
		String s3 = new String( "LG CNS" );
		
		System.out.println( "1. == 비교" ); 
		System.out.println( s1 == s2 ); 
		System.out.println( s1 == s3 ); 

		System.out.println( "2. equals 비교" ); 
		System.out.println( s1.equals(s2) ); 
		System.out.println( s1.equals(s3)  );
	} 
}
