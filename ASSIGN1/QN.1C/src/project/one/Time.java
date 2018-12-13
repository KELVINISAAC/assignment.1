package project.one;
public class Time {
    private int seconds =0;
    private int minutes =0;
    private int hours =0;

   public Time(){

    }
    public Time( int s, int m, int h){
        seconds=s;
        minutes=m;
        hours=h;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecond(int seconds) {
        this.seconds = seconds;
    }
    public String toString(){
        return "hours" +Integer.toString(this.hours)+ ":" +Integer.toString(this.minutes)+ ":" +Integer.toString(this.seconds);
    }
    public void setTime(int seconds, int minutes, int hours){
       this.seconds=seconds;
       this.minutes=minutes;
       this.hours=hours;
    }
}
