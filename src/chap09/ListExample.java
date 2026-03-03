/*------------------------------------------------------------------------------
 * Name : ListExample
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

import java.util.*;

public class ListExample {

    public static void main( String[] args ) {

        // 순서 유지 한다.
        // 데이터 추가 가능하다.
        List list = new ArrayList();
        list.add( "one" );
        list.add( "second" );
        list.add( "3rd" );
        list.add( new Integer(4) );
        list.add( new Float(5.0F) );
        list.add( "second" );
        list.add( new Integer(4) );
        System.out.println( list );

        list.remove( "second" );
        list.remove( new Float(5.0F) );
        System.out.println( list );

    }
}
