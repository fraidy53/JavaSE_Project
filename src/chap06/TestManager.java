package chap06;

public class TestManager {

	public static void main( String[] args ) {
	    Manager m = new Manager( "¼ÒÁö¼·" , 50000.0, "±â¼ú±³À°ÆÀ" );
	    System.out.println( m.getDetails() );
 
        Manager m2 = new Manager();
        m2.setName("¼ÒÁö¼·"); 
        System.out.println( m2.getDetails() ); 
    }
}
 