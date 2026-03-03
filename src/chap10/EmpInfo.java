package chap10;

import java.io.Serializable;

public class EmpInfo implements Serializable{
    private String empId;
    private String name;
    
    public EmpInfo( String empId, String name ) {
        this.empId = empId;
        this.name = name;
    }
    /**
     * @return Returns the empId.
     */
    public String getEmpId() {
    
        return empId;
    }
    /**
     * @param empId The empId to set.
     */
    public void setEmpId( String empId ) {
    
        this.empId = empId;
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
    
    

}
