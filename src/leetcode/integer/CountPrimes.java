package leetcode.integer;

/*
204. 计数质数

统计所有小于非负整数 n 的质数的数量。

示例:

输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */

import java.util.Arrays;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for(int i=2;i*i< n;i++){
            if(primes[i]){
                for(int j =i*i; j<n; j += i){
                    primes[j] = false;
                }
            }
        }

        int count = 0;
        for(int i =2;i<n;i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}
