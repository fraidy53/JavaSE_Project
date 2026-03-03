package chap06;

import chap06.Employee;
import chap06.Manager;
 
public class PolyTest {
    public static void main( String[] args ){
        Employee e1 = new Employee( "Kim" , 2000 );
        Manager m1 = new Manager( "Lee" , 5000 , "총무" );
                 
        e1.displayInfo();   
        System.out.println( "===================" );
        m1.displayInfo();
        
        System.out.println( "===================" );
        System.out.println( "<<Polymorphism Test>>" );

        Employee e2 = new Manager( "Yoo" , 50000 , "교육" );
        e2.displayInfo();
 
        //자식 reference변수는 부모 객체를 가리킬수 없다 - compile error 
       // Manager m2 = new Employee( "Kim" , 2000 );
        //m2.displayInfo();  
 
        System.out.println( "===================" );
        System.out.println( "<<Virtual Method Invocation>>" );
        e2.displayInfo();
        //compile 시에는 type이 부모객체 이기 때문에 
        //자식객체에만 있는 멤버변수나 메서드는 사용할 수 없다 
        //e2.getDepartment();
    }     
}
