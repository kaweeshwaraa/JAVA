public class ArrayExercise03 {

    public static void main(String[] args) {
        int array1[] = {3,9,7,8,12,6,15,5,4,10};
        int maxElement = array1[0];


        for (int i = 0 ; i < array1.length;i++){

            if(maxElement < array1[i]){
                maxElement = array1[i];
            }

        }

        System.out.println("The maximum value is  "+ maxElement);




    }





}
