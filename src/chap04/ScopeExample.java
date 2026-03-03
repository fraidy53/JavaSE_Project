
package chap04;

public class ScopeExample {
    private int i = 1;

    public void firstMethod() {

        int i = 4, j = 5; 

        this.i = i + j;
        System.out.println( "firstMethod()의 로컬 변수 i ==> " + i );
        System.out.println( "firstMethod()에서의 this.i  ==> " + this.i );

        secondMethod( 7 );
    }

    public void secondMethod( int i ) {

        int j = 8;

        this.i = i + j;
        System.out.println( "secondMethod()의 로컬 변수 i ==> " + i );
        System.out.println( "secondMethod()에서의 this.i  ==> " + this.i );
    }
}
