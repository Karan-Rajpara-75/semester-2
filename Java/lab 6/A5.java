import java.util.Scanner;
class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double increment) {
        salary = salary + increment;
    }

    public void display() {
        System.out.println("Name      : " + name);
        System.out.println("Job Title : " + jobTitle);
        System.out.println("Salary    : " + salary);
        System.out.println("");
    }
}

public class A5 {
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        System.out.print("enter Employee number:");
        int a = st.nextInt();
        if(a==1){
            Employee e1 = new Employee("Amit", "Software Engineer", 45000);
            e1.updateSalary(5000);
            e1.display();
        }
        else if (a==2) {
            Employee e2 = new Employee("Riya", "Manager", 60000);
            e2.updateSalary(8000);
             e2.display();
        }
        else{
            System.out.println("error 404");
        }
    }
}
