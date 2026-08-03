import java.util.Scanner;

public class ArrayExercise02 {
    public static void main(String[] args) {
        int array1[] = {3,9,7,8,12,6,15,5,4,10};
        int userValue;
        String isTheValueAvailable = "doesn't match";
        int indexOfTheValue = -1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Cuh Enter the Value cuh : ");
        userValue = scan.nextInt();

       for (int i = 0 ; i < array1.length ; i++){
           if (userValue == array1[i]){
               isTheValueAvailable = "match";
               indexOfTheValue = i;
               break;
           }
           else {
               isTheValueAvailable = "doesn't match";
           }
       }
        System.out.println("The value you enter  " + isTheValueAvailable + "and the index is  " + indexOfTheValue);


    }
}
