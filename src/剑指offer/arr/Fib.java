package 剑指offer.arr;

public class Fib {
    //递归方法
    public int fib1(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib1(n-1)+fib1(n-2);
    }

    //求和法
    public int fib(int n){
        if(n <1){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int res = 1;
        int pre = 1;
        int tmp = 0;
        for (int i = 3; i <= n ; i++) {
            tmp = res;
            res = (res + pre)%1000000007;
            pre = tmp;
        }
        return res;
    }
}
