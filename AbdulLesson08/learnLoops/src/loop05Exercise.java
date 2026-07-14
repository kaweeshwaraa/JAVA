import java.util.Scanner;

public class loop05Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        int d = 1;
        int sum = 0;
        // a start term
        // b common difference
        // c how many times
        // d count no of terms


        System.out.println("Enter Start Term");
        a = scan.nextInt();
        System.out.println("Enter Common Different");
        b = scan.nextInt();
        System.out.println("Enter How many times");
        c = scan.nextInt();

        for (; d <= c;d++){

            System.out.println(a);
            a = a + b;
        }








    }
}
