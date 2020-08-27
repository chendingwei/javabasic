package interviewguide.tree;

import java.util.LinkedList;

public class LevelTraversal {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.poll());
        }
    }
}