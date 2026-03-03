import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown starting number: ");
        int counter = sc.nextInt();
		
		System.out.println("Countdown using while:\n");

        while (counter >= 1) {
            System.out.println(counter);
            counter--;   
        }
        System.out.println("Rocket Launched!");
		
        sc.close();
    }
}