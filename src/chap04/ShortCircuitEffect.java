package chap04;
   
public class ShortCircuitEffect {

	public static void main( String[] args ) {
		  int divisor = 0;
		  int dividend = 100;
		  /*
		  if ( divisor != 0 & dividend/divisor > 10 ) {
		      System.out.println( "몫이 10보다 크다." );
		  }*/

		  
		  if ( divisor != 0 && dividend/divisor > 10 ) {
		      System.out.println( "몫이 10보다 크다." );
		  } 	   
	}
}
