
package chap03;

public class MyDate {

    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public MyDate( int day, int month, int year ) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void print() {
        System.out.println( "The Day is " + day + "-" + month + "-" + year );
        //System.out.println( "The Day is " + this.day + "-" + this.month + "-" + this.year );
        //System.out.println( "The Day is " + getDay() + "-" + getMonth() + "-" + getYear() );
    }

    public int getDay() {

        return day;
    }

    public void setDay( int day ) {

        this.day = day;
    }

    public int getMonth() {

        return month;
    }

    public void setMonth( int month ) {

        this.month = month;
    }

    public int getYear() {

        return year;
    }

    public void setYear( int year ) {

        this.year = year;
    }
}
