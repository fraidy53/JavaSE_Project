/*------------------------------------------------------------------------------
 * Name : ReadFile
 * DESC : 
 * VER  : 1.0
 * PROJ : VCC SE Path
 * Copyright 2006 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                   변        경        사        항
 *------------------------------------------------------------------------------
 *     DATE      AUTHOR                       DESCRIPTION
 *-------------  --------  ----------------------------------------------------- 
 * 2006. 9. 6.  기술대학원  ver1.0 작성
 *----------------------------------------------------------------------------*/

package chap08; 

import java.io.*;

/**
 * @author 기술대학원
 *
 */
public class ReadFile {
    public static void main ( String [] args ) {
        BufferedReader in = null;
        try { 
            in = new BufferedReader( new FileReader( "c:/data/test.txt" ) );  
            String s;
            while ( ( s = in.readLine() ) != null ) 
                System.out.println( s );  
        } catch ( FileNotFoundException e ) {
            System.out.println("파일이 없습니다.");   
        } catch ( IOException e ) {          
            e.printStackTrace();   
        } finally {       
            try {          
                if ( in != null )         
                    in.close(); 
            } catch ( IOException e ) { }    
        } 
    }
}

