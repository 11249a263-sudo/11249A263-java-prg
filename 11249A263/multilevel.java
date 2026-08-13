class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
}

class Marks extends Student {
    int[] marks;

    Marks(int r, String n, int[] m) {
        super(r, n);
        marks = m;
    }
}

class Result extends Marks {
    Result(int r, String n, int[] m) {
        super(r, n, m);
    }

    void display() {
        int total = 0;

        for (int m : marks)
            total += m;

        double average = total / 5.0;
        String grade;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 50)
            grade = "C";
        else
            grade = "F";

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Result r = new Result(101, "John",
                new int[]{80, 70, 90, 85, 75});

        r.display();
    }
}