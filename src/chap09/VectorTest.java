/*------------------------------------------------------------------------------
 * Name : VectorTest
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

import java.util.Vector;

public class VectorTest {
    public static void main( String[] args ) {

        Vector vec = new Vector();
        MyDate d1 = new MyDate( 01, 03, 2006 );
        MyDate d2 = new MyDate( 01, 05, 2006 );

        System.out.println( "d1:" + d1 );
        System.out.println( "d2:" + d2 );

        vec.add( d1 );
        vec.add( d1 );
        vec.add( d2 );
        System.out.println( vec.size() ); 

        d1.setDay( 30 );

        MyDate d11 = (MyDate)vec.get( 0 );
        MyDate d12 = (MyDate)vec.get( 1 );

        System.out.println( "d11.getDay():" + d11.getDay() );
        System.out.println( "d12.getDay():" + d12.getDay() );
        System.out.println( "d1 : " + (MyDate)vec.get( 1 ) );
        System.out.println( "d2 : " + (MyDate)vec.get( 2 ) );  
        
/*      MyDate[] dateArr = new MyDate[vec.size()];
                
        vec.toArray( dateArr );
        
        for( int inx = 0; inx < dateArr.length; inx++ ){
            System.out.println( dateArr[inx].getDay() );
        }
*/
    }
}
