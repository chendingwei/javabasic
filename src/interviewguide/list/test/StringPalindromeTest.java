package interviewguide.list.test;

import interviewguide.list.StringPalindrome;

public class StringPalindromeTest {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abba";
        StringPalindrome strPalindrome = new StringPalindrome();
        boolean res = strPalindrome.isPalindrome(str1);
        System.out.println(res);
        res = strPalindrome.isPalindrome(str2);
        System.out.println(res);
    }
}
