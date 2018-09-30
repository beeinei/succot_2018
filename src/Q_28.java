public class Q_28 {

    /*
     * @param a1 = first organ of series
     * @param d = constant difference between organs
     * @param n = number of organs in the series
     * The method prints a numerical series according to the parameters above. Every organ is printed in another line. The first output is a1
     */

    public static void Rec28(int a1, int d, int n) {
        if(n!=1){ //תנאי עצירה. אם אין איבר אחד בסדרה
            n--;
            System.out.println(a1);
            Rec28(a1+d, d, n);
        }
        else{
            System.out.println(a1);
        }
    }

    public static void main(String[] args) {
        Rec28(3, 2, 4);
    }

}
