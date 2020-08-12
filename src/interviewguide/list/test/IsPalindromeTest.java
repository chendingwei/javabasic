package interviewguide.list.test;

import interviewguide.list.IsPalindrome1;

public class IsPalindromeTest {
    public static void main(String[] args) {
        IsPalindrome1 isPalindrome1 = new IsPalindrome1();
        for (int i = 2; i <5 ; i++) {
            isPalindrome1.add(i);
        }
//
//        boolean res = isPalindrome1.isPalindrome();
//        System.out.println(res);

        for (int i = 4; i >=0 ; i--) {
            isPalindrome1.add(i);
        }
        boolean res = isPalindrome1.isPalindrome();
        System.out.println(res);

        isPalindrome1.toPrint();
    }
}
