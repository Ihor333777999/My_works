//User will be given a string:
//“Sender: <James Bond>. From Number: [202-123-3456]. +Message: {“I love programming and problem solving}”>
//        You will separate these parts and print them separately. >
//        Print the following: “Sender:  actualSender” “Number: actualNumber” “Message: actualMessage”
package String;



public class Separate {
    public static void main(String[] args) {

       String info ="Sender: <James Bond>. From Number: [202-123-3456]. +Message: {I love programming and problem solving}";
        int sendersStart = info.indexOf("<") +1;
       int senderEnd = info.indexOf(">");

       int numberStart = info.indexOf("[")+1;
       int numberEnd = info.indexOf("]");

       int messsageStart = info.indexOf("{")+1;
        int messsageEnd = info.indexOf("}");

        String sender = info.substring(sendersStart,senderEnd);
        String number = info.substring(numberStart,numberEnd);
        String message  = info.substring(messsageStart,messsageEnd);

        System.out.println("Sender " + sender);
        System.out.println("Number" + number );
        System.out.println("Message" + message);
    }
}
