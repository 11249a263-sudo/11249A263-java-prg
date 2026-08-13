class Student {
    String name;
    int roll, marks;

    Student(String n, int r, int m) {
        name = n;
        roll = r;
        marks = m;
    }

    void display() {
        char grade = marks >= 90 ? 'A' : marks >= 75 ? 'B' : marks >= 60 ? 'C' : 'D';
        System.out.println(name + " " + roll + " " + marks + " Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bhavagna", 101, 92);
        Student s2 = new Student("Anjali", 102, 78);

        s1.display();
        s2.display();
    }
}