package chap06;

public class EqualsTest {
    public static void main( String[] args ){
                   
        System.out.println( "===================" );       
        System.out.println( "<<equals() method overriding>>" ); 

        Employee emp1 = new Employee( "KIM", 2000 );
        Employee emp2 = new Employee( "KIM", 3000 );
         
        if( emp1.equals(emp2)){
            System.out.println( "동일한 이름의 임직원 입니다." );
        }else{
            System.out.println( "다른 이름의 임직원 입니다." );
        }
         
        MyDate date1 = new MyDate( 6, 9, 2006 );
        MyDate date2 = new MyDate( 6, 9, 2006 );

        if ( date1.equals(date2) ){
            System.out.println("동일한 날짜입니다.");
        }else{
            System.out.println("다른 날짜입니다.");
        }
        
        System.out.println( "===================" );   
        System.out.println( "<<toString() method overriding>>" ); 
        
        System.out.println( emp1 );
        System.out.println( emp1.toString() );
        
        System.out.println( date1 );
        System.out.println( date1.toString() );
    }
    
 }
