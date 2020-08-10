package com.datastructure.graph;

import com.datastructure.queue.Queue;
public class Graph {
    private final int V;
    private int E;
    private Queue<Integer>[] adj;
    
    public Graph(int V){
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];
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

    public void addEdge(int v,int w){
//        在无向图中，边是没有方向的，所以要让V和W出现在对方的邻接表中
        adj[v].enqueue(w);
        adj[w].enqueue(v);
        E++;
    }

    public Queue<Integer> adj(int v){
        return adj[v];
    }
}
