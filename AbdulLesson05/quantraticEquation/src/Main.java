import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c;
        double  r1,r2;

        System.out.println("Enter 3 values:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        r1 = (-b + Math.sqrt((b*b) - 4 * a * c))/(2*a);
        r2 = (-b - Math.sqrt((b*b) - 4 * a * c))/(2*a);

        System.out.println("Roots are " + r1 + r2);

    }
}
