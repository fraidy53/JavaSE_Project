/*------------------------------------------------------------------------------
 * Name : MapExample
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

public class MapExample {
    public static void main( String[] args ) {

        HashMap hMap = new HashMap();
        
        String key1 = "1";
        String key2 = "2";
        
        String value1 = "LG CNS";
        String value2 = "VCC SE Path";
        
        hMap.put( key1, value1 );
        hMap.put( key2, value2 );
        
        System.out.println( hMap.get( key1 ) );
        System.out.println( hMap.get( "2" ) );
        
        hMap.put( key1, value2 );
        System.out.println( hMap.get( key1 ) );    }
}
