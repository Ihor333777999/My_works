package arrays;

public class CheckCharacters {
    public static void main(String[] args) {
        String [] emails = {"james843@.com","nohjgg762", "hotogj97@.com"};
        for (int i=0; i<emails.length;i++){
            if(emails[i].contains("@") && emails[i].contains(".")){

                int at = emails[i].indexOf("@");
                int dot = emails[i].indexOf(".");

                if(at <dot){
                    System.out.println("valid");
                }else{
                    System.out.println("invalid ");
                }
            }else{
                System.out.println("invalid");
            }
        }
    }
}
