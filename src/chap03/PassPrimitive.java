package chap03;

public class PassPrimitive {
    
    public void passValue() {
        int num = 10;
        
        change( num );
        
        System.out.println( num );
    }
    
    public void change( int num ) {
        num = num + 10;
    }

    public static void main( String[] args ) {
        PassPrimitive pp = new PassPrimitive();
        
        pp.passValue();
    }
}