import java.util.*;

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two employee names: ");
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equalsIgnoreCase(b))
            System.out.println("Both employees are in the same department.");
        else
            System.out.println("Employees are in different departments.");
    }
}
