package interviewguide.list.test;

import interviewguide.list.ReverseList;

public class ReverseTest {

    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }

        list.toPrint();

        ReverseList.Node head = list.getHead();
        list.reverse();
        list.toPrint();
    }
}
