import java.util.ArrayList;

public class LearningArrayPlayGround {
    public static void main(String[] args) {

//        String NameArray[] = new String[5];

//        System.out.println(NameArray.length);

        ArrayList<String> stems = new ArrayList<>();

        stems.add("Mom");
        stems.add("tuts");
        stems.add("missy");
        stems.add("neggy");


//        for(int i = 0; i < stems.size();i++){
//            System.out.println(stems.get(i));
//        }

//        for( String x: stems){
//            System.out.println(x);
//        }



        for(String k:stems){
            System.out.println(k);
        }

    }
}
