package others;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] m = {1,2,3};
        int[] n = {2,3,4};
        int[] res = new int[m.length+n.length];
        System.arraycopy(m,0,res,0,m.length);
        System.arraycopy(n,0,res,m.length,n.length);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
