
package chap07;

public class Radio extends Appliance {

    public Radio( String modelNo ){
        super( modelNo );
    }
    public void volumeUp() {
        System.out.println( "라디오 볼룸업" );
    }  

    public void volumeDown() {
        System.out.println( "라디오 볼룸다운" );
    }
 
} 
 