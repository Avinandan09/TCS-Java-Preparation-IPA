
public class palindromeWithSB {
    public static boolean isPalindrome (String S)
    {
        String reverse = new StringBuilder(S).reverse().toString();
        return S.equals(reverse);
    }    
    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input);
        System.out.println(result);
    }
}
