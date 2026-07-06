class Area {
    static final double PI = 3.14159;

    static double circleArea(double r) {
        return PI * r * r;
    }
}

public class a4 {
    public static void main(String[] args) {
        double radius = 5;
        System.out.println("Area of Circle: " + Area.circleArea(radius));
    }
}