/*------------------------------------------------------------------------------
 * Name : FileTest
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

import java.io.*;

public class FileTest {

    public static void main( String[] args ) {

        File f = new File( "C:/JAVA_DEV/file_test/text.txt" );
 
        System.out.println( "파일여부: " + f.isFile() );
        System.out.println( "디렉토리여부: " + f.isDirectory() );
        System.out.println( "파일이름: " + f.getName() );
        System.out.println( "파일이 있는 디렉토리: " + f.getParent() );
        System.out.println( "디렉토리 포함 파일이름: " + f.getPath() );
        System.out.println( "파일크기: " + f.length() + " bytes" );

        // File 생성.
        File f2 = new File( "C:/JAVA_DEV/file_test/create.txt" );
        try {
            f2.createNewFile();
            System.out.println( f2.getName() + " file이 생성되었습니다." );
        } catch ( IOException e ) {
            System.out.println( f2.getName() + " 생성 에러!!" );
        }

        // 디렉토리 만들기.
        File f3 = new File( "C:/JAVA_DEV/file_test/temp_dir" );
        if ( !f3.exists() ) {
            f3.mkdir();
            System.out.println( f3.getName() + "directory가 생성되었습니다." );
        } else {
            System.out.println( f3.getName() + " directory는  이미 존재합니다." );
        }

        // directory 내 File 생성.
/*        
        File f4 = new File( "C:/JAVA_DEV/temp_dir"  , "create.txt" );
        try {
            f4.createNewFile();
        } catch ( IOException e ) {
            System.out.println( "에러!!!" );
        } 
*/ 
        // 디렉토리 리스트 .
        File list = new File( "C:/JAVA_DEV/file_test/temp_dir" );

        String[] str = list.list();
        System.out.println( "다음 디렉토리 내의 파일 리스트입니다: " + list.getPath() );
        for ( int inx = 0 ; inx < str.length ; inx++ ) {
            System.out.println( str[inx] ); 
        }
    }
}
