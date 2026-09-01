import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalClasses;
        double percentage;
        int attendedClasses;
        System.out.println("totalClasses ");
        totalClasses = sc.nextInt();

        System.out.println("attendedClasses ");
        attendedClasses = sc.nextInt();

        percentage = ((double) attendedClasses / totalClasses) * 100;
        System.out.println("totalClasses " + totalClasses);
        System.out.println("attendedClasses " + attendedClasses);
        System.out.println("percentage " + percentage);

        sc.close();
    }
}