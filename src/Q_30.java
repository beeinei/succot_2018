public class Q_30 {

    /*
     * @param a = first organ of series
     * @param b = second organ of series
     * @param n = positive number
     * The method prints the N first numbers in a given numeric series
     */

    public static void Rec30(int n, int a, int b) {
        if (n != 0){
            if(n%2==0){
                System.out.println(b);
                Rec30(n-1, a, b+1);
            }
            else{ //if n is odd
                System.out.println(a);
                Rec30(n-1, a+1, b);
            }
        }
    }

    public static void main(String[] args) {
        Rec30(9, 4, 3);
    }

}
