import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        double hourAngle = (h % 12) * 30 + m * 0.5;
        double minuteAngle = m * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(angle, 360 - angle);
        System.out.println("Angle between hands = " + angle + " degrees");
    }
}
