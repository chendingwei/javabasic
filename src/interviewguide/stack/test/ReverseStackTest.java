package interviewguide.stack.test;

import interviewguide.stack.ReverseStack;

public class ReverseStackTest {
    public static void main(String[] args) {
        ReverseStack s = new ReverseStack();
        s.getStack().push(1);
        s.getStack().push(2);
        s.getStack().push(3);
        s.getStack().push(4);
        s.getStack().push(5);
        s.getStack().push(6);

        s.reverse();

//        for (int i = 0; i <6 ; i++) {
//            System.out.println(s.getStack().pop());
//        }
    }
}
