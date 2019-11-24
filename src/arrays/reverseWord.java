//Given the String: “It started to snow in Chicago”
//        Reverse each individual word and print the result
//        > expected output:
//        tI detrats ot wons ni ogacihC
package arrays;

public class reverseWord {
    public static void main(String[] args) {
        String city = "It started to snow in Chicago";
        String [] word = city.split(" ");
        String finalString = "";
        for(String words : word){
           String rev = "";
           for (int i=words.length()-1;i>=0;i--){
               rev+=words.charAt(i);
           }
           finalString+=rev+" ";
        }
        System.out.println(finalString);
    }
}
