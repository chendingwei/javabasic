package writtenexamination.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberRegular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        String line;
        while (sc.hasNext()){
            str.add(sc.nextLine());
        }
        String cmp = str.remove(str.size()-1);
        int sym = Integer.parseInt(str.remove(str.size()-1));
        String symStr = number(cmp,sym);
        while (!str.isEmpty()){
            String tmp = str.remove(0);
            String res = number(tmp,sym);

            if(res.contains(symStr)){
                System.out.println(tmp);
            }
        }
    }
    public static String number(String str, int sym){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char tmp = str.charAt(i);
            if(sym > Integer.parseInt(tmp+"")){
                res.append(tmp);
            }
        }
        return res.toString();
    }
}
