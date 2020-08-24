package writtenexamination.threesixzero;

import java.util.Scanner;

public class NumOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }
        for (int i=0;i<M;i++){
            int oper = sc.nextInt();
            if(oper == 1){
                operOne(arr);
            }
            if(oper == 2){
                operTwo(arr);
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void operOne(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void operTwo(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
