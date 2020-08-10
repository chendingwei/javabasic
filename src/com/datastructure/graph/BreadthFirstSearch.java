package com.datastructure.graph;

import com.datastructure.queue.Queue;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int count;
    private Queue<Integer> waitSearch;

    public BreadthFirstSearch(Graph G, int s) {
        this.marked = new boolean[G.V()];
        this.count =0;
        this.waitSearch = new Queue<Integer>();
        bfs(G,s);
    }

    private void bfs(Graph G, int v){
        marked[v] = true;
        waitSearch.enqueue(v);

        while (!waitSearch.isEmpty()){
            Integer w = waitSearch.dequeue();
            for (Integer n : G.adj(w)) {
                if(!marked[n]){
                   bfs(G,n);
                }
            }
        }
        count++;
    }

    public int getCount(){
        return count;
    }

    public boolean marked(int w){
        return marked[w];
    }
}
