import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);

        String firstName = readString(myScanner, "Enter your first name:");
        String middleName = readString(myScanner, "Enter your middle name (if none: N/A):");
        String lastName = readString(myScanner,"Enter your last name");

        if (middleName.equalsIgnoreCase("N/A")) {
            System.out.println(firstName + " " + lastName);
        } else System.out.println(firstName + " " + middleName + " " + lastName);

    }

    public static String readString(Scanner in, String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
}
