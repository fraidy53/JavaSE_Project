
package chap06;

import java.util.*;

class TestHashCode {

    public static void main( String[] args ) {

        MyDate hDate1 = new MyDate( 14, 3, 1976 );
        MyDate hDate2 = new MyDate( 14, 3, 1976 );
        System.out.println( hDate2 );

        Hashtable ht = new Hashtable();

        ht.put( new MyDate( 14, 3, 1976 ), "ddd" );

        System.out.println( (String)ht.get( hDate1 ) );

        String str1 = new String( "abc" );
        String str2 = new String( "abc" );
        ht.put( str1, "hello" );
        System.out.println( (String)ht.get( str2 ) );

        System.out.println( "===hashcode=== " );
        System.out.println( hDate1.hashCode() );
        System.out.println( hDate2.hashCode() );

    }
}
