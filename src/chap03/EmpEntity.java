 /**
 * Class : EmpEntity
 */
package chap03;

/**
 *  사원의 정보를 담는 EmpEntity 클래스
 *
 * @author  LG CNS 기술대학원
 * @version 1.0, 2005/07/01 
 */
public class EmpEntity {
    // 사번을 저장하는 멤버변수
    private String empId;
    
    // 이름을 저장하는 멤버변수
    private String name;
    
    // 전화번호를 저장하는 멤버변수
    private String telephone;
    
    // 주소를 저장하는 멤버변수
    private String address;
    
    // 부서코드를 저장하는 멤버변수
    private String deptName;
 
    /**
     * EmpEntity 클래스의 default 생성자
     *
     */
    public EmpEntity() {
        
    }
    
    /**
     * 모든 정보를 갖는 EmpEntity 클래스의 생성자
     * 
     * @param empId      사번        
     * @param name       사원 이름    
     * @param telephone  전화번호
     * @param address    주소
     * @param deptName   부서명
     */
    public EmpEntity( String empId, String name, String telephone, String address, String deptName  ) {
        setEmpId( empId );
        setName( name );
        setTelephone( telephone );
        setAddress( address );
        setDeptName( deptName );
    }
    
    /**
     *사번에 대한 접근 메소드
     *
     * @return 사번
     */
    public String getEmpId() {
        return empId;
    }
    
    /**
     * 사번에 대한 수정 메소드
     * 
     * @param empId 사번
     */
    public void setEmpId( String empId ) {
        this.empId = empId;
    }

    /**
     * 사원 이름에 대한 접근 메소드
     *
     * @return 사원 이름
     */
    public String getName() {
        if ( name == null )
            return "";
        else
            return name;
    }

    /**
     * 사원 이름에 대한 수정 메소드
     * 
     * @param name 사원 이름
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * 사원 전화번호에 대한 접근 메소드
     * @return 전화번호
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 사원 전화번호에 대한 수정 메소드
     * @param telephone 전화번호
     */
    public void setTelephone( String telephone ) {
        this.telephone = telephone;
    }

    /**
     * 사원 주소에 대한 접근 메소드
     * @return 주소
     */
    public String getAddress() {
        return address;
    }

    /**
     * 사원 주소에 대한 수정 메소드
     * @param address 주소
     */
    public void setAddress( String address ) {
        this.address = address;
    }

    /**
     * 부서명에 대한 접근 메소드
     * @return 부서명
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 부서명에 대한 수정 메소드
     * @param deptName 부서명
     */
    public void setDeptName( String deptName ) {
        this.deptName = deptName;
    }
}
