public class ArrayExercise04 {
    public static void main(String[] args) {
        int array2D [][] = new int[2][3];
        int array2B [][] = {{2,9,5} ,{4,7,8} , {8,1,5}};


        for (int x[] : array2B){
            for (int y:x){
                System.out.print(y + " ");
            }
            System.out.println(" ");
        } 
    }
}
