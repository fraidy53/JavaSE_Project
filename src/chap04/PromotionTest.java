package chap04;

public class PromotionTest {

	public static void main( String[] args ) {

		long longVal = 99L;
		//int intVal1 = longVal;    // compile error
		int intVal2 = (int)longVal;  // Casting 했으므로 OK (정보도 잃지 않음)
		 
	    int intVal = 128;
	    byte byteVal = (byte)intVal; // byteVal에 저장될 값 보장 못함
	    
	    System.out.println( "intVal2 : " + intVal2 );	 
	    System.out.println( "byteVal : " + byteVal );	    
	} 

}
