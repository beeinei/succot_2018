public class Q_21 {

    /*
    * @param str = מחרוזת באנגלית שיכולה להכיל אותיות גדולות וקטנות בלבד
    * @param lastChar = התו האחרון במחרוזת הנקלטת
    * @return: מספר האותיות הקטנות במחרוזת
    */


    public static int smallChar(String str) {
        char lastChar = str.charAt(str.length() - 1); //התו האחרון במחרוזת שנקלטה
        if (str.length() == 1) { //תנאי עצירה: אם המחרוזת הנקלטת בת תו אחד
            if (97 <= lastChar && lastChar <= 122) { //ע״פ טבלת ASCII, ערכי האותיות הקטנות באנגלית הם 97 עד 122 כולל. אם התו האחרון במחרוזת הוא אות קטנה
                return 1;
            }else{
                return 0;
            }
        }else if(97 <= lastChar && lastChar <= 122){
                return 1+smallChar(str.substring(0,(str.length()-1)));
        }else{
                return 0+smallChar(str.substring(0,(str.length()-1)));
        }
    }


    public static void main(String[] args) {
        String tst = "fjbVVVvbx405,AGKSK";
        System.out.println(smallChar(tst));
    }
}