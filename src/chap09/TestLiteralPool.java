/*------------------------------------------------------------------------------
 * Name : TestLiteralPool
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

public class TestLiteralPool {

    public static void main( String[] args ) {

        String str1 = "LG CNS";
        String str2 = "LG CNS";
        String str3 = new String( "LG CNS" );
        String str4 = new String( "LG CNS" );
                
        if ( str1 == str2 ) {
            System.out.println( "str1 과 str2는 같은 객체이다" );
        } else {
            System.out.println( "str1 과 str2는 다른 객체이다" );
        }

        if ( str2 == str3 ) {
            System.out.println( "str2 과 str3는 같은 객체이다" );
        } else {
            System.out.println( "str2 과 str3는 다른 객체이다" );
        }

        if ( str3 == str4 ) {
            System.out.println( "str3 과 str4는 같은 객체이다" );
        } else {
            System.out.println( "str3 과 str4는 다른 객체이다" );
        }
        
        if ( str1.equals( str4 ) ) {
            System.out.println( "str1 과 str4는 같은 문자열이다" );
        } else {
            System.out.println( "str1 과 str4는 다른 문자열이다" );
        }
        
    }
}
 