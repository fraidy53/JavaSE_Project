/*------------------------------------------------------------------------------
 * Name : ThrowsTest
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

public class ThrowsTest {

    public static void main( String[] args ) {

        ThrowsTest t = new ThrowsTest();
         
        try {
            t.methodA(); 
            System.out.println( "정상 수행" );
        } catch ( IOException e ) {
            System.out.println( "IOException 발생" );
        } finally{
            System.out.println( "프로그램 종료" );
        }
    }

    public void methodA() throws IOException {
        methodB();
    }

    public void methodB() throws IOException {
        methodC();
    }

    public void methodC() throws IOException {
        throw new IOException();
    }
}
