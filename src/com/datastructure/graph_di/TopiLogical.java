package com.datastructure.graph_di;

import com.datastructure.stack.Stack;

public class TopiLogical {
    private Stack<Integer> order;

    public TopiLogical(Digraph g){
        DirectedCycle cycle = new DirectedCycle(g);
        if(!cycle.hasCycle()){
            DepthFirstOrder depthFirstOrder = new DepthFirstOrder(g);
            order = depthFirstOrder.getReversePost();
        }
    }

    public boolean isCycle(){
        return order==null;
    }

    public Stack<Integer> getOrder(){
        return order;
    }
}
