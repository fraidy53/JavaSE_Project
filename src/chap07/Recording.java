package chap07;

public interface Recording {
    public final static String START_MSG = "Recording Started";
    String END_MSG = "Recording Ended";
 
    public abstract void startRecord();
    void stopRecord();
}
