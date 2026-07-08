import java.util.Scanner;

public class underStandingStringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Email");
        String str1 = scan.nextLine();

        int indexofAT = str1.indexOf('@');

        String username = str1.substring(0,indexofAT);
        String domain = str1.substring(indexofAT);

        System.out.println("Username is "+username);
        System.out.println("Domain is " +domain);




    }
}
