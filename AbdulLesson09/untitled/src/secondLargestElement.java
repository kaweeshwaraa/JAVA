public class secondLargestElement {
    public static void main(String[] args) {
        int array1[] = {3,9,7,8,12,6,15,5,4,10};
        int maxElement = array1[0];
        int secondElement = array1[1];;

        for (int i = 0 ; i < array1.length;i++){

            if(maxElement < array1[i]){
                maxElement = array1[i];
            }

        }

        for (int i = 0 ; i < array1.length;i++){

           if(array1[i] < maxElement && array1[i]> secondElement ){
               secondElement = array1[i];
           }

        }

        System.out.println("The Second Largest Element is " + secondElement + " cuh ");

    }
}
