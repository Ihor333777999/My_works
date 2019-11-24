package arrays;

public class Space {
    public static void main(String[] args) {
        String[] words = {"knife","dor bell","good", "good bed"};
        for (int i =0 ; i <words.length; i++){
            if(words[i].trim().contains(" ")){
                System.out.println(words[i]);
            }
        }
    }
}
