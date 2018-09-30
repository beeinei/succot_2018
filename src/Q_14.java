public class Q_14 {

    /*
     @param arr = מערך של מספרים שלמים
     @param i = אינדקס במערך
     @Return: סכום האיברים במערך ממקום 0 עד מקום i
    */

    public static int arraySum(int[] arr, int i){
        if(i==0){
            return arr[0];
        }
        else{
            return arr[i] + arraySum(arr, i-1);
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[]{6, 8, 5, 100, 7};
        System.out.println(arraySum(a, 4));
    }
}
