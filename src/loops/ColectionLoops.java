package loops;

public class ColectionLoops {
    public static void main(String[] args) {
        int [] nambers = {2,3,4,54,};
//        //tradition loop
//        for (int i =0;i<nambers.length;i++){
//            if(nambers[i]%2==0){
//            System.out.println(nambers[i]);
//        }
//
//        System.out.println();
//        //each loop
//        for (int numbers :nambers){
//            if (numbers%2==0){
//
//            }
//        }
//            System.out.println(nambers[i]);
//        }
//        Write a program and create String array called cities. Initialize the cities with cities below:
//        Chicago, New York, Madison, Miami, Washington
//        Iterate through each city and check if Chicago is inside the cities.
//                Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.
        String [] c = {"chicago", "new york","madison", "miami","chicago"};
        boolean check = false;
int count =0;
        for (String city : c){
            if (city.equals("chicago")){
                check = true;
                count++;
            }
        }
        if (check){
            System.out.println("windy chicago "+ count+" times");
        }else{
            System.out.println("nit found");
        }
    }

}
