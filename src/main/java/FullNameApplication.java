import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);

        String firstName = readString(myScanner, "Enter your first name:");
        String middleName = readString(myScanner, "Enter your middle name:");
        String lastName = readString(myScanner,"Enter your last name");
        String suffix = readString(myScanner, "Enter your suffix");

        if (middleName.isEmpty() && suffix.isEmpty()) {
            System.out.printf(firstName + " " + lastName);
        } else if (suffix.isEmpty()) {
            System.out.println(firstName + " " + middleName + " " + lastName);
        } else if (middleName.isEmpty()) {
            System.out.println(firstName + " " + lastName + ", " + suffix);
        } else{
            System.out.println(firstName + " " + middleName + " " + lastName + ", " + suffix);
        }

    }

    public static String readString(Scanner in, String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
}
