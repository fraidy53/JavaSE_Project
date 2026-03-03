
package chap06;

public class Manager extends Employee{
    private String department;
 
    public Manager(){
    }  
    
    public Manager( String name, double salary, String department){
        super( name, salary );
        this.department = department;
    } 

    /**
     * @return Returns the department.
     */
    public String getDepartment() {
    
        return department;
    }

    /**
     * @param department The department to set.
     */
    public void setDepartment( String department ) {
    
        this.department = department;
    }
 
    public String getDetails() {
        return super.getDetails()  +     
              "\nManager of: " + department;
   }
     
    //Polymorphism 실습을 위하여  추가 
    public void displayInfo(){
        System.out.println( "이름" + getName() );
        System.out.println( "연봉" + getSalary() );
        System.out.println( "관리부서" + getDepartment() );        
    }

}
 