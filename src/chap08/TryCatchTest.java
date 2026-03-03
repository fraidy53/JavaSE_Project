/*------------------------------------------------------------------------------
 * Name : TryCatchTest
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

public class TryCatchTest {

    public static void main( String[] args ) {

        int[] number = { 10, 4, 25 };
        
        try{
           System.out.println( number[3] );
           
        }catch( ArrayIndexOutOfBoundsException ae){
            System.out.println( "catch : ArrayIndexOutOfBoundsException" );
            ae.printStackTrace();
       
        }catch( Exception e){
            System.out.println( "catch : Exception" );
            e.printStackTrace();
        }finally{ 
            System.out.println( "finally" );
        }

        System.out.println( "End of main()" );
    }
}
