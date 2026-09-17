class Student {
    protected int rollNo;
    protected String name;
    protected int marks;

    // Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void displayStudent() {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Name         : " + name);
        System.out.println("Marks        : " + marks);
    }
}

class PGStudent extends Student {
    String specialization;
    int semester;

    // Constructor
    PGStudent(int rollNo, String name, int marks,
              String specialization, int semester) {
        super(rollNo, name, marks);
        this.specialization = specialization;
        this.semester = semester;
    }

    // Display all details
    void displayPGStudent() {
        displayStudent();

        System.out.println();
        System.out.println("PG Student Details");
        System.out.println("------------------");
        System.out.println("Specialization : " + specialization);
        System.out.println("Semester       : " + semester);
    }
}

public class studentdetails {
    public static void main(String[] args) {
        PGStudent student = new PGStudent(
            21, "Neha", 89, "AI & ML", 2
        );

        student.displayPGStudent();
    }
}