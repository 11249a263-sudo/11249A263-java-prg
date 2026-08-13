class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        basicSalary = salary;
    }
}

class PermanentEmployee extends Employee {
    double hra, da;

    PermanentEmployee(int id, String name, double salary, double hra, double da) {
        super(id, name, salary);
        this.hra = hra;
        this.da = da;
    }

    void display() {
        double gross = basicSalary + hra + da;

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        PermanentEmployee e =
            new PermanentEmployee(101, "Rahul", 30000, 5000, 3000);

        e.display();
    }
}
