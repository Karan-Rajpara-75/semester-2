class MyPoint {
    double x;
    double y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double distance(MyPoint p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
}

class ThreeDPoint extends MyPoint {
    double z;

    ThreeDPoint() {
        super(0, 0);
        z = 0;
    }

    ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    double getZ() {
        return z;
    }

    double distance(ThreeDPoint p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2) + Math.pow(p.z - z, 2));
    }
}

public class A5 {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        double d = p1.distance(p2);

        System.out.println("Distance between two points: " + d);
    }
}