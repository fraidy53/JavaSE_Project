public class TestMovie {
	public static void main( String[] args ) {
    	   Movie m1 = new Movie();
          m1.setTitle( "킹콩2" );
          m1.playMovie() ;
          String title = m1.getTitle();
          System.out.println( "영화 제목은 " + 
                                      title + "입니다.");
    }
}