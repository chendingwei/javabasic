package com.datastructure.graph.test;

import com.datastructure.graph.BreadthFirstSearch;
import com.datastructure.graph.DepthFirstSearch;
import com.datastructure.graph.Graph;

public class BFSTest {
    public static void main(String[] args) {
        Graph g = new Graph(13);
        g.addEdge(0, 6);
        g.addEdge(0, 5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(3, 4);
        g.addEdge(4, 6);

        g.addEdge(7, 8);

        g.addEdge(9, 10);
        g.addEdge(9, 11);
        g.addEdge(9, 12);
        g.addEdge(11, 12);


        BreadthFirstSearch sear = new BreadthFirstSearch(g, 0);

        int count = sear.getCount();
        System.out.println(count);

        boolean marked1 = sear.marked(5);
        boolean marked2 = sear.marked(7);
        System.out.println(marked1);
        System.out.println(marked2);
    }
}
