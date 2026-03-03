package chap04;

public class CastingTest {
 
	public static void main( String[] args ) {

		short a, b, c;
		a = 1;
		b = 2;

		// int 보다 작은 data type 끼리의 연산 결과는 int
		//c = a + b;

		c = (short) ( a + b );

		// casting 시 주의할 사항
		//c = (short)a + b;

		// local 변수의 사용 유무 check
		System.out.println( c );
	}

}
