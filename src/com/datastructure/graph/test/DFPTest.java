package com.datastructure.graph.test;

import com.datastructure.graph.DepthFirstPaths;
import com.datastructure.graph.Graph;
import com.datastructure.stack.Stack;

public class DFPTest {

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 2);
        g.addEdge(0, 1);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 4);
        g.addEdge(0, 5);

        DepthFirstPaths paths = new DepthFirstPaths(g, 0);

        Stack<Integer> path = paths.pathTo(4);
        StringBuilder str = new StringBuilder();
        for (Integer v : path) {
            str.append(v+"-");
        }
        str.deleteCharAt(str.length()-1);
        System.out.println(str);
    }
}
