import java.util.Scanner;

public class recapOfHell {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height;

        System.out.println("Welcome to the RollerCoaster");
        System.out.println("What is your height");
        height = scan.nextInt();

        if (height > 120){
            System.out.println("You can ride the rollercoaster");
        }else{
            System.out.println("You can't ride the rollercoaster");
        }

    }





}
