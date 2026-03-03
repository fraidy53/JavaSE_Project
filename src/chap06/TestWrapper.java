package chap06;

public class TestWrapper{

    public static void main( String[] args ) {
        int pInt = 500;
        Integer wInt = new Integer( pInt );
        int p2 = wInt.intValue();
         
        System.out.println( "p2 : " + p2 );
        
        String str = "3";
        int x = Integer.valueOf( str ).intValue();
        int x2 = Integer.parseInt( str );

        System.out.println( "x : " + x );
        System.out.println( "x2 : " + x2 );
    }
}
