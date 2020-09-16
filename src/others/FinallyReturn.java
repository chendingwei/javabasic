package others;

import java.util.concurrent.ExecutionException;

public class FinallyReturn {
    public int method(int i){
        try {
            i = i / i - 1;
            return i;
        }catch (Exception e){
            return i+1;
        }finally {
            return i+2;
        }
    }

    public static void main(String[] args) {
        FinallyReturn f = new FinallyReturn();
        System.out.println(f.method(0));
        System.out.println(f.method(1));
    }
}
