package chap04;

public class SwitchTest {

	public static void main( String[] args ) {
		int aaa = 15;
		int bbb = 0;
 
		switch ( aaa ) {
			case 5:
				bbb = bbb + 1;
				break;
			case 10:
				bbb = bbb + 2;
				break;
			case 15:
				bbb = bbb + 4; 
				break;
			default:  
				bbb = bbb + 3;
				break;
		}
  
		System.out.println( bbb );
	}
}
