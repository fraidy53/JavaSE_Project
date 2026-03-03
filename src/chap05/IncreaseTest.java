package chap05;

public class IncreaseTest {

    public static void main( String[] args ) {

        //primitive type
        System.out.println( "<< primitive type >> " );
        int[] number = { 10, 20 };
        
        System.out.println( "===Before Increase===" );
        
        for ( int inx = 0 ; inx < number.length ; inx++ ) {
            System.out.println( number[inx] ); 
        }
        
        int[] numTemp = new int[number.length+1];
        System.arraycopy( number, 0, numTemp, 0, number.length );
        numTemp[numTemp.length-1] = 30;       
        number = numTemp;  
        
        System.out.println( "===After Increase===" );
        
        for ( int inx = 0 ; inx < number.length ; inx++ ) {
            System.out.println( number[inx] ); 
        }
        
        //reference type
        System.out.println( "\n<< reference type >> " );
        
        MyDate[] date = {  new MyDate( 1, 2, 2000 ),  new MyDate( 5, 6, 2005 ) };

        System.out.println( "===Before Increase===" );
        
        for ( int inx = 0 ; inx < date.length ; inx++ ) {
            date[inx].print();
        }
         
        MyDate[] temp = new MyDate[date.length + 1];
        System.arraycopy( date, 0, temp, 0, date.length );
        temp[temp.length-1] = new MyDate( 7, 7, 2005 );
        date = temp;

        System.out.println( "===After Increase===" );
        
        for ( int inx = 0 ; inx < date.length ; inx++ ) {
            date[inx].print();
        }
    } 
}
