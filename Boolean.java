import java.util.Scanner;

public class Boolean{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a student: ");
        boolean number = sc.nextBoolean();

        System.out.println("student: " +number);

        sc.close();
    }
}
