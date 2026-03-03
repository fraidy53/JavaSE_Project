package chap10;

import java.io.*;

public class KeyboardInput {
    public static void main ( String [] args ) {

        String s;

        InputStreamReader ir = new InputStreamReader( System.in );
        BufferedReader in = new BufferedReader( ir );

        System.out.println( "Type ¡®exit¡¯ to exit." );

        try {
            while ( !(s = in.readLine()).equals( "exit" ) ) {
                System.out.println( "Read: " + s );
            }

            in.close();
        } catch ( IOException e ) { 
            e.printStackTrace();
        }
    }
}

