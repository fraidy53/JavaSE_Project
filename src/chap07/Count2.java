package chap07;

public class Count2 {

    private int serialNumber;
    private static int counter = 0;

    public Count2(){
        counter++;
        serialNumber = counter;
    }

    public static int getTotalCount() {
        return counter;
   //     return serialNumber;
    }
}

