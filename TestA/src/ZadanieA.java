import java.util.Scanner;

public class ZadanieA {


         public static int testA (String s){
             int m = 0;
             char[] array = s.toCharArray();
             int a;
             for (int i = 0; i < array.length; i++) {
                 int min = array[i];
                 int index = i;
                 for (int j = i + 1; j < array.length; j++) {
                     if (array[j] < min) {
                         min = array[j];
                         index = j;
                     }
                 }
                 if (i != index) {
                     a = array[i];
                     array[i] = (char) min;
                     array[index] = (char) a;
                 }
                 m = Integer.parseInt(new String(array));
             }
             return m;
         }
         public static int perevorot ( int a){
             String s = Integer.toString(a);
             int M = 0;
             StringBuilder text2 = new StringBuilder();
             for (int i = s.length() - 1; i >= 0; i--) {
                 text2.append(s.charAt(i));
                 String m = text2.toString();
                 M = Integer.parseInt(m);

             }
             return M;
         }
         public static int xxx ( int a, int b){
             int k = b - a;
             return k;
         }
         public static void TestA(String s) {

             System.out.println(xxx( testA(s),perevorot(testA(s))));

         }
    public static void main (String[] args) {
       String s = "1746";
        TestA(s);
    }
}
