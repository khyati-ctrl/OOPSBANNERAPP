import java.util.Scanner;
public class SwapNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
		
		System.out.println("Before swapping, the numbers are " + number1 + " and " + number2);
		
		int temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("After swapping, the numbers are " + number1 + " and " + number2);
		sc.close();
	}
}