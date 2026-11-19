import java.util.Scanner;

public class DoubleExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("Your height is: " + height);

        sc.close();
    }
}
