import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float base;
        float height;

        System.out.println("Enter the Base Value");
        base = scan.nextFloat();

        System.out.println("Enter the height Value");
        height = scan.nextFloat();

        float result = 0.5F*(base * height);

        System.out.println(result);

    }
}
