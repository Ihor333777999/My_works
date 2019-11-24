//Write a method that will tell you if it is the weekday or not. The method takes a String, Saturday and Sunday are the only weekend days
package methods;

public class ReturnWeekday {
    public static void main(String[] args) {
        System.out.println(isWeekday("sat"));
    }
    public static boolean isWeekday(String day) {
        day = day.toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
            case "saturday":
            case "sunday":
                return false;
            default:
                System.out.println("Invalid day provided");
                return false;
        }
    }
//        System.out.println(weekday("Monday"));
//    }
//    public static  boolean weekday(String day){
//        day =day.toLowerCase();
//        if (day.contains("Saturday") || day.contains("Sunday")){
//            System.out.println("it is a not wek day");
//            return false;
//        }
//        System.out.println("it is a  week day ");
//        return true;
//    }
}
