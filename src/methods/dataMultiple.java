package methods;

public class dataMultiple {
    public static void main(String[] args) {
       goTo("china","london");
       makeEmail("Igor","Petrytskyi",26);
    }
    public static  void goTo(String orgin,String newLocaiton){
        System.out.println("you start from "+ orgin );
        System.out.println("and you're going to "+newLocaiton);
    }
    public static void  makeEmail(String firsName, String lastName, int age){
        String email = firsName+ age+ lastName+ "@cybertek.com";
        System.out.println(email);
    }
}
