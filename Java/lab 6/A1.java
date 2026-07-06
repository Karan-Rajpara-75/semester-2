 
import java.util.Scanner;

class Student {
    private String name;
    private int roll_no;
    private double SPI;
    private String course;
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }
    public void setSPI(double SPI) {
        this.SPI = SPI;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return roll_no;
    }
    public double getSPI() {
        return SPI;
    }
    public String getCourse() {
        return course;
    }
}
public class A1 {
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        Student s1 = new Student();
        s1.setName("Karan");
        s1.setRollNo(181);
        s1.setSPI(9.5);
        s1.setCourse("Computer Engineering");

        Student s2 = new Student();
        s2.setName("Pari");
        s2.setRollNo(802);
        s2.setSPI(1.1);
        s2.setCourse("Information Technology");

        Student s3 = new Student();
        s3.setName("Krishiv");
        s3.setRollNo(303);
        s3.setSPI(4.8);
        s3.setCourse("Mechanical Engineering");
        System.out.print("enter student roll number:");
        int a = st.nextInt();
        if(a==181){
            displayStudent(s1);
        }
        else if (a==802) {
            displayStudent(s2);
        }
        else if (a==303){
            displayStudent(s3);
        }
        else{
            System.out.println("error 404");
        }

    }
    public static void displayStudent(Student s) {
        System.out.println("Name    : " + s.getName());
        System.out.println("Roll No : " + s.getRollNo());
        System.out.println("SPI     : " + s.getSPI());
        System.out.println("Course  : " + s.getCourse());
        System.out.println();
    }
}
