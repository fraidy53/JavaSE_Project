package chap03;

import chap03.MyDate;

public class TestMyDate{

    public static void main( String[] args){
           MyDate today = new MyDate( 22, 7, 1964 );
           today.print();           
            
         //  TestMyDate test  = new TestMyDate(); 
         //  test.print( today );
    }  
      
    public void print( MyDate day ){
         System.out.println( "The Day is " + 
                                    day.getDay() + "-" +
                                    day.getMonth() + "-" +
                                    day.getYear() 
                                 ); 
    }
           
} 