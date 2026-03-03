
package chap04;

public class StringExample {
  
    public static void main( String[] args ) {

        String str1 = "LG CNS";
        String str2 = new String( "LG CNS" );
        String str3 = "lg cns";

        // 같은 문자열인지 비교 equals()
        if ( str1.equals( str2 ) ) {
            System.out.println( "str1 과 str2는 같은 문자열이다" );
        } else {
            System.out.println( "str1 과 str2는 다른 문자열이다" );
        }
  
        // 같은 문자열인지 비교 equals()
        if ( str1.equals( str3 ) ) {
            System.out.println( "str1 과 str3는 같은 문자열이다" );
        } else {
            System.out.println( "str1 과 str3는 다른 문자열이다" );
        }

        // 대소문자 관계 없이 문자열 비교 equalsIgnoreCase()
        if ( str1.equalsIgnoreCase( str3 ) ) {
            System.out.println( "str1 과 str3는 같은 문자열이다" );
        } else {
            System.out.println( "str1 과 str3는 다른 문자열이다" );
        }

        // 문자열 크기 비교 compareTo()
        if ( str1.compareTo( str3 ) == 0 ) {
            System.out.println( "str1 과 str3는 같은 문자열이다" );
        } else if ( str1.compareTo( str3 ) > 0 ) {
            System.out.println( "str1 이 str3보다 크다" );
        } else {
            System.out.println( "str1 이 str3보다 작다." );
        }
    }
}
