public class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    public Employee(String name) {
        this.id = 0;
        this.name = name;
        this.salary = 0.0;
    }

    public Employee(String name, double salary) {
        this.id = 0;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Priya", 30000.0);
        Employee e4 = new Employee(101, "Amit", 45000.0);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        e4.displayDetails();
    }
}
