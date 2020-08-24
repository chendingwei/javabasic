package writtenexamination.threesixzero;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> arr = new LinkedList<>();
        for(int i=0;i<N;i++){
            arr.add(i+1);
        }

        for(int i=0;i<M;i++){
            int oper = sc.nextInt();
            if(oper == 1){
                operOne(arr);
            }
            if(oper == 2){
                operTwo(arr);
            }
        }

        while (arr.size() != 0){
            System.out.print(arr.remove(0) + " ");
        }
    }

    public static void operOne(List<Integer> list){
        Integer temp = list.remove(0);
        list.add(temp);
    }

    public static void operTwo(List<Integer> list){
        LinkedList<Integer> assist = new LinkedList<>();
        for(int i=0;i<list.size()-1;i+=2){
            assist.add(list.get(i+1));
            assist.add(list.get(i));
        }
        list = assist;
    }
}
