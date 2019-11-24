package ScannerAndIncrement;

public class incrementTask1 {
    public static void main(String[] args) {
        int book = 10;

        System.out.println(book++);  //10- then incremented 11
        System.out.println(++book);  //11 increments - then print 12

        System.out.println(book); //12

        System.out.println(book--);//12-11
        System.out.println(--book);//11-10
        System.out.println(book); //10
    }
}
