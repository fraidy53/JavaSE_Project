package chap06;

public class PolyTest2 {
    public static void main( String[] args ){
           
        System.out.println( "===================" );
        System.out.println( "<<Heterogeneous Collections + Polymorphic Arguements>>" );
        
        PolyTest2 poly = new PolyTest2();
           
        Employee[] employees = new Employee[3];
        
        employees[0] = new Employee( "Kim" , 2000 );
        employees[1] = new Manager( "Lee" , 5000 , "ÃÑ¹«" );
        employees[2] = new Engineer( "Yoo" , 3000,  "Java " );
        
        for( int inx = 0; inx < employees.length; inx++ ){
            System.out.println( "tax : " + poly.getTax( employees[inx])  );
        }
         
        System.out.println( "===================" );       
        System.out.println( "<<instanceOf + Casting>>" ); 

        for( int inx = 0; inx < employees.length; inx++ ){
            System.out.println( "instanceOf TAX: " + poly.getTax( employees[inx]) );
        } 
        
    }
    
    public double getTax( Employee e ) {
        double tax = 0.0;
           
        if( e instanceof Manager ){
            tax = e.getSalary() * 0.30;
             
            Manager m = (Manager)e;
            if( m.getDepartment().equals("ÃÑ¹«")){
                tax = m.getSalary() * 0.50;
            }
        }else if( e instanceof Engineer ){
            tax = e.getSalary() * 0.20;
        }else{
            tax = e.getSalary() * 0.10;
        }
        
        return tax;
    }

}
