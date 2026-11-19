import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        byte number = sc.nextByte();

        System.out.println("Your number is: " + number);

        sc.close();
    }
}