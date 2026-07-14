import java.util.Scanner;

public class loop03Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput,answer = 0;

        System.out.println("Enter Your No");
        userInput =  scan.nextInt();


        for(int i =userInput;userInput< userInput;userInput--){
            answer = userInput * (userInput - 1);
        }
        System.out.println(answer);
    }
}
