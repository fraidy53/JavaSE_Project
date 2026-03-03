/*------------------------------------------------------------------------------
 * Name : ExceptionTest
 * DESC : 
 * VER  : 1.0
 * PROJ : VCC SE Path
 * Copyright 2006 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                   변        경        사        항
 *------------------------------------------------------------------------------
 *     DATE      AUTHOR                       DESCRIPTION
 *-------------  --------  ----------------------------------------------------- 
 * 2006. 9. 7.  기술대학원  ver1.0 작성
 *----------------------------------------------------------------------------*/

package chap08;

import java.io.*;

/**
 * @author 기술대학원
 *
 */
public class ExceptionTest {

    /**
     * @param args
     */
    public static void main( String[] args ) {

        methodA();
        
        try {
            methodB();
        } catch ( RuntimeException e ) {
            System.out.println( "main()에서 처리" );
        }
    }
    
     public static void methodA() {
         try{
             throw new FileNotFoundException();
         } catch ( FileNotFoundException e ) {
             System.out.println( "FileNotFoundException 발생!!" );
         } catch ( IOException e ) {
             System.out.println( "IOException 발생!!" );  
             e.printStackTrace();
         } finally {
             System.out.println( "Finally 입니다!!" );
         }
        
     }
     
     public static void methodB() throws RuntimeException {
         throw new RuntimeException();
     }
}









