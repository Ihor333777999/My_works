//Write a method that will take three arguments: the hour, the minutes, and a boolean ( AM will be true, PM will be false)
//        Use the given information to print out the time in this format:
//        Hours : minutes amOrPM
package methods;

public class AmPm {
    public static void main(String[] args) {
        printTheTime(3,45 ,false);
    }
    public static void printTheTime(int hour, int minutes, boolean amOrPM) {
        if((hour > 0 && hour < 13) && (minutes >= 0 && minutes < 60)) {
            String date = hour + " : " + minutes;
            if(amOrPM) {
                date += " AM";
            } else {
                date += " PM";
            }
            System.out.println(date);
        } else {
            System.out.println("Invalid data");
        }


    }
}
