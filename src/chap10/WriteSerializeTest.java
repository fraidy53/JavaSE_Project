package chap10;

import java.io.*;

public class WriteSerializeTest {

    public static void main( String[] args ) {
        FileOutputStream empOutputFile = null;
        ObjectOutputStream empOutputStream = null;
        
        EmpInfo[] empList = {   new EmpInfo("11111" , "홍길동"),
                                new EmpInfo("22222" , "고길동"),
                                new EmpInfo("33333" , "김길동")
                            }; 
        try{ 
            empOutputFile = new FileOutputStream( "C:/JAVA_DEV/file_test/data.ser"); // data.txt도 가능 
            empOutputStream = new ObjectOutputStream(empOutputFile);
              
            empOutputStream.writeObject(empList);
 
            //객체를 하나하나 write가능 
/*            
            empOutputStream.writeObject(empList[0]);
            empOutputStream.writeObject(empList[1]);*/
            
            empOutputStream.close();
              
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }finally{
            try {
                if( empOutputStream != null )
                    empOutputStream.close();
            } catch ( IOException e ) {
                 e.printStackTrace();
            }
        }
        
    }

}
