package chap09;

import java.util.*;

public class EnumerationTest {

    public static void main( String[] args ) {
        Vector vec = new Vector();

        vec.add( "LG CNS" );
        vec.add( "SE Path" );
        vec.add( "Good Luck!!!" );

        Enumeration enumList = vec.elements();

        String str = null;

        while ( enumList.hasMoreElements() ) {
            str = (String)enumList.nextElement();
            System.out.println( str );
        }
    }
}

