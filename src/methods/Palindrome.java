package methods;

public class Palindrome {
    public static void main(String[] args) {
        String check = "Nurses run";

        String [] checkArray = check.split(" ");
        String pattern = check.toLowerCase().trim();

        String reversed ="";
        boolean result = true;

        for ( int i = pattern.length()-1; i>=0; i--) {
            reversed = reversed + pattern.charAt(i);

        }
        reversed = reversed.replaceAll(" ","");
        System.out.println(reversed);
        for (String words : checkArray) {
            if (reversed.contains(words)){
                result= true;

            }else {
                result = false;
    }
}
        System.out.println(result);
    }
}