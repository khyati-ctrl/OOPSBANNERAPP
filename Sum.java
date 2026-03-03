import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // stores sum
        double number;        // stores user input

        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        while (number != 0) {
            total = total + number;   // add to total

            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble(); // ask again
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }
}