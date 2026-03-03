/*------------------------------------------------------------------------------
 * Name : MathTest
 * DESC : 
 * VER  : 1.0
 * PROJ : VCC SE Path
 * Copyright 2006 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                   변        경        사        항
 *------------------------------------------------------------------------------
 *     DATE      AUTHOR                       DESCRIPTION
 *-------------  --------  ----------------------------------------------------- 
 * 2006. 8. 4.  기술대학원  ver1.0 작성
 *----------------------------------------------------------------------------*/
package chap09;

public class MathTest {

    public static void main( String[] args ) {
        
        System.out.println( "올림( 5.7 ) : "  + Math.ceil( 5.7 ) );
        System.out.println( "내림( 5.7 ) : "  + Math.floor( 5.7 ) );
        System.out.println( "반올림( 5.7 ) : "  + Math.round( 5.7 ) );
        System.out.println( "최소값( 3, 5 ) : "  + Math.min( 3, 5 ) );
        System.out.println( "최대값( 3, 5 ) : " + Math.max( 3, 5 ) );
        System.out.println( "제곱근( 4 ) : " + Math.sqrt( 4 ) );
        System.out.println( "Random : " + Math.random() );
        
    }
}
