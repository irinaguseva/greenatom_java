public class PalindromeChecker {
    public static boolean isPalindrome(String str) {

        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "А роза упала на лапу Азора";
        if (isPalindrome(str)) {
            System.out.println(str + " является палиндромом");
        } else {
            System.out.println(str + " не является палиндромом");
        }
    }
}
