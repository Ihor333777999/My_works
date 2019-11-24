package String;

public class not {
    public static void main(String[] args) {

        String world = "Today is a nice day ";

        boolean b =world.startsWith("Today");
        System.out.println(b);
        System.out.println("Not: "+ !b);

        System.out.println((!world.endsWith("day")));
        System.out.println(!world.startsWith("day"));
    }
}
