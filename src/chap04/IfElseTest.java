package chap04;

public class IfElseTest {
  
	public static void main( String[] args ) {

		int i = 200;

		if ( i < 100 ){
            if ( i > 10 ){
                System.out.println( "10보다 크고 100보다 작다");
            }else{
                System.out.println( "i는 100이상이다.");
            }
		}
	}
}
