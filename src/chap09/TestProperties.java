/*------------------------------------------------------------------------------
 * Name : TestProperties
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

import java.util.*;

public class TestProperties {

    public static void main( String[] args ) {
 
        Properties props = System.getProperties();
        Enumeration prop_names = props.propertyNames();
 
        while ( prop_names.hasMoreElements() ) {
            String prop_name = (String)prop_names.nextElement();
            String property = props.getProperty( prop_name );
            System.out.println( "property '" + prop_name + "' is '" + property + "'" );
        }
    }

}
