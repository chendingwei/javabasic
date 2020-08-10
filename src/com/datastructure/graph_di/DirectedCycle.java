package com.datastructure.graph_di;

import com.datastructure.queue.Queue;

public class DirectedCycle {

    private boolean[] marked;
    private boolean hasCycle;
    private boolean[] onStack;

    public DirectedCycle(Digraph g){
        this.marked = new boolean[g.V()];
        this.hasCycle = false;
        this.onStack = new boolean[g.V()];
        for (int v = 0; v < g.V(); v++) {
            if(!marked[v]){
                dfs(g,v);
            }
        }
    }

    private void dfs(Digraph g,int v){
        marked[v] = true;
        onStack[v] = true;
        for (Integer w : g.adj(v)) {
            if(!marked[w]){
                dfs(g,w);
            }
            if(onStack[w]){
                hasCycle = true;
                return;
            }
        }
        onStack[v] = false;
    }

    public boolean hasCycle(){
        return hasCycle;
    }
}
