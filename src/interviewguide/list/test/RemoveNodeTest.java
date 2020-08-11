package interviewguide.list.test;

import interviewguide.list.RemoveNode;

public class RemoveNodeTest {
    public static void main(String[] args) {
        RemoveNode node = new RemoveNode();
        for (int i = 1; i <5 ; i++) {
            node.add(i);
        }

        node.toPrint();

        node.remove(3);
        node.toPrint();


    }
}
