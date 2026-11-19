import java.util.Scanner;

public class Float {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        float number = sc.nextFloat();

        System.out.println("Your number is: " +number);

        sc.close();
    }
}
