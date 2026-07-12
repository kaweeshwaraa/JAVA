import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  userInput;
        System.out.println("Enter your no ");
        userInput = scan.nextLine();

        int indexProtocolDot = userInput.indexOf(":");
        int indexOfOrganization = userInput.lastIndexOf(".");

        String protocol = userInput.substring(0,indexProtocolDot);
        String organization = userInput.substring(indexOfOrganization + 1);

        if(protocol.equals("http") ){
            System.out.println("Hyper Text Transfer Protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("file transfer protocol");
        }

        if(organization.equals("com")){
            System.out.println("Commercial");
        } else if (organization.equals("org")) {
            System.out.println("Organization");
        } else if (organization.equals("net")) {
            System.out.println("network");
        }


//
//       if(userInput >= 70){
//           System.out.println("A");
//       } else if (userInput >= 60 && userInput < 70) {
//           System.out.println("B");
//       } else if (userInput >= 50 && userInput < 60) {
//           System.out.println("C");
//       } else if (userInput >= 40 && userInput < 50) {
//           System.out.println("D");
//       }else {
//           System.out.println("F");
//       }
////
//        if (userInput >= 14 && userInput<= 55){
//            System.out.println("He is Young");
//        }else {
//            System.out.println("He is Old");
//        }
//
//        if (userInput % 2 == 0 ){
//            System.out.println("The Number is an Even");
//        }else{
//            System.out.println("The Number is an Odd Number");
//        }



    }
}
