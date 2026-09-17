import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mod4 {
    public static void main(String[] args) {

        int sum = 0;

        try {
            File file = new File("numbers.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                int num = sc.nextInt();
                sum = sum + num;
            }

            sc.close();

            System.out.println("Sum = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (InputMismatchException e) {
            System.out.println("Invalid data in file");
        }
    }
}