package project.one;
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }
    public int getYear(){
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date:"+Integer.toString(this.month)+"/"+Integer.toString(this.day)+"/"+Integer.toString(this.year);
    }
}
