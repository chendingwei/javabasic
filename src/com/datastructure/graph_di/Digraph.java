package com.datastructure.graph_di;

import com.datastructure.queue.Queue;

public class Digraph {
    private final int V;
    private int E;
    private Queue<Integer>[] adj;

    public Digraph(int v) {
        this.V = v;
        this.E = 0;
        this.adj = new Queue[v];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();
        }
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int s,int e){
        adj[s].enqueue(e);
        E++;
    }

    public Queue<Integer> adj(int v){
        return adj[v];
    }

    public Digraph reverse(){
        Digraph digraph = new Digraph(V);
        for(int i =0;i<V;i++){
            for (Integer w : adj[i]) {
                digraph.addEdge(w,i);
            }
        }
        return digraph;
    }
}
