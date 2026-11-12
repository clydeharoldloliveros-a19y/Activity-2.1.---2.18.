import java.util.Scanner;

public class HealthMonitoringSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalCalories = 0;
        int totalWater = 0;
        int systolic = 0;
        int diastolic = 0;
        boolean hasBloodPressure = false;

        while (true) {
            System.out.println("\n=== HEALTH MONITORING SYSTEM ===");
            System.out.println("1. Calorie Monitoring");
            System.out.println("2. Hydration Monitoring");
            System.out.println("3. Blood Pressure Monitoring");
            System.out.println("4. View Summary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter food name: ");
                    String food = input.nextLine();

                    System.out.print("Enter estimated calories: ");
                    double calories =
                        Double.parseDouble(input.nextLine());

                    if (calories > 0) {
                        totalCalories += calories;
                        System.out.println(food + " recorded!");
                        System.out.println(
                            "Total calories: " + totalCalories + " kcal");
                    } else {
                        System.out.println("Enter a positive value.");
                    }
                    break;

                case 2:
                    System.out.print("Enter water intake (mL): ");
                    int water = Integer.parseInt(input.nextLine());

                    if (water > 0) {
                        totalWater += water;
                        System.out.println("Water recorded!");
                        System.out.println(
                            "Total water: " + totalWater + " mL");
                    } else {
                        System.out.println("Enter a positive value.");
                    }
                    break;

                case 3:
                    System.out.print("Enter systolic reading: ");
                    int sys = Integer.parseInt(input.nextLine());

                    System.out.print("Enter diastolic reading: ");
                    int dia = Integer.parseInt(input.nextLine());

                    if (sys > 0 && dia > 0) {
                        systolic = sys;
                        diastolic = dia;
                        hasBloodPressure = true;

                        System.out.println("Reading recorded!");
                        System.out.println(
                            "Blood pressure: " + systolic + "/" + diastolic
                            + " mmHg");
                    } else {
                        System.out.println(
                            "Please enter positive readings.");
                    }
                    break;

                case 4:
                    System.out.println("\n=== DAILY SUMMARY ===");
                    System.out.println(
                        "Total calories: " + totalCalories + " kcal");
                    System.out.println(
                        "Total water: " + totalWater + " mL");

                    if (hasBloodPressure) {
                        System.out.println(
                            "Latest blood pressure: "
                            + systolic + "/" + diastolic + " mmHg");
                    } else {
                        System.out.println(
                            "No blood pressure reading recorded.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    input.close();
                    return;

                default:
                    System.out.println(
                        "Invalid choice. Please select 1 to 5.");
            }
        }
    }
}
