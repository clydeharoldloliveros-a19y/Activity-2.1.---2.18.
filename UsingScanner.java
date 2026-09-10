import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // My first name
        System.out.print("Clyde Harold: ");
        String firstName = input.nextLine();

        // My middle name
        System.out.print("Lastra: ");
        String middleName = input.nextLine();

        // My last name
        System.out.print("Oliveros: ");
        String lastName = input.nextLine();

        // My age
        System.out.print("19: ");
        int age = input.nextInt();

        // Display the user's information
        System.out.println("\nYour information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);

        // Close the Scanner
        input.close();
    }
}
Clyde Harold
Lastra
Oliveros
19
