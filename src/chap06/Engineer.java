package chap06;

public class Engineer extends Employee{
    private String skill;

    public Engineer(){
        
    }
    
    public Engineer( String name, int salary, String skill ){
        super( name, salary );
        this.skill = skill;        
    }
    
    public String getSkill() {
    
        return skill;
    }

    public void setSkill( String skill ) {
    
        this.skill = skill;
    }

    
    public void displayInfo(){
        super.displayInfo();
        System.out.println( "관리부서" + getSkill() );        
    } 

}
