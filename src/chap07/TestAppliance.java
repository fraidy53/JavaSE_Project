package chap07;

public class TestAppliance {

    public static void main( String[] args ) {

        Radio radio = new Radio( "R-1001" );
        radio.volumeUp();
        /*
        Appliance app = new Radio( "R-2002" );
        app.volumeUp();
        
        Appliance app2 = new MP3( "R-2002" );
        app2.volumeUp();
        
        Appliance app3 = new TV( "R-2002" );
        app3.volumeUp();
         */
        TestAppliance tr = new TestAppliance();
        
        Appliance[] arr = new Appliance[3];
        arr[0] = new Radio( "R-2002" );
        arr[1] = new MP3( "R-2002" );
        arr[2] = new TV( "R-2002" );
        
        for( int inx = 0; inx < arr.length; inx++ ){
            tr.displayVolumeUp( arr[inx ]);
        }   
         
        System.out.println( "<< interface test>>");
        
        MP3 mp3 = new MP3( "R-2006"  ); 
        
        mp3.startRecord();
        mp3.stopRecord();
        
        Recording record = new MP3(  "R-2007" );
        
        record.startRecord();
        record.stopRecord();

    }
    public void displayVolumeUp( Appliance app ){
        app.volumeUp();
    }
}
