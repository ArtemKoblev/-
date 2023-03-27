import java.util.Scanner;

public class TestA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("6145");
        char[] s = Integer.toString(scanner.nextInt()).toCharArray(); //Читаем число и конвертим в чар.
        for (int i = 0; i < s.length; i++) { //Сортим пузырем
            int min = Character.getNumericValue(s[i]);
            int min_i = i;
            for (int j = i + 1; j < s.length; j++) {
                if (Character.getNumericValue(s[j]) < min) {
                    min = Character.getNumericValue(s[j]);
                    min_i = j;
                }
            }
            if (i != min_i) {
                char tmp = s[i];
                s[i] = s[min_i];
                s[min_i] = tmp;
            }
        }
        int summ = Character.getNumericValue(s[0]) + Character.getNumericValue(s[s.length - 1]); //суммируем первое и последнее
        System.out.println(summ);
    }
}
