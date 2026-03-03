package chap10;

import java.io.*;

public class ReadFile {
    public static void main ( String args[] ) {
        File f = null;
        BufferedReader in = null;
        
        try {
            f = new File( "C:/JAVA_DEV/file_test/text.txt" );
            in = new BufferedReader( new FileReader( f ));
      
           String s; 

            while ( ( s = in.readLine() ) != null ) {
                System.out.println( s );
            }

            in.close();
        } catch ( FileNotFoundException e1 ) {
            System.err.println( "File not found: " + f.getName() );
        } catch ( IOException e2 ){
            e2.printStackTrace();
        } 
    }
}