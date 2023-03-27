public class Perevorot {
    private static void perevorot(){
        String text = "1234";
        StringBuilder text2 = new StringBuilder();
        for (int i = text.length()-1 ;i >= 0; i--){
            text2.append(text.charAt(i));
        }
        System.out.println(text2);
    }
    public static void main(String[]args){
        perevorot();
    }
}
