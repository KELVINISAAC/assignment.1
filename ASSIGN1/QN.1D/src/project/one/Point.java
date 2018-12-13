package project.one;

public class Point {
    private int x = 0;
    private int y = 0;


    public Point(){

    }
    public Point(int a, int b){
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +Integer.toString(this.x) +"," +Integer.toString(this.y) +")" ;
    }




}
