package chap07;

public class TestCount {
    public static void main( String[] args ){
        System.out.println( "Number of counter is " + Count.counter );
        
        Count count1 = new Count();
        
        System.out.println( "Number of counter is " + Count.counter );
        System.out.println( "count1.counter  is " + count1.counter );
                   
        Count count2 = new Count();
        
        System.out.println( "Number of counter is " + Count.counter );
        System.out.println( "count2.counter  is " + count2.counter );
    } 
}  
