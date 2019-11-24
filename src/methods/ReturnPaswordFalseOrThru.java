//Create a method for logging in. User passes the username and password as parameters. If the passed values are the same as the given username and password return true, but if either the username or password is invalid return false
//        Username: james123
//        Password: password
package methods;

public class ReturnPaswordFalseOrThru {
    public static void main(String[] args) {
        if(check("james123","password")){
            System.out.println("logged in");
        }else{
            System.out.println("invalid");
        }
    }
    public static boolean check(String username,String password) {
String validUsername ="james123";
String validPassword ="password";
if(validPassword.equals(password)&& validUsername.equals(username)){
    return  true;
}

        return false;
    }
}
