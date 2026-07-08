import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float length,breadth,height,volume;

        System.out.println("Enter length : ");
        length = scan.nextFloat();

        System.out.println("Enter breadth : ");
        breadth = scan.nextFloat();

        System.out.println("Enter height : ");
        height = scan.nextFloat();

        volume = length * breadth * height;

        System.out.println("The volume is " + volume);



    }
}
