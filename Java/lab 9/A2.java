class Employee {
    int salary = 30000;

    void work() {
        System.out.println("Employee is working");
    }

    int getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("HR Manager adds a new employee");
    }
}

public class A2 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}