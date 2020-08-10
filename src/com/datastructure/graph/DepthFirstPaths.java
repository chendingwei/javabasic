package com.datastructure.graph;

import com.datastructure.stack.Stack;

public class DepthFirstPaths {
    private boolean[] marked;
    private int s;
    private int[] edgeTo;

    public DepthFirstPaths(Graph g,int s){
        this.marked = new boolean[g.V()];
        this.s = s;
        this.edgeTo = new int[g.V()];

        dfs(g,s);
    }

    private void dfs(Graph g,int v){
        marked[v] = true;

        for (Integer w : g.adj(v)) {
            if(!marked[w]){
                //到达顶点w的最后一个顶点是v
                edgeTo[w] = v;
                dfs(g,w);
            }
        }
    }

    public boolean hasPathTo(int v){
        return marked[v];
    }

    public Stack<Integer> pathTo(int v){
        if(!hasPathTo(v)){
            return null;
        }
        Stack<Integer> path = new Stack<>();
        for(int x=v;x!=s;x=edgeTo[x]){
            path.push(x);
        }
        path.push(s);
        return path;
    }

}
