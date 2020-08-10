package com.datastructure.graph_di;

import com.datastructure.graph.Graph;
import com.datastructure.queue.Queue;
import com.datastructure.stack.Stack;

public class DepthFirstOrder {
    private boolean[] marked;
    private Stack<Integer> reversePost;

    public DepthFirstOrder(Digraph g) {
        this.marked = new boolean[g.V()];
        this.reversePost = new Stack<Integer>();

        for(int v =0;v<g.V();v++){
            if(!marked[v]){
                dfs(g,v);
            }
        }
    }

    private void dfs(Digraph g, int v){
        marked[v] = true;
        for (Integer w : g.adj(v)) {
            if(!marked[w]) {
                dfs(g, w);
            }
        }
        reversePost.push(v);
    }

    public Stack<Integer> getReversePost(){
        return reversePost;
    }
}
