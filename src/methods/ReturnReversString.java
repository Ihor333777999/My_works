//Create a method that will accept a String and will reverse your String. Return the reversed String.

        package methods;

public class ReturnReversString {
    public static void main(String[] args) {
        System.out.println(revers("java"));
    }
public static String  revers (String word ){
        String result ="";
        for(int i = word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        return result;
}
}
