import java.util.Scanner;

public class ScanAndConvert {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // final grade in Java
        System.out.print("95: ");
        String javaGrade = input.nextLine();

        // final grade in C++
        System.out.print("95: ");
        String cppGrade = input.nextLine();

        // final grade in C#
        System.out.print("90: ");
        String csharpGrade = input.nextLine();

        // Convert String values into double
        double java = Double.parseDouble(javaGrade);
        double cpp = Double.parseDouble(cppGrade);
        double csharp = Double.parseDouble(csharpGrade);

        // Compute the average
        double average = (java + cpp + csharp) / 3;

        // Display the results
        System.out.println("\nFinal Grades");
        System.out.println("Java: " + java);
        System.out.println("C++: " + cpp);
        System.out.println("C#: " + csharp);
        System.out.println("Total Average: " + average);

        input.close();
    }
}
