package com.datastructure.graph.test;

import com.datastructure.graph.DepthFirstSearch;
import com.datastructure.graph.Graph;

public class Example {
    public static void main(String[] args) {
        Graph g = new Graph(20);
        g.addEdge(0, 1);
        g.addEdge(6, 9);
        g.addEdge(3, 8);
        g.addEdge(5, 11);
        g.addEdge(2, 12);
        g.addEdge(6, 10);
        g.addEdge(4, 8);


        DepthFirstSearch dsearch = new DepthFirstSearch(g, 9);
        boolean connected1 = dsearch.marked(10);
        boolean connected2 = dsearch.marked(8);

        System.out.println("10"+connected1);
        System.out.println("8"+connected2);
    }
}
