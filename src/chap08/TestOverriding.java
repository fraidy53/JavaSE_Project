/*------------------------------------------------------------------------------
 * Name : TestOverriding
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

package chap08;

import java.io.IOException;

/**
 * @author 기술대학원 
 *
 */
public class TestOverriding {

    /**
     * @param args
     */
    public static void main( String[] args ) {

        SuperClass superClass = new SubClass();

        try {
            superClass.method(); //자식클래스의 Exception 발생
        } catch ( IOException ioe ) { // Exception을 잡을 수 없다.
            System.out.println( "IOException occured!") ;
        }
   
    } 

}
