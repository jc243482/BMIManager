import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by jc243482 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("BMI Manager");
        running: while (true) {
            System.out.println("Please select from the: " +
                    "following menu options:\n" +
                    "\t1. Add new patient\n" +
                    "\t2. View Patient\n" +
                    "\t3. Exit\n");
            System.out.println("Enter Choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            Patient patient = new Patient();
            switch (choice) {
                case 1: {
                    System.out.println("name: ");
                    patient.setName(scanner.nextLine());
                    System.out.println("Age: ");
                    patient.setAge(scanner.nextInt());
                    System.out.println("Height and Weight: ");
                    patient.setDetails(scanner.nextDouble(), scanner.nextDouble());
                    break;
                }
                case 2: {
                    System.out.println(String.format("Name: %s Age: %d BMI: %.2f",
                    patient.getAge(),
                    patient.getName(),
                    patient.getBMI()
                    ));
                    break;
                }
                case 3: {
                    System.out.println("Good bye!");
                    break running;
                }
            }
        }
    }
}
