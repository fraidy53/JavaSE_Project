/*------------------------------------------------------------------------------
 * Name : SubClass
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
public class SubClass extends SuperClass  {
 
    public void method() throws IOException {
        throw new IOException();
    }
 
 
}
