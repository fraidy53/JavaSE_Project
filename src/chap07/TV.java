
package chap07;

public class TV extends Appliance {

    public TV( String modelNo ){
        super( modelNo );
    } 
    public void volumeUp() {
        System.out.println( "TV º¼·ë¾÷" );
    }

    public void volumeDown() {
        System.out.println( "TV º¼·ë´Ù¿î" );
    } 
  
}
