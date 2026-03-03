
package chap07;


public class FinalVarTest {

    public final int FINAL_NUM;
    
    public FinalVarTest(){
        FINAL_NUM = 10;
    }
    
    public static void main( String[] args){
        FinalVarTest ft = new FinalVarTest();
        System.out.println( ft.FINAL_NUM );
        
        //ft.num = 20; 
        
    }
    
}
