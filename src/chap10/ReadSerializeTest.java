package chap10;

import java.io.*;

public class ReadSerializeTest {

    public static void main( String[] args ) {
        FileInputStream empInputFile = null;
        ObjectInputStream empInputStream = null;
         
        try{
            empInputFile = new FileInputStream("C:/JAVA_DEV/file_test/data.ser");
            empInputStream = new ObjectInputStream(empInputFile);
            
           EmpInfo[] readList = (EmpInfo[])empInputStream.readObject();

            for ( int inx = 0; inx < readList.length; inx++ ){
                System.out.println( "사번 : " + readList[inx].getEmpId() +
                                    " 이름 : " + readList[inx].getName());
            }
                 
        //객체를 하나하나 읽는 것도 가능    
/*            
            EmpInfo emp = (EmpInfo)empInputStream.readObject();
            EmpInfo emp2 = (EmpInfo)empInputStream.readObject();
   
            
            System.out.println( "사번 : " + emp.getEmpId() +
                    " 이름 : " + emp.getName());
            System.out.println( "사번 : " + emp2.getEmpId() +
                    " 이름 : " + emp2.getName());
*/
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
    }

}
