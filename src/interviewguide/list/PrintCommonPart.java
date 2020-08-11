package interviewguide.list;

import java.util.LinkedList;

public class PrintCommonPart {
    private LinkedList<Integer> arr1;
    private LinkedList<Integer> arr2;

    public PrintCommonPart(LinkedList<Integer> arr1, LinkedList<Integer> arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public void printCommonPart(){
        while ( !arr1.isEmpty() && !arr2.isEmpty()){
            if(arr1.peekFirst() <arr2.peekFirst()){
                arr1.pollFirst();
            }else if(arr1.peekFirst()>arr2.peekFirst()){
                arr2.peekFirst();
            }else {
                System.out.println(arr1.peekFirst());
                arr1.pollFirst();
                arr2.pollFirst();
            }
        }
    }
}
