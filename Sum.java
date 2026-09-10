import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("20: ");
        int number1 = input.nextInt();

        System.out.print("30: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of the two integers is: " + sum);

        input.close();
    }
}
20:20 30: 30 The sum of the two integers is: 50
