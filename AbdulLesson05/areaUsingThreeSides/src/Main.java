import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a,b,c,s,area;

        System.out.println("Enter side a ");
        a = scan.nextFloat();

        System.out.println("Enter side b ");
        b = scan.nextFloat();

        System.out.println("Enter side c ");
        c = scan.nextFloat();

        s = 0.5f*(a+b+c);

        area = (float) Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println(area);
    }

}
