package others;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "2";
        String str3 = "2" + "23";
        String str4 = "223";
        String str5 = str4.intern();

        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        System.out.println(str4 == str5);
    }
}
