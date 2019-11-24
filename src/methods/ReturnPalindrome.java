//Create a method that will take a String as a parameter and return if the String is palindrome or not
package methods;

public class ReturnPalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
    }
    public  static  boolean palindrome (String word){
        if(ReturnReversString.revers(word).equals(word)){
            return true;

        }
        return false;
    }
}
