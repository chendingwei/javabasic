package com.datastructure.graph_di.test;

import com.datastructure.graph_di.Digraph;
import com.datastructure.graph_di.TopiLogical;
import com.datastructure.stack.Stack;

public class TopoTest {
    public static void main(String[] args) {
        Digraph g = new Digraph(6);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.addEdge(1, 3);

        TopiLogical topo = new TopiLogical(g);

        Stack<Integer> order = topo.getOrder();
        StringBuilder str = new StringBuilder();
        for (Integer w : order) {
            str.append(w+"-");
        }
        str.deleteCharAt(str.length()-1);
        System.out.println(str);

    }
}
