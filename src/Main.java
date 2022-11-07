public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа. Теоретическая часть.");

        System.out.println("reverseString(\"бродяга\") = " + reverseString("бродяга"));
        System.out.println("chekPalindrome(\"бродяга\") = " + chekPalindrome("бродяга"));
        System.out.println("chekPalindrome(\"довод\") = " + chekPalindrome("довод"));
    }

    public static String reverseString(String line){
        String newline = "";
        for (int i = 1; i <= line.length(); i++) {
            newline = newline + line.charAt(line.length() - i);
        }
        return newline;
    }

    public static boolean chekPalindrome(String line){
        return line.equalsIgnoreCase(reverseString(line));
    }
}