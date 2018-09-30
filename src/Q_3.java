public class Q_3 {

    /*
     * @param n = positive number
     * הפעולה מחזירה את מכפלת כל המספרים האי זוגיים מ1 ועד n
     * כולל n
     */

    public static int Rec3(int n) {
        if (n==1){
            return 1;
        }else if(n==0){ //יכול לקרוא רק אם הקלט הוא 0
            return 0;
        }else{
            if(n%2==0)
                return Rec3(n-1);
            else
                return (n * Rec3(n-2));
        }
    }

    public static void main(String[] args) {
        System.out.println(Rec3(0));
    }

}
