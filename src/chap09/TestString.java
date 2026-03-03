/*------------------------------------------------------------------------------
 * Name : TestString
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

public class TestString {

    public static void main( String[] args ) {

                      // 012345678901234567
        String s = "LG CNS VCC SE Path";

        System.out.println( s.substring( 3, 6 ) );
        System.out.println( s.substring( 7 ) );
        System.out.println( s.substring( 11, 18 ) );
        System.out.println( s.indexOf( "C", 4 ) );
        System.out.println( s.charAt( 14 ) );
        
        s.concat( " Student" );
        System.out.println( s );
        
        s = s.concat( " Student" );
        System.out.println( s );
       
        String str1 = "abc";
        String str2 = "ABC";
        
        if( str1.equals( str2 )){
            System.out.println( "equals test : str1과 st2는 같은 string입니다." );
        }else{
            System.out.println( "equals test : str1과 st2는 다른 string입니다." );            
        }

        if( str1.equalsIgnoreCase( str2 )){
            System.out.println( "equalsIgnoreCase test : str1과 st2는 같은 string입니다." );
        }else{
            System.out.println( "equalsIgnoreCase test : str1과 st2는 다른 string입니다." );            
        }

        if( str1.compareTo( str2 ) < 0 ){
            System.out.println( "compareTo test : str1는 st2보다 문자 순서가 빠릅니다." );
        }else{
            System.out.println( "compareTo test : str1는 st2보다 문자 순서가 빠르지 않습니다." );            
        }
       
    }
}
 