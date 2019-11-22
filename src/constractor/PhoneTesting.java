package constractor;

public class PhoneTesting {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone","gold");
        phone.info();
        Phone sumsung = new Phone("Samsung","blue",89,true);
        sumsung.info();
        System.out.println("------------");
        sumsung.text(1234567876,"hello");
        sumsung.info();
    }
}
