/*------------------------------------------------------------------------------
 * Name : SetExample
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

import java.util.HashSet;

public class SetExample {

    public static void main( String[] args ) {

        // 순서 유지 하지 않는다
        // 추가되는 데이터는 무시한다.
        HashSet set = new HashSet();
        set.add( "one" );
        set.add( "second" );
        set.add( "3rd" );
        set.add( new Integer( 4 ) );
        set.add( new Float( 5.0F ) );
        set.add( "second" );
        set.add( new Integer( 4 ) );
        System.out.println( set );

        set.remove( "second" );
        set.remove( new Float( 5.0F ) );
        System.out.println( set );
    }
}
