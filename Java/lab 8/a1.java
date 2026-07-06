import java.util.Scanner;
class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    Time addTime(Time t) {
        int h = this.hours + t.hours;
        int m = this.minutes + t.minutes;
        int s = this.seconds + t.seconds;

        if (s >= 60) {
            m += s / 60;
            s = s % 60;
        }

        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }
        return new Time(h, m, s);
    }

    void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

public class a1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Time1 (hours minutes seconds): ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.println("Enter Time2 (hours minutes seconds): ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);
        Time result = t1.addTime(t2);
        System.out.print("Result = ");
        result.display();
    }
}