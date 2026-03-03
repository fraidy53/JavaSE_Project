/*------------------------------------------------------------------------------
 * Name : UseBoth
 * DESC : 
 * VER  : 1.0
 * PROJ : VCC SE Path
 * Copyright 2006 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                   변        경        사        항
 *------------------------------------------------------------------------------
 *     DATE      AUTHOR                       DESCRIPTION
 *-------------  --------  ----------------------------------------------------- 
 * 2006. 6. 24.  기술대학원  ver1.0 작성
 *----------------------------------------------------------------------------*/

package chap06;

/**
 * @author 기술대학원 
 *
 */
public class UseBoth {

    public static void main( String[] args ){
        Parent p1 = new Parent();
        Parent p2 = new Child();
        p1.doSomething();
        p2.doSomething();  
    }  
}
