public class Q_26 {

    /*
     * @param i = integer
     * @param
     * The method prints the even digits of i in reverse order. 0 is even.
     */

    public static void Rec26(int i) {
        if (i / 10 == 0) { //תנאי עצירה
            if (i % 2 == 0) {
                System.out.println(Math.max(i, -i));
            } else {
                System.out.print("");
            }
        } else {
            int n=i%10;
            if (n % 2 == 0) {
                System.out.println(Math.max(n, -n)); //הדפס את n. מכיוון שזוהי ספרה, יש לוודא שהיא חיובית
            } else {
                System.out.print("");
            }
            Rec26(i/10);
        }
    }

    public static void main(String[] args) {
        Rec26(1234567);
    }

}
