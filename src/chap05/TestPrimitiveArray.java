package chap05;

public class TestPrimitiveArray {
	public static void main( String[] args ) {
		int[] numbers = null;
		numbers = new int[10];
 
		for ( int inx = 0; inx < numbers.length; inx++ ) {
			numbers[inx] = inx + 1;
			System.out.println( numbers[inx] );
		}
 
	} 
}
