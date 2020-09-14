package basicalgorithm.sort.advancedsort;

import java.util.Arrays;

public class Heap {
    public void sort(int[] source){
        int[] heap = new int[source.length + 1];
        createHeap(source,heap);
        int N = heap.length-1;
        while (N != 1){
            int tmp = heap[1];
            heap[1] = heap[N];
            heap[N] = tmp;
            sink(heap,1,--N);
        }
        System.arraycopy(heap,1,source,0,source.length);
    }

    public void createHeap(int[] soutce, int[] heap){
        System.arraycopy(soutce,0,heap,1,soutce.length);
        for (int i = heap.length/2; i > 0 ; i--) {
            sink(heap,i,heap.length-1);
        }
    }

    public void sink(int[] heap, int target, int range){
        while (2*target <= range){
            int max;
            if(2*target +1 <= range){
                if(heap[2*target] > heap[2*target+1]){
                    max = 2*target;
                }else {
                    max = 2*target+1;
                }
            }else {
                max = 2*target;
            }

            if(heap[target] < heap[max]){
                int tmp = heap[target];
                heap[target] = heap[max];
                heap[max] = tmp;
                target = max;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] sources = {8,7,6,5,4,3,2,1};
        Heap heap = new Heap();
        heap.sort(sources);
        System.out.println(Arrays.toString(sources));
    }
}
