import java.util.*;
public class Input_1 {
    public static void main(String[] args) {
        // Input in java
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name without space: ");
        
        String name=sc.next();
// sc.next is not read after the space
        // If you want to read a full line including spaces, use sc.nextLine()
        System.out.println(name);

        System.out.println("Enter your full name with space: ");
        sc.nextLine(); // consume the newline left by next()
        // Now we can read the full line
        String fullName=sc.nextLine();
        System.out.println(fullName);

    }
}
