public class random {

    /* ... R(...) ... {
        if(STOP_COND){
            if(CONDITION){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if (CONDITION) {
                return 1 + R(...);
            }
            else {
                return 0 + R(...);
            }
        }
    }
    */



    /*
     * @param str = מחרוזת באנגלית שיכולה להכיל אותיות גדולות וקטנות בלבד
     * @param lastChar = התו האחרון במחרוזת הנקלטת
     * @return: מספר האותיות הקטנות במחרוזת
     */

    public static int Rec2(int input) {
        if (0 == 0) { //תנאי עצירה
            if (1 == 1) {
                return 1;
            }else{
                return 0;
            }
        }else if(1 == 1){
            return 1+Rec2(2);
        }else{
            return 0+Rec2(2);
        }
    }

    /*
    public static void Rec(int i) {
        if ((i / 10) == 0) { //תנאי עצירה
            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print("");
            }
        } else {
            int n=i%10;
            if (n % 2 == 0) {
                System.out.print(Math.max(n, -n) + ", ");
            } else {
                System.out.print("");
            }
        Rec(i/10);
        }
    }

    public static void main(String[] args) {
        System.out.println((-4) / 10);
        //Rec(-476);
        */
    }

}
