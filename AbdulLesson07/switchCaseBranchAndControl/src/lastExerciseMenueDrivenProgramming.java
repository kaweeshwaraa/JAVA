import java.util.Scanner;

public class lastExerciseMenueDrivenProgramming {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput1,userInput2;

        System.out.println("MENU");
        System.out.println("=========================");
        System.out.println("1.ADD\n2.SUB\n3.Mul\n4.DIV");
        System.out.println("Enter Your no1 :");
        userInput1 = scan.nextInt();
        System.out.println("Enter Your no2 :");
        userInput2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Option in words :");
        String userInputOption = scan.nextLine();




        switch (userInputOption){
            case "ADD":{
                System.out.println(userInput1 +  " + " + " " + userInput2 + " " + " = " + (userInput1 + userInput2) );
                break;
            }
            case "SUB":{
                System.out.println(userInput1 +  " - " + " " + userInput2 + " " + " = " + (userInput1 - userInput2));
                break;
            }
            case "MUL":{
                System.out.println(userInput1 +  " * " + " " + userInput2 + " " + " = " + (userInput1 * userInput2));
                break;
            }
            case "DIV":{
                System.out.println(userInput1 +  " / " + " " + userInput2 + " " + " = " + (userInput1 / userInput2));
                break;
            }

        }
    }
}
