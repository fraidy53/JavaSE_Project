package chap05;

public class ArrayCopy {

	public static void main( String[] args ) {
		int[] source = { 1, 2, 3, 4, 5, 6 };
		int[] destination = { 11, 22, 33, 44, 55, 66 };
		 
		System.out.println( "1.primitive" );
		
		System.out.println( " >> before copy" );
		
		for( int inx = 0; inx < destination.length; inx++){
			System.out.print( destination[inx] + " " );
		}
		
		System.arraycopy( source, 0, destination, 1, source.length );
		
		System.out.println( "\n>> after copy" );
		 
		for( int inx = 0; inx < destination.length; inx++){
			System.out.print( destination[inx] + " " );
		}
		
		System.out.println( "\n\n2.reference" );		
	  
		 MyDate[ ] dates = new MyDate[2];                         
		 dates[0] = new MyDate( 5, 2, 2007 );                     
		 dates[1] = new MyDate( 6, 2, 2007 );                     
		                                                          
		 MyDate[] dates2 = new MyDate[3];                         
	                                                              
		 for( int inx = 0; inx < dates.length; inx++){            
			 dates2[inx] = dates[inx];                            
		 }                                                        
                                                                  
		 dates2[2] = new MyDate( 7, 2, 2007 );                    
		                                                          
		 for( int inx = 0; inx < dates2.length; inx++ ){          
		     dates2[inx].print();                                 
		 }		

	}
}
