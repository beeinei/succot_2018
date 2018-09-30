public class Q_15 {

    /*
     @param arr = מערך של מספרים שלמים
     @param i = אינדקס במערך. האיבר הראשון במערך מספרו אפס
     @Return: מספר האיברים החיוביים מתחילת המערך עד לi
     הערה: אפס אינו מספר חיובי
    */

    public static int positiveNumbers(int[] arr, int i) {
        if(i==0){ //אם הגענו לאיבר הראשון
            if(arr[i]>0){ //אם הוא חיובי
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if (arr[i]>0) {
                return 1 + positiveNumbers(arr, i-1); //החזר את כמות המספרים החיוביים עד כה + 1
            }
            else {
                return 0 + positiveNumbers(arr, i-1); //החזר את כמות המספרים החיוביים עד כה
            }

        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{9, 50, -7, -77, 59, -5, 3};
        System.out.println(positiveNumbers(a, 4));
    }




}
