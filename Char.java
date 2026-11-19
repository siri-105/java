import java.util.Scanner;

public class Char  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("Your grade is: " +grade);

        sc.close();
    }
}