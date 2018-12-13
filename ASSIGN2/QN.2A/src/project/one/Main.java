package project.one;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle C1 = new Circle();
        Cylinder P1 = new Cylinder();
        Cylinder P2 = new Cylinder(5,7);
        System.out.println(C1.getArea());
        System.out.println(P1.getArea());
        System.out.println(P2.getArea());
        System.out.println(P1.toString());
    }
}
