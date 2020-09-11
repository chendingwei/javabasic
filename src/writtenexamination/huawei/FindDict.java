package writtenexamination.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] tmp = str.split(";");
        String[] stand = tmp[1].substring(0,tmp[1].length()-1).split(" ");
        String symStand = tmp[1].substring(tmp[1].length()-1);

        String[] dict = tmp[0].substring(0,tmp[0].length()-1).split(" ");
        String symDict = tmp[0].substring(tmp[0].length()-1);
        int len = stand.length > dict.length? stand.length:dict.length;
        boolean[] cmp = new boolean[len+1];
        for(int i=0;i<stand.length;i++){
            for(int j=0;j<dict.length;j++){
                if(stand[i].equals(dict[j])){
                    if(!cmp[i]){
                        cmp[i] = true;
                    }
                }
            }
        }

        String symTable = ",.!";
        if(symTable.contains(symStand) && symTable.contains(symDict) || symStand.equals(symDict)){
            cmp[cmp.length-1] = true;
        }

        int res = 0;
        for (boolean b : cmp) {
            if(!b){
                res++;
            }
        }
        System.out.println("("+res+","+(stand.length+1)+")");

    }
}
