import java.util.Scanner;

public class Siri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Your name is: " + name);

        sc.close();
    }
}
# arithematic operations

public class sub {
    public static void main(String[] args) {
        java.util.Scanner r = new java.util.Scanner(System.in);

        System.out.print("enter your first value : ");
        int A = r.nextInt();

        System.out.print("enter your second value : ");
        int B = r.nextInt();

        int C = A + B;
        int D = A - B;
        int E = A * B;
        int F = A / B;

        System.out.println("this will be your addition : " + C);
        System.out.println("this will be your subtraction : " + D);
        System.out.println("this will be your multiplication : " + E);
        System.out.println("this will be your division : " + F);

        r.close();
    }
}

#implicite function
public class sub {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.print(b);
        
    }
}
 

#local
public class Siri {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
    }
}

public class sub {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if(a>b) && (b>a){
            
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");

        }
    }
}
#static
public class Siri {
    static int number = 10;

    public static void main(String[] args) {
        System.out.println(number);
    }
}

#instance
public class Siri {
    int number = 10;

    public static void main(String[] args) {
        Siri obj = new Siri();
        System.out.println(obj.number);
    }
}

public class post {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a+2);
        int b=9;
        System.out.println(b);
        System.out.println(b--);
        
    }
}


public class post {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a);
        System.out.println(++a);
        int b=9;
        System.out.println(b);
        System.out.println(--b);
        
    }
}

public class sub {
    int a=10;
    public static void main(String[] args) {

        sub ref = new sub();
        System.out.println(ref.a);
        System.out.println(--ref.a);

        int b=9;
        System.out.println(b);
        System.out.println(--b);
        
    }
}
public class sub {
    int a=10;
    public static void main(String[] args) {

        sub ref = new sub();
        System.out.println(ref.a);
        System.out.println(--ref.a);

        int b=9;
        System.out.println(b);
        System.out.println(++b);
        int c=10;
        System.out.println(c);

        
        System.out.println(!(b==c));
        
        
    }
}