package chap07;

public class MP3 extends Appliance implements Recording{
    
    public MP3( String modelNo){
        super(modelNo);
    }

    public void volumeUp() {
        System.out.println( "MP3 볼룸업" );
    }
 
    public void volumeDown() {
        System.out.println( "MP3 볼룸다운" );
    }

    //interface 실습을 위해 사용 
    public void startRecord() {
        System.out.println( START_MSG );
    }

    public void stopRecord() {
        System.out.println( END_MSG );
    }
 
 }
   