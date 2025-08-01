// q2-> take two variables and print the sum of them
import java.util.*;
public class L1Q2 {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        // Calculating the sum
        int sum = a + b;
        
        // Printing the result
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
