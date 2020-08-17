package others;

import java.util.Stack;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("123");
        System.out.println(sb);
        sb.insert(0, "456");
        System.out.println(sb);

    }
}

