/*------------------------------------------------------------------------------
 * Name : MyExceptionTest
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
   
public class MyExceptionTest extends Exception{
    public static void main(String[] args){
        int age = 18;
        
        try{
            if ( age < 19 ){
                throw new MyException( "입장불가." );
                        
            }else{
                System.out.println( "즐겁게 감상하세요~" );
            }  
        } catch( MyException me ){
            System.out.println( "MyException 발생 : " + me );
        } finally{
            System.out.println( "끝~" );
        }
    }
}