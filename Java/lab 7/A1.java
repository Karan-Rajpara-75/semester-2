
import java.util.Scanner;

class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
public class A1{
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("Enter a radius:");
        int r=st.nextInt();
        Circle c = new Circle(r);
        System.out.println("Area of Circle = " + c.area());
    }
}
