import java.util.Scanner;

class student
{
    int id;
    int registered;
    int[] subject_code;
    int[] subject_credits;
    int[] grade_obtained;
    double spi;
    
    student(int id,int n)
    {
        this.id=id;
        this.registered=n;
        subject_code=new int[n];
        subject_credits=new int[n];
        grade_obtained=new int[n];
    }

    void total_spi()
    {
        int totalCredits = 0;
        int totalPoints = 0;

        for(int i = 0; i < registered; i++)
        {
            totalCredits += subject_credits[i];
            totalPoints += subject_credits[i] * grade_obtained[i];
        }

        spi= (double) totalPoints / totalCredits;
    }
}
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        student[] s = new student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int sub = sc.nextInt();

            s[i] = new student(id, sub);

            for (int j = 0; j < sub; j++) {
                System.out.print("Enter Subject Code: ");
                s[i].subject_code[j] = sc.nextInt();

                System.out.print("Enter Subject Credit: ");
                s[i].subject_credits[j] = sc.nextInt();

                System.out.print("Enter Grade Obtained: ");
                s[i].grade_obtained[j] = sc.nextInt();
            }

            s[i].total_spi();
        }

        System.out.println("\nStudent SPI Details");
        for (int i = 0; i < n; i++) {
            System.out.println("Student ID: " + s[i].id + " SPI: " + s[i].spi);
        }
    }
}