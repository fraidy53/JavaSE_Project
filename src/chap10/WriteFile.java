package chap10;

import java.io.*;

public class WriteFile {
    public static void main ( String args[] ) {

        try {
            BufferedReader in
                = new BufferedReader(new FileReader( "C:/JAVA_DEV/file_test/text.txt" ));
 
            PrintWriter out 
                = new PrintWriter(new FileWriter( "C:/JAVA_DEV/file_test/text2.txt" ));

            String s;

            while ( ( s = in.readLine() ) != null ) {
                out.println( s );
            }

            in.close();
            out.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
} 

