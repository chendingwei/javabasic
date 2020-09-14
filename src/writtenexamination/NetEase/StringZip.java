package writtenexamination.NetEase;

/*
abbbbbbAAAdcdddd

a0cbAAAdc0ad
 */

public class StringZip {
    public String compress (String raw_str) {
        // write code here
        StringBuilder sb = new StringBuilder();
        int consist = 1;
        char pre = 'a';
        for (int i = 0; i < raw_str.length()-1; i++) {
            pre = raw_str.charAt(i);
            if(pre == raw_str.charAt(i+1)){
                consist++;
            }else if(consist ==0){
                sb.append(pre);
            }else if(consist <4){
                for (int j = 0; j < consist; j++) {
                    sb.append(pre);
                }
                consist = 1;
            }else if(consist > 55){
                while (consist > 55){
                    sb.append("0Z");
                    sb.append(pre);
                    consist -= 55;
                }
                if(consist <4) {
                    for (int j = 0; j < consist; j++) {
                        sb.append(pre);
                    }
                    consist = 1;
                } else if(consist >=4){
                    sb.append("0");
                    sb.append((char)('a'+consist-4));
                    sb.append(pre);
                    consist = 1;
                }
            }else {
                sb.append("0");
                sb.append((char)('a'+consist-4));
                sb.append(pre);
                consist = 1;
            }
        }
        if(consist != 1){
            if(consist < 4){
                for (int i = 0; i < consist; i++) {
                    sb.append(pre);
                }
            }else if (consist >= 4 && consist <= 55){
                sb.append("0");
                sb.append((char)('a'+consist-4));
                sb.append(pre);
            }else if(consist > 55){
                while (consist > 55){
                    sb.append("0Z");
                    sb.append(pre);
                    consist -= 54;
                }
                if(consist <4) {
                    for (int j = 0; j < consist; j++) {
                        sb.append(pre);
                    }
                    consist = 1;
                } else if(consist >=4){
                    sb.append("0");
                    sb.append((char)('a'+consist-4));
                    sb.append(pre);
                    consist = 1;
                }
            }
        }
        return sb.toString();
    }
}
