package classes;

public class Facebook {

    String userName;
    String password;
    String name;
    int age;
    int numOfFriends;

    public Facebook(String userName, String password) {
        this.userName= userName;

        if(password.contains(userName)) {
            System.out.println("Invalid password");
            this.password= "password";
        } else{
            this.password = password;
        }
    }

    public Facebook(String userName, String password, String name) {
        this(userName,password);

        name = name.replace(" ","");

        boolean valid = true;

        for(int i=0; i < name.length(); i++) {
            if(!Character.isLetter(name.charAt(i)))  {
                valid = false;
                break;
            }
        }

        if(valid) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
            this.name = "no name";
        }

    }

    public Facebook(String userName, String password, String name, int age, int numOfFriends){

        this(userName,password,name);

        if(age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }

        if(numOfFriends < 0 || numOfFriends > 5000) {
            System.out.println("Invalid number of friends");
        } else {
            this.numOfFriends = numOfFriends;
        }

    }



}
//
//public class Facebook {
//    String userName;
//    String name;
//    String password;
//    int age;
//    int numOfFriends;
//
//    public void info(){
//        System.out.println("name "+name);
//        System.out.println("age "+age);
//        System.out.println("friends "+numOfFriends);
//
//
//    }
//    public Facebook (String userName,String password){
//        if (password.contains(userName)) {
//            System.out.println("Valid password");
//            this.password="password";
//        }else{
//            this.password=password;
//        }
//    }
//    public Facebook(String userName,String name,String password){
//        this(userName,password);
//        char letter=0;
//        for(int i =0;i<name.length();i++){
//            letter=name.charAt(i);
//        if ((letter>=97||letter<=122)){
//            this.name=name;
//        }else{
//            System.out.println("Invalid");
//        }
//    } }
//    public Facebook( String userName,String name, String password, int age,int numOfFriends){
//        this(userName,name,password);
//        if(numOfFriends<0&&age<0){
//            System.out.println("invalid ");
//            this.age=0;
//            this.numOfFriends=0;
//        }else{
//            this.numOfFriends=numOfFriends;
//            this.age=age;
//        }if(numOfFriends<0 || numOfFriends>5000){
//            System.out.println("invalid");
//        }else{
//            this.numOfFriends=numOfFriends;
//        }
//public boolean sendFriendRequest(FacebookUser userTwo) {
//        if(this.numOfFriends >= 5000) {
//            System.out.println("You reached the limit");
//            return false;
//        } else if(userTwo.numOfFriends >= 5000) {
//            System.out.println(userTwo.name + " has reach the limit of friends");
//            return false;
//        } else {
//            System.out.println("Request sent");
//            this.numOfFriends++;
//            userTwo.numOfFriends++;
//            return true;
//        }
//    }
//    }
//
//
//
//
//}
