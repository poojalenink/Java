import java.util.Scanner;

public class grade_ca1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "Arun";
        int marks;
        String grade;
        String description;

        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        // Grade calculation
        if (marks >= 90) {
            grade = "A+";
        }
        else if (marks >= 80) {
            grade = "A";
        }
        else if (marks >= 70) {
            grade = "B+";
        }
        else if (marks >= 60) {
            grade = "B";
        }
        else if (marks >= 50) {
            grade = "C+";
        }
        else if (marks >= 40) {
            grade = "C";
        }
        else {
            grade = "F";
        }

        // Grade description
        switch (grade) {

            case "A+":
                description = "Excellent";
                break;

            case "A":
                description = "Very Good";
                break;

            case "B+":
                description = "Good";
                break;

            case "B":
                description = "Average";
                break;

            case "C+":
                description = "Below Average";
                break;

            case "C":
                description = "Poor";
                break;

            default:
                description = "Fail";
        }

        // Output
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Description: " + description);
        System.out.println("Congrats: " + grade);

        sc.close();
    }
}