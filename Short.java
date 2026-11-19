import java.util.Scanner;

public class Short {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        short number = sc.nextShort();

        System.out.println("Your number is: " + number);

        sc.close();
    }
}