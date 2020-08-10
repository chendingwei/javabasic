package com.datastructure.graph_di_weight;

import com.datastructure.queue.Queue;

public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private Queue<Edge>[] adj;

    public EdgeWeightedGraph(int v) {
        this.V = v;
        this.E = 0;
        this.adj = new Queue[v];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Edge>();
        }
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);
        adj[v].enqueue(e);
        adj[w].enqueue(e);
        E++;
    }

    public Queue<Edge> adj(int v){
        return adj[v];
    }

    public Queue<Edge> edges(){
        Queue<Edge> allEdges = new Queue<>();
        for(int v=0;v<V;v++){
            for (Edge e : adj(v)) {
                int w = e.other(v);
                if(w<v){
                    allEdges.enqueue(e);
                }
            }
        }
        return allEdges;
    }

}
