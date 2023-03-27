import edu.princeton.cs.algs4.Bag;

public class graph {

    private final int V;
    private Bag<Integer>[] adj;

    public graph(int V){
        this.V=V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v=0; v<V; v++)
            adj[v] = new Bag<Integer>();
    }

    public int V() {
        return V;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }


    public int degree(int v){
        int degree = 0;
        for (int w : adj(v))
            degree++;
        return degree;
    }


    public Iterable<Integer> adj(int v){
        return adj[v];
    }

}
