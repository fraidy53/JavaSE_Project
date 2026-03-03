/*------------------------------------------------------------------------------
 * Name : Employee
 * DESC : 
 * VER  : 1.0
 * PROJ : VCC SE Path
 * Copyright 2006 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                   변        경        사        항
 *------------------------------------------------------------------------------
 *     DATE      AUTHOR                       DESCRIPTION
 *-------------  --------  ----------------------------------------------------- 
 * 2006. 4. 4.  기술대학원  ver1.0 작성
 *----------------------------------------------------------------------------*/

package chap06;
 
public class Employee {
    private String name;
    private double salary;
      
    public Employee(){
    }
    
    public Employee( String name, double salary ) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
    
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName( String name ) {
    
        this.name = name;
    }

    /**
     * @return Returns the salary.
     */
    public double getSalary() {
    
        return salary;
    }

    /**
     * @param salary The salary to set.
     */
    public void setSalary( int salary ) {
    
        this.salary = salary;
    }

    public String toString(){
        return name;
    }
  
    public String getDetails() {
        return "Name: " + name + "\n" +
               "Salary: " + salary;
    }
    
    //Polymorphism 실습을 위하여  추가 
    public void displayInfo(){
        System.out.println( "이름" + name );
        System.out.println( "연봉" + salary );        
    }
      
    //Equals 실습을 위하여  추가 
    public boolean equals( Object obj ){
        boolean isEqual = false;
        
        if ( this == obj ){
            isEqual = true; 
        } else {
            if ( obj instanceof Employee ){
                Employee e = (Employee)obj;
                if ( name.equals( e.getName())){
                    isEqual = true; 
                }
            } 
        }
        return isEqual;
    }
    
}
