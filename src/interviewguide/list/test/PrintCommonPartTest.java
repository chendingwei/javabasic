package interviewguide.list.test;

import interviewguide.list.PrintCommonPart;

import java.util.LinkedList;

public class PrintCommonPartTest {

    public static void main(String[] args) {
        LinkedList<Integer> arr1 = new LinkedList<>();
        LinkedList<Integer> arr2 = new LinkedList<>();

        for (int i = 0; i <10 ; i++) {
            arr1.add(i);
        }
        for (int i = 0; i <10 ; i+=2) {
            arr2.add(i);
        }

        PrintCommonPart printCommonPart = new PrintCommonPart(arr1, arr2);
        printCommonPart.printCommonPart();
    }
}
