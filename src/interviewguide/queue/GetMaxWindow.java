package interviewguide.queue;

import java.util.LinkedList;

public class GetMaxWindow {
    private int[] arr;
    private int win;
    private int[] res;
    public GetMaxWindow(int[] arr, int win) {
        this.arr = arr;
        this.win = win;
        this.res = new int[arr.length-win+1];
    }

    public int[] getMaxWindow(){
        for (int i = 0; i <= arr.length-win ; i++) {
            int max = getMax(arr, i, win);
            res[i] = max;
        }
        return res;
    }

    public int getMax(int[] in,int start, int win){
        int max = in[start];
        for(int i=start;i<start+win-1;i++){
            max = Math.max(max,in[i+1]);
        }
        return max;
    }


    public int[] getMaxWindow(int[] arr,int w){
        LinkedList<Integer> qmax = new LinkedList<>();
        int index =0;
        for (int i = 0; i <arr.length ; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst() == i-w){
                qmax.pollFirst();
            }
            if(i>= w-1){
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

}
